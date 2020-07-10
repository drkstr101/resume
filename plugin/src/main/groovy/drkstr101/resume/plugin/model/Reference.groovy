package drkstr101.resume.plugin.model

import org.gradle.api.tasks.Input

import groovy.transform.Canonical

/**
 * @author Aaron R Miller
 *
 */
@Canonical
class Reference {
	@Input String name
}
