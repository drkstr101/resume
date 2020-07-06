package drkstr101.resume.plugin.model

import javax.inject.Inject

import org.gradle.api.NamedDomainObjectContainer
import org.gradle.api.model.ObjectFactory
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Nested

/**
 * @author Aaron R Miller
 *
 */
class Skill {

	private final String name

	String getName() {
		return name;
	}

	String label

	@Nested
	final NamedDomainObjectContainer<Skill> skills = objectFactory.domainObjectContainer(Skill)

	@Inject
	protected ObjectFactory getObjectFactory() {
		// Method body is ignored
		throw new UnsupportedOperationException();
	}


	Skill(String name) {
		this.name = name
	}
}
