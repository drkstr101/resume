/**
 * 
 */
package drkstr101.resume.plugin
import org.gradle.testfixtures.ProjectBuilder

import drkstr101.resume.plugin.calc.SkillPointCalculator
import spock.lang.Specification

/**
 * @author Aaron R Miller
 *
 */
class SkillPointCalculatorTest extends Specification {

	def shouldCalculateBaseSkillPoints() {

		given:
		def project = ProjectBuilder.builder().build()
		def newInstance = project.objects.&newInstance

		ResumeExtension resume = newInstance(ResumeExtension)
		resume.skills << newInstance(SkillExtension, "ska")
		resume.skills << newInstance(SkillExtension, "skb")
		
		resume.accomplishments << newInstance(AccomplishmentExtension, "aca")
				.tap { skills = ['ska'] }
		
		resume.accomplishments << newInstance(AccomplishmentExtension, "acb")
				.tap { skills = ['skb'] }

		when:
		def provider = new ResumeModelProvider(resume)
		def calc = new SkillPointCalculator(provider.get()).calculate()

		then:
		assert calc != null
		assert !calc.skillPoints.isEmpty()
		assert calc.skillPoints.ska == 20
		assert calc.skillPoints.skb == 20
		assert calc.totalSkillPoints == 40
	}
}
