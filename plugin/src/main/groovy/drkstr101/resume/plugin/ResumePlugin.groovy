/**
 *
 */
package drkstr101.resume.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.plugins.BasePlugin
import org.gradle.api.tasks.TaskProvider

/**
 * @author Aaron R Miller
 *
 */
public class ResumePlugin implements Plugin<Project> {
	public void apply(Project project) {

		// Ensure life-cycle tasks are available
		project.pluginManager.apply(BasePlugin)

		final ResumeExtension resume = project.extensions.create('resume', ResumeExtension)

		// Add a task to validate all input data
		final TaskProvider<Task> validateResume = project.tasks.register("validateResumeModel") {
			doLast {
				assert resume.skillDataFile.exists()
				assert resume.employerDataFile.exists()
			}
		}

		project.tasks.getByName('check').dependsOn(validateResume)
	}
}
