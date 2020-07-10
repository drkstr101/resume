package drkstr101.resume.plugin

import javax.inject.Inject

import org.gradle.api.Named
import org.gradle.api.model.ObjectFactory

import drkstr101.resume.plugin.model.AccomplishmentType

/**
 * @author Aaron R Miller
 *
 */
class AccomplishmentExtension implements Named {

	private final String name

	String getName() {
		return name
	}

	AccomplishmentType type

	String description

	Calendar startDate

	Calendar endDate

	Set<String> references = []
	
	Set<String> skills = []

	@Inject
	AccomplishmentExtension(String name, ObjectFactory objectFactory) {
		this.name = name
	}
}
