package edu.kwon.frmk.common.share.spring.util;

import org.springframework.core.env.Environment;

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
public class AppConfig {
	
	private static Environment env = AppContext.getEnvironment();
	
	/**
	 * Get the configuration properties value from the key provided
	 * @param key
	 * 		A key in properties file
	 * @return
	 * 		A value in properties file which match the key provided
	 */
	public static String getConfigValue(String key) {
		return env.getProperty(key);
	}
	
	/**
	 * Get the configuration properties value from the key provided. if not found, the default value is used
	 * @param key
	 * 		A key in properties file
	 * @return
	 * 		A value in properties file which match the key provided
	 */
	public static String getConfigValue(String key, String defaultValue) {
		return env.getProperty(key, defaultValue);
	}
	
	/**
	 * Get the configuration properties value from the key provided
	 * and return the type of the class provided
	 * @param key
	 * @param clazz
	 * @return
	 */
	public static <T> T getConfigValue(String key, Class<T> clazz) {
		return env.getProperty(key, clazz);
	}

}
