/**
 * 
 */
package drkstr101.resume.plugin.calculator

import static drkstr101.resume.plugin.calculator.CalculatorUtil.*

import drkstr101.resume.plugin.model.Accomplishment
import drkstr101.resume.plugin.model.Resume
import drkstr101.resume.plugin.model.Skill

/**
 * @author Aaron R Miller
 *
 */
class SkillPointCalculator {
	
	static final int SCALE = 10

	private final Map<String, Integer> _skillPoints = [:]

	public Map<String, Integer> getSkillPoints() {
		return _skillPoints
	}

	private int _totalSkillPoints


	public int getTotalSkillPoints() {
		return _totalSkillPoints
	}

	private final Resume _resume

	/**
	 * @param model
	 */
	SkillPointCalculator(Resume resume) {
		_resume = resume
	}


	/**
	 * Calculates all relevant skill point totals and 
	 * caches the result. This may be accomplished 
	 * through multiple passes through the Resume model.
	 * 
	 * @return
	 */
	SkillPointCalculator calculate() {
		// println "Calculating skill points..."

		//initialize each skill with a base value of SCALE
		Map<String, Integer> baseSkillPoints = _resume.skillsByName.collectEntries { key, val ->
			[key, SCALE]
		}

		_totalSkillPoints = baseSkillPoints.values().sum()
		
		// println "---- BASE SKILL POINTS ----"
		// println baseSkillPoints

		_resume.accomplishments.each { Accomplishment accomplishment ->
			// add SCALE to skill points every time it is referenced in an accomplishment
			Map<String, Integer> addedSkillPoints = accomplishment.skills.collectEntries { Skill skill ->
				[skill.name, SCALE]
			}

			if(!addedSkillPoints.isEmpty()) {
				// println("---- APPENDING SKILL POINTS ----")
				// println addedSkillPoints
				
				_totalSkillPoints += addedSkillPoints.values().sum()

				baseSkillPoints.putAll(addSkillPoints(baseSkillPoints, addedSkillPoints))
			}
		}

		// println "---- ENDING SKILL POINTS ----"
		// println baseSkillPoints

		_skillPoints.putAll(baseSkillPoints)

		return this
	}

}
