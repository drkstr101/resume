/**
 * 
 */
package drkstr101.resume.plugin

import drkstr101.resume.plugin.model.Accomplishment
import drkstr101.resume.plugin.model.Resume
import drkstr101.resume.plugin.model.Skill

/**
 * @author Aaron R Miller
 *
 */
class SkillPointCalculator {
	
	static Map mergeWith(Closure fn, Map... maps) {
		maps*.keySet().sum().collectEntries{k->
			[k, maps.findAll{it.containsKey k}*.get(k).inject(fn)]
		}
	}

	private Map<String, Integer> _skillPointsByName = [:]
	
	private Map<String, Integer> _accomplishmentPoints = [:]

	private final Resume resume

	/**
	 * @param model
	 */
	SkillPointCalculator(Resume resume) {
		this.resume = resume
	}

	/**
	 * Calculates all relevant skill point totals and 
	 * caches the result. This is accomplished through
	 * multiple passes through the Resume model.
	 * 
	 * **Pass 1**
	 * Sum up the base points for each Skill in the model.
	 * Each unique Still starts with a base value of 1, 
	 * plus 1 for each node in its descendants.
	 * 
	 * **Pass 2*
	 * Add one additional point each time a skill is
	 * referenced in an accomplishment.
	 * 
	 * @return
	 */
	SkillPointCalculator calculate() {

		def addPoints = { a, b -> a + b }

		// Pass 1
		resume.skills.each { k, v -> walkAndSumBaseSkillPoints(v) }

		// Pass 2
		// TODO calculate additional metrics on accomplishments
		_accomplishmentPoints = resume.accomplishments.inject([:]) { memo, key, val ->
			def skillPoints = val.skills.collectEntries { k -> [(k): 1] }
			mergeWith(addPoints, memo, skillPoints)
		}

		return this
	}

	int get(String skillName) {
		return _skillPointsByName.get(skillName) ?: 0
	}

	protected int walkAndSumBaseSkillPoints(Skill model) {
		def name = model.name
		
		// assert correct API usage
		assert !_skillPointsByName.containsKey(name)
		
		int skillPoints = 1 + (model.children.sum({ walkAndSumBaseSkillPoints(it) }) ?: 0)

		// Mutate calculation results
		_skillPointsByName.put(model.name, skillPoints)

		return skillPoints
	}
}
