package drkstr101.resume.plugin.model

import groovy.transform.Canonical

@Canonical
class Accomplishment {
	String name
	AccomplishmentType type
	String description
	Collection<Reference> references
	Collection<Skill> skills
}
