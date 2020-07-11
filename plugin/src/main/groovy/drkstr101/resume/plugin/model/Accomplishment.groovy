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
	String name
	AccomplishmentType type
	Calendar startDate
	Calendar endDate
	String description
	Collection<Reference> references = []
	Collection<Skill> skills = []
}
