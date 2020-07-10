/**
 * 
 */
package drkstr101.resume.plugin.model

import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.Nested
import org.gradle.api.tasks.Optional

import groovy.transform.Canonical
import groovy.transform.Immutable



/**
 * @author Aaron R Miller
 *
 */
@Canonical
class Skill {
	@Input String name
	@Optional @Input String label
	@Input Integer weight = 1
	@Internal Skill parent
	@Nested Collection<Skill> children = []
}
