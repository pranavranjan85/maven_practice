package com.maven.practice;

import org.testng.annotations.Test;

public class PracticeMaven2 
{
	@Test
	public void PMIndia() {
		String url = System.getProperty("URL");
		String browser = System.getProperty("browser");
		String username = System.getProperty("USERNAME");
		String password = System.getProperty("PASSWORD");
		System.out.println("url of website is " +url );
		System.out.println(" In which browser you want to open the website " +browser );
		System.out.println("user name  is " +username );
		System.out.println("password  is " +password );
		
		
	}
	

}
