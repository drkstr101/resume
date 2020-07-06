package drkstr101.resume.plugin.model

import groovy.transform.Canonical

@Canonical
class Skill {
	String name
	Skill parent
}
