/**
 *
 */
package drkstr101.resume.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.plugins.BasePlugin

/**
 * @author Aaron R Miller
 *
 */
public class ResumePlugin implements Plugin<Project> {

	public void apply(Project project) {

		// Ensure life-cycle tasks are available
		project.pluginManager.apply(BasePlugin)
		final ResumeExtension resume = project.extensions.create('resume', ResumeExtension)

		// Register task to generate Skill Cloud image
		final RenderSkillCloud skillCloud = project.tasks.create('skillCloud', RenderSkillCloud)
		skillCloud.group = "Build"
		skillCloud.modelProvider = new ResumeModelProvider(resume)

		final Task build = project.tasks.getByName('build')
		build.dependsOn(skillCloud)
	}
}
