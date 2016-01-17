package edu.kwon.frmk.common.share.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * Utility for Java Date
 * @author eduseashell
 */
public class DateUtil {
	
	private static final String SPACE = " ";
	public static final String DEFAULT_DATE = "dd/MMM/yyyy";
	public static final String DEFAULT_TIME = "HH:mm:ss";
	public static final String DEFAULT_DATE_TIME = DEFAULT_DATE + SPACE + DEFAULT_TIME;
	
	private DateUtil() { }
	
	public static String format(Date date) {
		return format(date, DEFAULT_DATE);
	}
	
	public static String format(Date date, String format) {
		SimpleDateFormat df = new SimpleDateFormat(format);
		return df.format(date);
	}
	
	public static Date now() {
		return Calendar.getInstance().getTime();
	}
	
	public static Date addYear(Date date, int year) {
		return addByField(date, Calendar.YEAR, year);
	}
	
	public static Date addMonth(Date date, int month) {
		return addByField(date, Calendar.MONTH, month);
	}
	
	public static Date addDay(Date date, int day) {
		return addByField(date, Calendar.DAY_OF_YEAR, day);
	}
	
	private static Date addByField(Date date, int field, int value) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(field, value);
		return cal.getTime();
	}
}
