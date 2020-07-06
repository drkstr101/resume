/**
 * 
 */
package drkstr101.resume.plugin

import org.gradle.api.DomainObjectSet
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Nested
import org.gradle.api.tasks.Optional

import drkstr101.resume.plugin.model.Accomplishment
import drkstr101.resume.plugin.model.Employment
import drkstr101.resume.plugin.model.Reference
import drkstr101.resume.plugin.model.Skill

/**
 * @author Aaron R Miller
 *
 */
interface ResumeExtension {

	@Input
	String getFullName()
	void setFullName(String fullName)

	@Optional
	@Input
	String getAddress()
	void setAddress(String address)

	@Input
	String getEmail()
	void setEmail(String email)

	@Optional
	@Input
	String getPhone()
	void setPhone(String phone)

	@Nested
	DomainObjectSet<Accomplishment> getAccomplishments()

	@Nested
	DomainObjectSet<Employment> getEmployers()

	@Nested
	DomainObjectSet<Reference> getReferences()

	@Nested
	DomainObjectSet<Skill> getSkills()
}
