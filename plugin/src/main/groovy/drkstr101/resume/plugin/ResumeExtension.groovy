/**
 * 
 */
package drkstr101.resume.plugin

import javax.inject.Inject

import org.gradle.api.NamedDomainObjectContainer
import org.gradle.api.model.ObjectFactory

import drkstr101.resume.plugin.model.Skill

/**
 * @author Aaron R Miller
 *
 */
class ResumeExtension {

	final Map<String, Skill> skillCache = [:]

	String fullName

	String email

	String address

	String phone

	final NamedDomainObjectContainer<AccomplishmentExtension> accomplishments

	final NamedDomainObjectContainer<SkillExtension> skills

	final NamedDomainObjectContainer<EmploymentExtension> employers

	final NamedDomainObjectContainer<ReferenceExtension> references

	@Inject
	ResumeExtension(ObjectFactory objectFactory) {
		accomplishments = objectFactory.domainObjectContainer(AccomplishmentExtension)
		skills = objectFactory.domainObjectContainer(SkillExtension)
		employers =
				objectFactory.domainObjectContainer(EmploymentExtension)
		references =
				objectFactory.domainObjectContainer(Reference)
	}
}
