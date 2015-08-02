package com.chase.web.qa.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BrowserConfig extends Properties {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BrowserConfig() {
		try {
			InputStream is = this.getClass().getClassLoader().getResourceAsStream("browser.properties");
			super.load(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}
