package com.tweetapp.utils;

import java.io.FileInputStream;

import java.sql.Connection;
import java.sql.DriverManager;

import java.util.Properties;

public class DbConnectUtil {
	private static final String DB_DRIVER_CLASS = "driver.class.name";
	private static final String DB_USERNAME = "db.username";
	private static final String DB_PASSWORD = "db.password";
	private static final String DB_URL = "db.url";

	private static Connection connection = null;
	private static Properties properties = null;
	static {
		try {
			properties = new Properties();
			properties.load(new FileInputStream("src/db.properties"));
			Class.forName(properties.getProperty(DB_DRIVER_CLASS));
			connection = DriverManager.getConnection(properties.getProperty(DB_URL),
					properties.getProperty(DB_USERNAME), properties.getProperty(DB_PASSWORD));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return connection;
	}

}
