/**
 * 
 */
package drkstr101.resume.plugin.model

import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Nested
import org.gradle.api.tasks.Optional

import groovy.transform.Canonical

/**
 * @author Aaron R Miller
 *
 */
@Canonical
class Accomplishment {
	@Input String name
	@Input AccomplishmentType type
	@Input Calendar startDate
	@Optional @Input Calendar endDate
	@Input String description
	@Nested Set<Reference> references = []
	@Nested Set<Skill> skills = []
}
