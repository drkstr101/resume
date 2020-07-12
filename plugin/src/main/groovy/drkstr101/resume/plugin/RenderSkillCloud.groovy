/**
 * 
 */
package drkstr101.resume.plugin

import java.awt.Color
import java.awt.Dimension

import javax.inject.Inject

import org.gradle.api.DefaultTask
import org.gradle.api.file.ProjectLayout
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.Property
import org.gradle.api.provider.Provider
import org.gradle.api.provider.ProviderFactory
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction

import com.kennycason.kumo.CollisionMode
import com.kennycason.kumo.WordCloud
import com.kennycason.kumo.WordFrequency
import com.kennycason.kumo.bg.RectangleBackground
import com.kennycason.kumo.font.scale.LinearFontScalar
import com.kennycason.kumo.palette.ColorPalette

import drkstr101.resume.plugin.calc.SkillPointCalculator
import drkstr101.resume.plugin.model.Resume
import drkstr101.resume.plugin.model.Skill

/**
 * @author Aaron R Miller
 *
 */
class RenderSkillCloud extends DefaultTask {

	static String displayNameFor(Skill skill) {
		return skill.label? skill.label :
				skill.name.split('_').collect({ it.capitalize() }).join(" ")
	}

	static List<WordFrequency> toWordFrequencies(Resume resume, Map<String, Integer> skillPoints) {
		return skillPoints.collect([], { key, val ->
			new WordFrequency(displayNameFor(resume.skillsByName.get(key)), val)
		}).sort({ it.frequency }).reverse()
	}


	static final DEFAULT_IMAGE_WIDTH = 640

	static final DEFAULT_IMAGE_HEIGHT = 480

	@Input final Property<Integer> imageWidth

	@Input final Property<Integer> imageHeight

	@Input final Provider<Map<String, Integer>> skillPoints

	@OutputFile final RegularFileProperty imageOutputFile

	@OutputFile final RegularFileProperty textOutputFile

	@Internal Provider<Resume> modelProvider

	@Internal SkillPointCalculator _calculator


	@Inject
	RenderSkillCloud(ObjectFactory objectFactory, ProviderFactory providerFactory, ProjectLayout layout) {

		imageOutputFile = objectFactory.fileProperty()
		imageOutputFile.convention(layout.buildDirectory.file('skillcloud/skillcloud.png'))

		textOutputFile = objectFactory.fileProperty()
		textOutputFile.convention(layout.buildDirectory.file('skillcloud/skillcloud.txt'))

		imageWidth = objectFactory.property(Integer)
		imageWidth.convention(DEFAULT_IMAGE_WIDTH)

		imageHeight = objectFactory.property(Integer)
		imageHeight.convention(DEFAULT_IMAGE_WIDTH)

		skillPoints = providerFactory.provider {
			if(_calculator == null) {
				_calculator = new SkillPointCalculator(modelProvider.get()).calculate()
			}

			return _calculator.skillPoints
		}
	}

	@TaskAction
	void run() {
		// println "Generating skill cloud..."

		def skillPoints = this.skillPoints.get()
		def wordFrequencies = toWordFrequencies(modelProvider.get(), skillPoints)
		def dimension = new Dimension(imageWidth.get(), imageHeight.get())

		def wordCloud = new WordCloud(dimension, CollisionMode.RECTANGLE)
		wordCloud.padding = 0
		wordCloud.background = new RectangleBackground(dimension)
		wordCloud.colorPalette = new ColorPalette(Color.RED, Color.GREEN, Color.YELLOW, Color.BLUE)
		wordCloud.fontScalar = new LinearFontScalar(10, 40)
		wordCloud.build(wordFrequencies)

		// println "---- USING WORD FREQUENCIES ----"
		// wordFrequencies.each { println it }
		//wordFrequencies.each { "${it.frequency}: ${it.word}" }

		textOutputFile.get().asFile.withWriter { Writer writer ->
			wordFrequencies.each { writer.write("${it.frequency}: ${it.word}\n") }
		}

		// Generate skill cloud image
		this.imageOutputFile.get().asFile.withOutputStream { os ->
			wordCloud.writeToStreamAsPNG(os)
		}
	}
}
