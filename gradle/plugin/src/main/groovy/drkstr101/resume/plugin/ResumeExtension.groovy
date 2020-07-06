/**
 * 
 */
package drkstr101.resume.plugin

/**
 * @author Aaron R Miller
 *
 */
class ResumeExtension {

	String fullName

	String email

	String address

	String phone

	/**
	 * Append new Accomplishment to the Resume model.
	 * 
	 * @param name
	 * @param config
	 */
	void accomplishment(String name, @DelegatesTo(AccomplishmentDelegate) Closure config) {
		use(AccomplishmentDelegate) {
			// TODO ...
		}
	}

	/**
	 * Append new Employment to the resume model.
	 * 
	 * @param name
	 * @param config
	 */
	void employment(String name, @DelegatesTo(EmploymentDelegate) Closure config) {
		use(EmploymentDelegate) {
			// TODO ...
		}
	}

	/**
	 * Append new Reference to the resume model.
	 * 
	 * @param name
	 * @param config
	 */
	void reference(String name, @DelegatesTo(ReferenceDelegate) Closure config) {
		use(ReferenceDelegate) {
			// TODO ...
		}
	}

	/**
	 * Append new Skill to the resume model.
	 * 
	 * @param name
	 * @param config
	 */
	void skill(String name, @DelegatesTo(SkillDelegate) Closure config) {
		use(SkillDelegate) {
			// TODO ...
		}
	}
}
