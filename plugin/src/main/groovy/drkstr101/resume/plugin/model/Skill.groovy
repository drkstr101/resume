/**
 * 
 */
package drkstr101.resume.plugin.model

import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.Nested
import org.gradle.api.tasks.Optional

import groovy.transform.Canonical



/**
 * @author Aaron R Miller
 *
 */
@Canonical
class Skill {

	@Internal
	Skill parent

	@Input
	String name

	@Optional
	@Input
	String label

	@Nested
	Collection<Skill> children

	@Override
	String toString() {
		return label? label : name.split("_")
				.collect({ it.capitalize() })
				.join(" ")
	}
}
