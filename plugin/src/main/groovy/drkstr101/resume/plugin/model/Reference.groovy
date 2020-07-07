package drkstr101.resume.plugin.model

/**
 * @author Aaron R Miller
 *
 */
class Reference {

	private final String name

	String getName() {
		return name
	}

	String description

	URI uri

	Reference(String name) {
		this.name = name
	}
}
