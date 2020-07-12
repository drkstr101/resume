package drkstr101.resume.plugin.skillcloud;

import java.awt.Dimension

import com.kennycason.kumo.CollisionMode
import com.kennycason.kumo.WordCloud;
import com.kennycason.kumo.WordFrequency;
import com.kennycason.kumo.bg.RectangleBackground
import com.kennycason.kumo.font.scale.LinearFontScalar
import com.kennycason.kumo.palette.ColorPalette

public class WordCloudFactory {

	static WordCloud create(final List<WordFrequency> wordFrequencies, final Dimension dimension) {
		final WordCloud wordCloud = new WordCloud(dimension, CollisionMode.RECTANGLE)
		wordCloud.padding = 1
		wordCloud.background = new RectangleBackground(dimension)
		wordCloud.backgroundColor = EquidistantColorPalette.BG_COLOR
		wordCloud.colorPalette = new ColorPalette(EquidistantColorPalette.getColors(3))
		wordCloud.fontScalar = new LinearFontScalar(8, 32)
		wordCloud.build(wordFrequencies)
		
		return wordCloud
	}
}
