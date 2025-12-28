package com.day4;

class Config {
	public static final String APP_NAME = "MyApp";
	public static final String VERSION = "1.6.0";
	public static final int MAX_USERS = 100;
}

public class Q5ConfigStaticConstants {

	public static void main(String[] args) {
		System.out.println("APP_NAME: " + Config.APP_NAME);
		System.out.println("VERSION: " + Config.VERSION);
		System.out.println("MAX_USERS: " + Config.MAX_USERS);
	}

}
