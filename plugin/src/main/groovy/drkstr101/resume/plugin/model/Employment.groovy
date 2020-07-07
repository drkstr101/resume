package drkstr101.resume.plugin.model

/**
 * @author Aaron R Miller
 *
 */
class Employment {

	private final String name

	String getName() {
		return name
	}

	String title

	String employer

	EmploymentType type

	String description

	Calendar startDate

	Calendar endDate

	Employment(String name) {
		this.name = name
	}
}
