package edu.kwon.frmk.common.share.spring.util;

import edu.kwon.frmk.common.share.spring.context.AppContext;

/**
 * An utility class for I18N
 * @author Bunlong Taing
 *
 * @since Jul 4, 2015
 * @since 0.0.1
 * @version 0.0.1
 */
public final class I18NUtil {
	
	private static I18N i18n = AppContext.getBean(I18N.class);
	
	/**
	 * Get the translated string from the key/value in properties file
	 * with the specific language
	 * @param sourceMsg The key
	 * @return The translated value
	 */
	public static String string(String sourceMsg) {
		return getI18n().string(sourceMsg);
	}
	
	/**
	 * Get the translated string from the key/value in properties file
	 * with the specific language
	 * @param sourceMsg The key
	 * @param paramMgs The key params
	 * @return The translated value
	 */
	public static String string(String sourceMsg, String... paramMgs) {
		return getI18n().string(sourceMsg, paramMgs);
	}
	
	/**
	 * Get the translated string from the key/value in properties file
	 * with the specific language
	 * @param sourceMsg The key
	 * @param paramMgs The key params
	 * @return The translated value
	 */
	public static String string(String sourceMsg, Object... paramMgs) {
		return getI18n().string(sourceMsg, paramMgs);
	}

	/**
	 * Get I18N
	 * @return the i18n
	 */
	public static I18N getI18n() {
		return i18n;
	}

	/**
	 * Set I18N
	 * @param i18n the i18n to set
	 */
	public static void setI18n(I18N i18n) {
		I18NUtil.i18n = i18n;
	}

}
