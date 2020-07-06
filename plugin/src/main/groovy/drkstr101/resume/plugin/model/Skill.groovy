package drkstr101.resume.plugin.model

import org.gradle.api.DomainObjectSet
import org.gradle.api.tasks.Nested
import org.gradle.model.Managed

/**
 * @author Aaron R Miller
 *
 */
@Managed
interface Skill {

	String getName()
	void setName(String name)

	@Nested
	DomainObjectSet<Skill> getChildren()
}
