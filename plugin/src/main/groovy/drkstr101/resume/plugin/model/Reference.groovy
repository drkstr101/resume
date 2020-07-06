package drkstr101.resume.plugin.model

import org.gradle.api.tasks.Input
import org.gradle.model.Managed

/**
 * @author Aaron R Miller
 *
 */
@Managed
interface Reference {

	@Input
	String getDescripton()
	void setDescripton(String descripton)

	@Input
	URI getUri()
	void setUri(URI uri)
}
