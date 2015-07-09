package edu.kwon.frmk.common.share.spring.context;

import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

public class AppContext {
	
//	private static final String MAIN_APP_CONFIG_CONTEXT = "applicant-main-context.xml";
	private static ApplicationContext springContext;
	
	private AppContext() { }
	
//	public static void init() {
//		if (springContext == null) {
//			springContext = new GenericXmlApplicationContext(new String[] {MAIN_APP_CONFIG_CONTEXT});
//		}
//	}
	
	public static <T> T getBean(Class<T> clazz) {
		return getAppContext().getBean(clazz);
	}
	
	public static Object getBean(String name) {
		return getAppContext().getBean(name);
	}
	
	public static <T> T getBean(String name, Class<T> clazz) {
		return getAppContext().getBean(name, clazz);
	}
	
	/**
	 * Get Spring Environment
	 * @return
	 */
	public static Environment getEnvironment() {
		return getAppContext().getEnvironment();
	}
	
	/**
	 * Return String ApplicationContext
	 * @return
	 */
	public static ApplicationContext getAppContext() {
		return springContext;
	}
	
	/**
	 * Set Spring ApplicationContext
	 * @param context
	 */
	public static void setAppContext(ApplicationContext context) {
		springContext = context;
	}

}
