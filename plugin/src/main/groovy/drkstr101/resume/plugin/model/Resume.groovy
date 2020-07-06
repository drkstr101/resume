/**
 * 
 */
package drkstr101.resume.plugin.model

import groovy.transform.Canonical

/**
 * @author Aaron R Miller
 *
 */
@Canonical
class Resume {
	String fullName
	String address
	String email
	String phone
	Collection<Accomplishment> accomplishments
	Collection<Employment> employers
	Collection<Reference> references
	Collection<Skill> skills
}
