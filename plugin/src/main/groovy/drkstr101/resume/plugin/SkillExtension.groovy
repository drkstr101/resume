package drkstr101.resume.plugin

import javax.inject.Inject

import org.gradle.api.NamedDomainObjectContainer
import org.gradle.api.model.ObjectFactory
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Nested
import org.gradle.api.tasks.Optional

import drkstr101.resume.plugin.model.Skill

/**
 * @author Aaron R Miller
 *
 */
class SkillExtension {

	private final String name

	@Input
	String getName() {
		return name
	}

	@Optional
	@Input
	String label

	@Nested
	final NamedDomainObjectContainer<SkillExtension> children = objectFactory.domainObjectContainer(SkillExtension)

	@Inject
	protected ObjectFactory getObjectFactory() {
		// Method body is ignored
		throw new UnsupportedOperationException()
	}

	SkillExtension(String name) {
		this.name = name
	}

	Skill toModel() {
		return new Skill(
				parent: null,
				name: name,
				label: label,
				children: children.collect { it.toModel() }
		)
	}
	
	@Override
	String toString() {
		return "Skill(${name})"
	}
}
