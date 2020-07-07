/**
 * 
 */
package drkstr101.resume.plugin.skillcloud

import java.awt.Color
import java.awt.Dimension

import com.kennycason.kumo.CollisionMode
import com.kennycason.kumo.WordCloud
import com.kennycason.kumo.WordFrequency
import com.kennycason.kumo.bg.RectangleBackground
import com.kennycason.kumo.font.scale.FontScalar
import com.kennycason.kumo.font.scale.LinearFontScalar
import com.kennycason.kumo.palette.ColorPalette

/**
 * @author Aaron R Miller
 *
 */
class SkillCloudGenerator {

	static final Integer DEFAULT_IMG_WIDTH = 640

	static final Integer DEFAULT_IMG_HEIGHT = 480

	static final ColorPalette DEFAULT_COLOR_PALETTE = new ColorPalette(new Color(0x182226), new Color(0x418AB7), new Color(0x285059), new Color(0x062B5B))

	static final FontScalar DEFAULT_FONT_SCALAR = new LinearFontScalar(10, 60)

	static final Color DEFAULT_BG_COLOR = new Color(0xF2F2F2)

	private final List<WordFrequency>  wordFrequencies

	SkillCloudGenerator(List<WordFrequency> wordFrequencies) {
		this.wordFrequencies = wordFrequencies
	}

	void writePng(final File outputFile) {
		
		println "Generating Skill Cloud..."
		wordFrequencies.each { println it }

		final Dimension dimension = new Dimension(DEFAULT_IMG_WIDTH, DEFAULT_IMG_HEIGHT)

		// Configure a new WordCloud instance
		final WordCloud wordCloud = new WordCloud(dimension, CollisionMode.RECTANGLE)
		wordCloud.padding = 0
		wordCloud.background = new RectangleBackground(dimension)
		wordCloud.backgroundColor = DEFAULT_BG_COLOR
		wordCloud.colorPalette = DEFAULT_COLOR_PALETTE
		wordCloud.fontScalar = DEFAULT_FONT_SCALAR
		wordCloud.build(wordFrequencies)

		outputFile.withOutputStream(wordCloud.&writeToStreamAsPNG)
	}
}
