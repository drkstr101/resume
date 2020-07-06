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
interface Employment {

	@Input
	String getTitle()
	void setTitle(String title)

	@Input
	String getEmployer()
	void setEmployer(String employer)

	@Input
	EmploymentType getType()
	void setType(EmploymentType type)

	@Input
	String getDescription()
	void setDescription(String description)

	@Input
	Calendar getStartDate()
	void setStartDate(Calendar startDate)

	@Input
	Calendar getEndDate()
	void setEndDate(Calendar endDate)

	@Nested
	DomainObjectSet<Skill> getSkills()
}
