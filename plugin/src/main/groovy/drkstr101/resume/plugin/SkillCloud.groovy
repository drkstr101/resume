/**
 * 
 */
package drkstr101.resume.plugin

import javax.inject.Inject

import org.gradle.api.DefaultTask
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.Provider
import org.gradle.api.tasks.Nested
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction

import drkstr101.resume.plugin.model.Resume

/**
 * @author Aaron R Miller
 *
 */
class SkillCloud extends DefaultTask {

	@Nested Provider<Resume> resume

	@OutputFile final RegularFileProperty outputFile

	@Inject
	SkillCloud(ObjectFactory objectFactory) {
		outputFile = objectFactory.fileProperty()
	}

	@TaskAction
	void run() {
		def resume = this.resume.get()
		def calculator = new SkillPointCalculator(resume).calculate()
		
		//		def skillCalculator = new SkillWeightCalculator(resume)
		//		def wordFrequencies = skillCalculator.calculateSkillWeights()
		//		def wordCloudGenerator = new SkillCloudGenerator(wordFrequencies)
		//
		//		wordFrequencies.each { println it }
		//
		//		// render the "Skill Cloud" image at the output location
		//		wordCloudGenerator.generatePngImage(this.outputFile.get().asFile)
	}
}
