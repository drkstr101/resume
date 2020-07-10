/**
 *
 */
package drkstr101.resume.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.plugins.BasePlugin
import org.gradle.api.provider.Provider

import drkstr101.resume.plugin.model.Resume

/**
 * @author Aaron R Miller
 *
 */
public class ResumePlugin implements Plugin<Project> {

	public void apply(Project project) {

		// Ensure life-cycle tasks are available
		project.pluginManager.apply(BasePlugin)
		final Provider<Resume> resume =
				new ResumeModelProvider(project.extensions.create('resume', ResumeExtension))

		// Register task to generate Skill Cloud image
		final SkillCloud skillCloud = project.tasks.create('skillCloud', SkillCloud)
		skillCloud.resume = resume

		final Task build = project.tasks.getByName('build')
		build.dependsOn(skillCloud)
	}
}
