/**
 * 
 */
package drkstr101.resume.plugin

import org.gradle.api.internal.provider.AbstractMinimalProvider
import org.gradle.internal.UncheckedException

import drkstr101.resume.plugin.model.Accomplishment
import drkstr101.resume.plugin.model.Employment
import drkstr101.resume.plugin.model.Reference
import drkstr101.resume.plugin.model.Resume
import drkstr101.resume.plugin.model.Skill

/**
 * @author Aaron R Miller
 *
 */
class ResumeModelProvider extends AbstractMinimalProvider<Resume> {

	private final ResumeExtension resume
	private final Map<String, Skill> skillsByName = [:]
	private final Map<String, Reference> referencesByName = [:]
	private final Map<String, Skill> accomplishmentsByName = [:]
	private final Map<String, Skill> employersByName = [:]


	/**
	 * @param resume
	 */
	public ResumeModelProvider(ResumeExtension resume) {
		super()
		this.resume = resume
	}

	@Override
	public Class<Resume> getType() {
		return Resume.class
	}

	@Override
	protected Value<? extends Resume> calculateOwnValue(ValueConsumer consumer) {
		try {
			// Build model cache
			resume.skills.forEach(this.&visitSkill)
			resume.references.forEach(this.&visitReference)
			resume.accomplishments.forEach(this.&visitAccomplishment)
			resume.employers.forEach(this.&visitEmployment)

			final Resume resume = new Resume(
					fullName: resume.fullName,
					email: resume.email,
					address: resume.address,
					phone: resume.phone,
					skills: skillsByName,
					references: referencesByName,
					accomplishments: accomplishmentsByName,
					employers: employersByName
			)

			// return wrapped model value
			return Value.of(resume)
		} catch(Exception e) {
			UncheckedException.throwAsUncheckedException(e)
		}
	}

	protected Skill visitSkill(SkillExtension skill, Skill parent = null) {
		def name = skill.name
		
		if(skillsByName.containsKey(name)) {
			throw new RuntimeException("Skill ${name} already exists.")
		}

		def model = new Skill(name: name, parent: parent)
		model.children = skill.children.collect {
			visitSkill(it, model)
		}

		return skillsByName.put(name, model)
	}

	protected Skill visitReference(ReferenceExtension reference) {
		def name = reference.name
		
		// assert incorrect api usage
		assert !referencesByName.containsKey(name)
		
		def model = new Reference(name: name)
		
		return referencesByName.put(name, model)
	}

	protected Skill visitAccomplishment(AccomplishmentExtension accomplishment) {
		def name = accomplishment.name

		// assert incorrect api usage
		assert !accomplishmentsByName.containsKey(name)

		def skills = skillsByName(accomplishment.skills)
		def references = referencesByName(accomplishment.references)
		def model = new Accomplishment(
				name: name,
				type: accomplishment.type,
				startDate: accomplishment.startDate,
				endDate: accomplishment.endDate,
				description: accomplishment.description,
				references: references,
				skills: skills
		)

		return accomplishmentsByName.put(name, model)
	}

	protected Skill visitEmployment(EmploymentExtension employment) {
		def name = employment.name
		
		// assert incorrect api usage
		assert !employersByName.containsKey(name)
		
		def accomplishments = accomplishmentsByName(employment.accomplishments)
		def model = new Employment(name: name,
				type: employment.type,
				title: employment.title,
				startDate: employment.startDate,
				endDate: employment.endDate,
				employer: employment.employer,
				description: employment.description,
				accomplishments: accomplishments
		)
		
		return employersByName.put(name, model)
	}

	protected Set<Skill> skillsByName(Set<String> skillNames) {
		return skillNames.collect { skillsByName.get(it) }
	}
	
	protected Set<Reference> referencesByName(Set<String> referenceNames) {
		return referenceNames.collect { referencesByName.get(it) }
	}
	
	protected Set<Accomplishment> accomplishmentsByName(Set<String> accomplishmentNames) {
		return accomplishmentNames.collect { accomplishmentsByName.get(it) }
	}
}
