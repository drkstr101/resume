package drkstr101.resume.plugin

import javax.inject.Inject

import org.gradle.api.Named
import org.gradle.api.model.ObjectFactory

/**
 * @author Aaron R Miller
 *
 */
class ReferenceExtension implements Named {

	private final String name

	String getName() {
		return name
	}

	String description

	@Inject
	ReferenceExtension(String name, ObjectFactory objectFactory) {
		this.name = name
	}
}
