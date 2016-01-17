package edu.kwon.frmk.common.share.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Number to String utility
 * @author eduseashell
 */
public class NumberUtil {
	
	private NumberUtil() { }
	
	public static String toString(final Integer value) {
		return toString(value, StringUtils.EMPTY);
	}
	
	public static String toString(final Integer value, final String defaultValue) {
		return value != null ? value.toString() : defaultValue;
	}
	
	public static String toString(final Long value) {
		return toString(value, StringUtils.EMPTY);
	}
	
	public static String toString(final Long value, final String defaultValue) {
		return value != null ? value.toString() : defaultValue;
	}

}
