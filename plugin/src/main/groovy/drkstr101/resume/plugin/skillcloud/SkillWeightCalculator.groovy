package drkstr101.resume.plugin.skillcloud

import com.kennycason.kumo.WordFrequency

import drkstr101.resume.plugin.ResumeExtension
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

	ResumeExtension resume

	SkillWeightCalculator(ResumeExtension resume) {
		super()

		this.resume = resume
	}

	/**
	 * Returns a map containing every unique Skill transformed
	 * into a WeigthedSkill instance, and keyed by name
	 * 
	 * @return
	 */
	Collection<WordFrequency> calculateSkillWeights() {
		return this.resume.skillCache
				.collect([]) { String k, Skill v -> new WordFrequency(v.toString(), v.weight) }
				.sort { a, b -> a.frequency <=> b.frequency }
	}
}
