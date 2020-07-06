package drkstr101.resume.plugin.model

import javax.inject.Inject

import org.gradle.api.model.ObjectFactory

/**
 * @author Aaron R Miller
 *
 */
class Accomplishment {

	private final String name

	String getName() {
		return name;
	}

	String label

	AccomplishmentType type

	String description

	@Inject
	protected ObjectFactory getObjectFactory() {
		// Method body is ignored
		throw new UnsupportedOperationException();
	}

	Accomplishment(String name) {
		this.name = name
	}
}
