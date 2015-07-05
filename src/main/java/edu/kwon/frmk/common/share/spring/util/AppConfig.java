package edu.kwon.frmk.common.share.spring.util;

import java.util.Properties;

import edu.kwon.frmk.common.share.spring.context.AppContext;

/**
 * AppConfig: Load the application configuration properties file
 * and provides static method call for getting the value from the key provided
 * or a specific key method.
 * @author Bunlong Taing
 *
 * @since Jul 5, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
public final class AppConfig {
	
	private static Properties pros = AppContext.getBean("pros", Properties.class);
	
	/**
	 * Get the properties value from the key provided
	 * @param key
	 * 		A key in properties file
	 * @return
	 * 		A value in properties file which match the key provided
	 */
	public static String getProperties(String key) {
		return pros.getProperty(key);
	}
	
	/**
	 * Get the properties value from the key provided. if not found, the default value is used
	 * @param key
	 * 		A key in properties file
	 * @return
	 * 		A value in properties file which match the key provided
	 */
	public static String getProperties(String key, String defaultValue) {
		return pros.getProperty(key, defaultValue);
	}

}
