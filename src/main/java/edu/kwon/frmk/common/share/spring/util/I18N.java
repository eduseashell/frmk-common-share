package edu.kwon.frmk.common.share.spring.util;

import java.io.Serializable;
import java.util.Locale;

import org.springframework.context.ApplicationContext;

import edu.kwon.frmk.common.share.spring.context.AppContext;

/**
 * I18N Utils which uses the Spring messageSource
 * @author eduseashell
 * @since 0.0.1
 * @version 0.0.1
 */
public final class I18N implements Serializable {

	private static final long serialVersionUID = 6588756159752419122L;
//	private static MessageSource messageSource;
	private static Locale defaultLocale;		// TODO i18n locale
	
	/**
	 * Set the locale of the properties to be loaded
	 * @param locale
	 */
	public static void setLocale(Locale locale) {
		I18N.defaultLocale = locale;
	}
	
	/**
	 * Get the translated string from the key/value in properties file
	 * with the specific language
	 * @param sourceMsg The key
	 * @return The translated value
	 */
	public static String string(String sourceMsg) {
		if (sourceMsg == null) return null;
		return getAppContext().getMessage(sourceMsg, null, defaultLocale);
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
		return getAppContext().getMessage(sourceMsg, paramMgs, defaultLocale);
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
		return getAppContext().getMessage(sourceMsg, paramMgs, defaultLocale);
	}
	
	private static ApplicationContext getAppContext() {
		return AppContext.getAppContext();
	}

}
