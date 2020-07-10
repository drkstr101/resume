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
class Employment {
	@Input String name
	@Input String type
	@Input String title
	@Input Calendar startDate
	@Optional @Input Calendar endDate
	@Optional @Input String employer
	@Optional @Input String description
	@Nested Set<Accomplishment> accomplishments = []
}
