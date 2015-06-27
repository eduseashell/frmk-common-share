package edu.kwon.frmk.common.share.spring.init;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;

import edu.kwon.frmk.common.share.spring.context.AppContext;
import edu.kwon.frmk.common.share.spring.util.I18N;

/**
 * App Initializer
 * Start up a web app, start init resources here
 * @author Bunlong Taing
 * @since 0.0.1
 * @version 0.0.1
 */
public class AppInitializer implements WebApplicationInitializer {

	/**
	 * Start up init resources
	 */
	public void onStartup(ServletContext arg0) throws ServletException {
		AppContext.init();		// Init application context
		I18N.init();			// Init I18N
	}

}
