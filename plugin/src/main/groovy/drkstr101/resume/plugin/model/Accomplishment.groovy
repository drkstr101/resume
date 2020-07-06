package drkstr101.resume.plugin.model

import org.gradle.api.DomainObjectSet
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Nested
import org.gradle.model.Managed

/**
 * @author Aaron R Miller
 *
 */
@Managed
interface Accomplishment {
	
	@Input
	String getName()
	void setName(String name)
	
	@Input
	AccomplishmentType getType()
	void setType(AccomplishmentType type)
	
	@Input
	String getDescription()
	void setDescription(String description)
	
	@Nested
	DomainObjectSet<Reference> getReferences()
	
	@Nested
	DomainObjectSet<Skill> getSkills()
}
