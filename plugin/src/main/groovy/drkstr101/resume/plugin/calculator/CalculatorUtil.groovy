/**
 * 
 */
package drkstr101.resume.plugin.calculator

/**
 * @author Aaron R Miller
 *
 */
class CalculatorUtil {

	static Map<String, Integer> mergeSkillPoints(Closure fn, Map<String, Integer>... mapEntries) {
		return mapEntries*.keySet().sum().collectEntries { k ->
			[k, mapEntries.findAll{ it.containsKey k }*.get(k).inject(fn)]
		}
	}

	static Map<String, Integer> addSkillPoints(Map<String, Integer>... mapEntries) {
		return mergeSkillPoints({ a, b -> a + b }, mapEntries)
	}
}
