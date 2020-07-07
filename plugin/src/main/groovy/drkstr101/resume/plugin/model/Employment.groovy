package drkstr101.resume.plugin.model

import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Optional

/**
 * @author Aaron R Miller
 *
 */
class Employment {

	private final String name

	@Input
	String getName() {
		return name
	}

	@Input
	String title

	@Input
	String employer

	@Input
	EmploymentType type

	@Optional
	@Input
	String description

	@Input
	Calendar startDate

	@Optional
	@Input
	Calendar endDate

	Employment(String name) {
		this.name = name
	}
}
