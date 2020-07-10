/**
 * 
 */
package drkstr101.resume.plugin.model

import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Nested
import org.gradle.api.tasks.Optional

import groovy.transform.Canonical
import groovy.transform.Immutable

/**
 * @author Aaron R Miller
 *
 */
@Canonical
class Resume {
	@Input String fullName
	@Input String email
	@Optional @Input String address
	@Optional @Input String phone
	@Nested Map<String, Skill> skills = [:]
	@Nested Map<String, Accomplishment> accomplishments = [:]
	@Nested Map<String, Employment> employers = [:]
	@Nested Map<String, Reference> references = [:]
}
