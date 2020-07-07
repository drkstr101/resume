package drkstr101.resume.plugin.model

import org.gradle.api.tasks.Input

/**
 * @author Aaron R Miller
 *
 */
class Reference {

	private final String name

	@Input
	String getName() {
		return name
	}

	@Input
	String description

	@Input
	URI uri

	Reference(String name) {
		this.name = name
	}
}
