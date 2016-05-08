/**
 * Author :
 */
package utility;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * @author Omkar
 *
 */
public class MyProjectProperties {
	private static final String APPLICATION_BUNDLE_NAME = "properties.Application"; 
	private static final String SYSTEM_BUNDLE_NAME = "properties.System";
	private static final String DEFAULT = "value not found!!!";

	private static final ResourceBundle APPLICATION_RESOURCE_BUNDLE = ResourceBundle
			.getBundle(APPLICATION_BUNDLE_NAME);
	
	private static final ResourceBundle SYSTEM_RESOURCE_BUNDLE = ResourceBundle
	.getBundle(SYSTEM_BUNDLE_NAME);

	MyProjectProperties() {
	}

	private static String getSystemProperties(String key) {
		try {
			return SYSTEM_RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return null;
		}
	}
	
	private static String getApplicationProperties(String key) {
		try {
			return APPLICATION_RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return null;
		}
	}
	
	/**
	 * Description : It is single interfacing method to look up properties.
	 * 				It will look up properties file one by one. 
	 * Input : Property key
	 * Output : Property Value
	 */
	public static String getValue(String key){
		return (null != getSystemProperties(key))?
				getSystemProperties(key):((null != getApplicationProperties(key))?
						getApplicationProperties(key):getDEFAULT());
	}

	/**
	 * @return the dEFAULT
	 */
	public static String getDEFAULT() {
		return DEFAULT;
	}
}
