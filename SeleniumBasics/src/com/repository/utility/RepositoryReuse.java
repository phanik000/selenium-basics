package com.repository.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class RepositoryReuse {
	File f;
	Properties p;
	FileInputStream fis;

	public RepositoryReuse() throws Exception {
		f = new File("./Repository/Config.property");
		fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String firefoxPath() throws Exception {
		String s = p.getProperty("FirefoxDriver");
		return s;

	}

	public String urlPath() {
		String s1 = p.getProperty("url");
		return s1;

	}

}