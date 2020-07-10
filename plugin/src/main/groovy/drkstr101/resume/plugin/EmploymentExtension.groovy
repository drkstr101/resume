package drkstr101.resume.plugin

import javax.inject.Inject

import org.gradle.api.Named
import org.gradle.api.model.ObjectFactory

import drkstr101.resume.plugin.model.EmploymentType

/**
 * @author Aaron R Miller
 *
 */
class EmploymentExtension implements Named {

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

	Set<String> accomplishments

	@Inject
	EmploymentExtension(String name, ObjectFactory objectFactory) {
		this.name = name
	}
}
