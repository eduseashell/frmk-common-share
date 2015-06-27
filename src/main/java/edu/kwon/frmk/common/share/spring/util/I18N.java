package edu.kwon.frmk.common.share.spring.util;

import java.util.Locale;

import org.springframework.context.MessageSource;

import edu.kwon.frmk.common.share.spring.context.AppContext;

/**
 * I18N Utils which uses the Spring messageSource
 * @author Bunlong Taing
 * @since 0.0.1
 * @version 0.0.1
 */
public class I18N {
	
	private static MessageSource messageSource;
	private static Locale defaultLocale;
	
	private I18N() {}
	
	/**
	 * Init the I18N messageSource and locale
	 */
	public static void init() {
		if (messageSource == null) {
			messageSource = (MessageSource) AppContext.getBean("messageSource");
			defaultLocale = Locale.ENGLISH;
		}
	}
	
	/**
	 * Set the locale of the properties to be loaded
	 * @param locale
	 */
	public static void setLocale(Locale locale) {
		I18N.defaultLocale = locale;
	}
	
	public static MessageSource getMessageSource() {
		return messageSource;
	}
	
	/**
	 * Get the translated string from the key/value in properties file
	 * with the specific language
	 * @param sourceMsg The key
	 * @return The translated value
	 */
	public static String string(String sourceMsg) {
		if (sourceMsg == null) return null;
		return getMessageSource().getMessage(sourceMsg, null, defaultLocale);
	}
	
	/**
	 * Get the translated string from the key/value in properties file
	 * with the specific language
	 * @param sourceMsg The key
	 * @param paramMgs The key params
	 * @return The translated value
	 */
	public static String string(String sourceMsg, String... paramMgs) {
		if (sourceMsg == null) return null;
		return getMessageSource().getMessage(sourceMsg, paramMgs, defaultLocale);
	}
	
	/**
	 * Get the translated string from the key/value in properties file
	 * with the specific language
	 * @param sourceMsg The key
	 * @param paramMgs The key params
	 * @return The translated value
	 */
	public static String string(String sourceMsg, Object... paramMgs) {
		if (sourceMsg == null) return null;
		return getMessageSource().getMessage(sourceMsg, paramMgs, defaultLocale);
	}

}
