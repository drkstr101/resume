package drkstr101.resume.plugin.model

import groovy.transform.Canonical

@Canonical
class Employment {
	String title
	String employer
	EmploymentType type
	String description
	Calendar startDate
	Calendar endDate
	Collection<Skill> skills
}
