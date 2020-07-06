/**
 * 
 */
package drkstr101.resume.plugin

import javax.inject.Inject

import org.gradle.api.NamedDomainObjectContainer
import org.gradle.api.model.ObjectFactory

import drkstr101.resume.plugin.model.Accomplishment
import drkstr101.resume.plugin.model.Employment
import drkstr101.resume.plugin.model.Skill

/**
 * @author Aaron R Miller
 *
 */
class ResumeExtension {

	String fullName

	String email

	String address

	String phone

	final NamedDomainObjectContainer<Accomplishment> accomplishments =
			objectFactory.domainObjectContainer(Accomplishment)

	final NamedDomainObjectContainer<Skill> skills =
			objectFactory.domainObjectContainer(Skill)

	final NamedDomainObjectContainer<Employment> employers =
			objectFactory.domainObjectContainer(Employment)

	final NamedDomainObjectContainer<Reference> references =
			objectFactory.domainObjectContainer(Reference)

	@Inject
	ObjectFactory getObjectFactory() {
		// Method body is ignored
		throw new UnsupportedOperationException();
	}
}
