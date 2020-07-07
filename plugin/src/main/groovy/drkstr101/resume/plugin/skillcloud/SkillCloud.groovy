/**
 * 
 */
package drkstr101.resume.plugin.skillcloud

import javax.inject.Inject

import org.gradle.api.DefaultTask
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Nested
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction

import drkstr101.resume.plugin.ResumeExtension

/**
 * @author Aaron R Miller
 *
 */
class SkillCloud extends DefaultTask {

	@Nested
	final Property<ResumeExtension> resume = objectFactory.property(ResumeExtension)

	@OutputFile
	final RegularFileProperty outputFile = objectFactory.fileProperty()

	@Inject
	protected ObjectFactory getObjectFactory() {
		// Method body is ignored
		throw new UnsupportedOperationException()
	}

	@TaskAction
	void run() {
		final ResumeExtension resume = this.resume.get()
		
		def skillCalculator = new SkillWeightCalculator(resume)
		def wordFrequencies = skillCalculator.calculateSkillWeights()
		def wordCloudGenerator = new SkillCloudGenerator(wordFrequencies)
		
		wordFrequencies.each { println it }

		// render the "Skill Cloud" image at the output location
		wordCloudGenerator.generatePngImage(this.outputFile.get().asFile)
	}
}
