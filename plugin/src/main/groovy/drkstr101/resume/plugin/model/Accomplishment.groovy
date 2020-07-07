package drkstr101.resume.plugin.model

import javax.inject.Inject

import org.gradle.api.model.ObjectFactory
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Optional

/**
 * @author Aaron R Miller
 *
 */
class Accomplishment {

	private final String name

	@Input
	String getName() {
		return name
	}

	@Optional
	@Input
	String label

	@Input
	AccomplishmentType type

	@Optional
	@Input
	String description

	@Inject
	protected ObjectFactory getObjectFactory() {
		// Method body is ignored
		throw new UnsupportedOperationException()
	}

	Accomplishment(String name) {
		this.name = name
	}
}
