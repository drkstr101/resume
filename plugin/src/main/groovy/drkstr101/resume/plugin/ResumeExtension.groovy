/**
 * 
 */
package drkstr101.resume.plugin

import javax.inject.Inject

import org.gradle.api.NamedDomainObjectContainer
import org.gradle.api.model.ObjectFactory
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Nested
import org.gradle.api.tasks.Optional

import drkstr101.resume.plugin.model.Accomplishment
import drkstr101.resume.plugin.model.Employment
import drkstr101.resume.plugin.model.Skill

/**
 * @author Aaron R Miller
 *
 */
class ResumeExtension {

	final Map<String, Skill> skillCache = [:]

	void cache(SkillExtension model) {
		assert !skillCache.containsKey(model.name)

		// append children to the cache as the are created
		skillCache.put(model.name, model.toModel())
		model.children.all { SkillExtension skill ->
			cache(skill)
		}
	}

	@Input
	String fullName

	@Input
	String email

	@Optional
	@Input
	String address

	@Optional
	@Input
	String phone

	@Nested
	final NamedDomainObjectContainer<Accomplishment> accomplishments =
	objectFactory.domainObjectContainer(Accomplishment)

	@Nested
	final NamedDomainObjectContainer<SkillExtension> skills =
	objectFactory.domainObjectContainer(SkillExtension)

	@Nested
	final NamedDomainObjectContainer<Employment> employers =
	objectFactory.domainObjectContainer(Employment)

	@Nested
	final NamedDomainObjectContainer<Reference> references =
	objectFactory.domainObjectContainer(Reference)

	@Inject
	ObjectFactory getObjectFactory() {
		// Method body is ignored
		throw new UnsupportedOperationException()
	}

	ResumeExtension() {
		skills.all(this.&cache)
	}
}
