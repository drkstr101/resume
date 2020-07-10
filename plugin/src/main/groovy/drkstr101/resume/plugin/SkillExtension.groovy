package drkstr101.resume.plugin

import javax.inject.Inject

import org.gradle.api.Named
import org.gradle.api.NamedDomainObjectContainer
import org.gradle.api.model.ObjectFactory

/**
 * @author Aaron R Miller
 *
 */
class SkillExtension implements Named {

	private final String name

	String getName() {
		return name
	}

	String label

	final NamedDomainObjectContainer<SkillExtension> children

	protected ObjectFactory getObjectFactory() {
		// Method body is ignored
		throw new UnsupportedOperationException()
	}

	@Inject
	SkillExtension(String name, ObjectFactory objectFactory) {
		this.name = name
		children = objectFactory.domainObjectContainer(SkillExtension)
	}
}
