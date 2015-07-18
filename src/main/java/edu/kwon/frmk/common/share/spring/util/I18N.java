package edu.kwon.frmk.common.share.spring.util;

import java.io.Serializable;
import java.util.Locale;

import javax.annotation.PostConstruct;

import org.springframework.context.MessageSource;

/**
 * I18N Utils which uses the Spring messageSource
 * @author Bunlong Taing
 * @since 0.0.1
 * @version 0.0.1
 */
public final class I18N implements Serializable {

	private static final long serialVersionUID = 6588756159752419122L;
	private static MessageSource messageSource;
	private static Locale defaultLocale;
	
	/**
	 * Init default locale
	 */
	@PostConstruct
	public void postConstruct() {
		if (defaultLocale == null) {
			defaultLocale = Locale.ENGLISH;
		}
	}
	
	/**
	 * Set the locale of the properties to be loaded
	 * @param locale
	 */
	public void setLocale(Locale locale) {
		I18N.defaultLocale = locale;
	}
	
	/**
	 * Get the translated string from the key/value in properties file
	 * with the specific language
	 * @param sourceMsg The key
	 * @return The translated value
	 */
	public String string(String sourceMsg) {
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
	public String string(String sourceMsg, String... paramMgs) {
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
	public String string(String sourceMsg, Object... paramMgs) {
		if (sourceMsg == null) return null;
		return getMessageSource().getMessage(sourceMsg, paramMgs, defaultLocale);
	}
	
	/**
	 * Get MessageSource
	 * @return
	 */
	public MessageSource getMessageSource() {
		return messageSource;
	}
	
	/**
	 * Set MessageSource
	 * @param messageSource
	 */
	public void setMessageSource(MessageSource messageSource) {
		I18N.messageSource = messageSource;
	}

}
