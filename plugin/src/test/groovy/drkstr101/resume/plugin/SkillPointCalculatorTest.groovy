/**
 * 
 */
package drkstr101.resume.plugin

import drkstr101.resume.plugin.model.Accomplishment
import drkstr101.resume.plugin.model.Resume
import drkstr101.resume.plugin.model.Skill
import spock.lang.Specification

/**
 * @author Aaron R Miller
 *
 */
class SkillPointCalculatorTest extends Specification {

	static def accomp(String name, String... skills) {
		new Accomplishment(name: name, skills: skills)
	}

	static def skill(String name, Skill... children) {
		def skill = new Skill(name: name, children: children)
		children.each { it.parent = skill }

		return skill
	}

	def shouldCalculateBaseSkillPoints() {

		given:
		def resume = new Resume()
		resume.skills = [
			ska: skill('ska'),
			skb: skill('skb', skill('skb_a')),
			skc: skill('skc', skill('skc_a', skill('skc_a_a')))
		]
		resume.accomplishments = [
			aca: accomp('aca', 'ska', 'skb_a'),
			acb: accomp('acb', 'ska', 'skb', 'skc_a_a')
		]

		when:
		def calc = new SkillPointCalculator(resume).calculate()

		then:
		assert calc != null
		assert calc.get('ska') == 1
		assert calc.get('skb') == 2
		assert calc.get('skb_a') == 1
		assert calc.get('skc') == 3
		assert calc.get('skc_a') == 2
		assert calc.get('skc_a_a') == 1
	}
}
