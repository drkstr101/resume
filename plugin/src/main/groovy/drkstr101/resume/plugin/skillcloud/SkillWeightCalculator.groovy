package drkstr101.resume.plugin.skillcloud

import com.kennycason.kumo.WordFrequency

import drkstr101.resume.plugin.model.Accomplishment
import drkstr101.resume.plugin.model.Skill

/**
 * @author Aaron R Miller
 * 
 * Calculates the weigthed value of each referenced Skill in
 * all listed accomplishments. The base weight value is 1 per
 * occurrence of the listed skill, and plus 1 to each of the
 * parent skills if any.
 * 
 * TODO Implement adjusted weight algorithm...
 */
class SkillWeightCalculator {

	Collection<Skill> skills

	Collection<Accomplishment> accomplishments

	SkillWeightCalculator(Collection<Skill> skills, Collection<Accomplishment> accomplishments) {
		super()

		this.skills = skills
		this.accomplishments = accomplishments
	}

	/**
	 * Returns a map containing every unique Skill transformed
	 * into a WeigthedSkill instance, and keyed by name
	 * 
	 * @return
	 */
	Iterable<WordFrequency> calculate() {
		return this.skills
				.collect { new WordFrequency(it.toString(), 1) }
				.sort { a, b -> a.frequency <=> b.frequency }
	}
}
