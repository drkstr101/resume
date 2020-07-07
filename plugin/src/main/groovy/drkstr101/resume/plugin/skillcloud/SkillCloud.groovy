/**
 * 
 */
package drkstr101.resume.plugin.skillcloud

import javax.inject.Inject

import org.gradle.api.DefaultTask
import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Nested
import org.gradle.api.tasks.TaskAction

import drkstr101.resume.plugin.ResumeExtension

/**
 * @author Aaron R Miller
 *
 */
class SkillCloud extends DefaultTask {
	
	@Nested
	final Property<ResumeExtension> resume = objectFactory.property(ResumeExtension)
	
	@Inject
	protected ObjectFactory getObjectFactory() {
		// Method body is ignored
		throw new UnsupportedOperationException();
	}
	
	@TaskAction
	void run() {
		final ResumeExtension resume = this.resume.get()
		assert resume != null
	}
}
