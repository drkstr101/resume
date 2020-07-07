/**
 * 
 */
package drkstr101.resume.plugin.skillcloud

import javax.inject.Inject

import org.gradle.api.DefaultTask
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.ListProperty
import org.gradle.api.tasks.Nested
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction

import drkstr101.resume.plugin.model.Accomplishment
import drkstr101.resume.plugin.model.Skill

/**
 * @author Aaron R Miller
 *
 */
class SkillCloud extends DefaultTask {

	@Nested
	final ListProperty<Accomplishment> accomplishments = objectFactory.listProperty(Accomplishment)

	@Nested
	final ListProperty<Skill> skills = objectFactory.listProperty(Skill)

	@OutputFile
	final RegularFileProperty outputFile = objectFactory.fileProperty()

	@Inject
	protected ObjectFactory getObjectFactory() {
		// Method body is ignored
		throw new UnsupportedOperationException()
	}

	@TaskAction
	void run() {
		def skillCalculator = new SkillWeightCalculator(skills.get(), accomplishments.get())
		def wordCloudGenerator = new SkillCloudGenerator(skillCalculator.calculate())

		// render the "Skill Cloud" image at the output location
		wordCloudGenerator.writePng(this.outputFile.get().asFile)
	}
}
