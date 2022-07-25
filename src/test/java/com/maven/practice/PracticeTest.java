package com.maven.practice;

import org.testng.annotations.Test;

public class PracticeTest 
{
	@Test
	public void practiceTest() {
		System.out.println("tyss------>>test1");
	}
	
	@Test
	public void practiceTest2() {
		System.out.println("tyss------>>test2");
	}
	
	@Test
	public void practiceTest3() {
		System.out.println("tyss------>>test3");
		
		System.out.println("Helloo   hii every one");
		// changing  in branch
		//changing in eclipse
	}
	@Test
	public void parameterOfJenkins()
	{
		String browser = System.getProperty("browser");
		String url = System.getProperty("URL");
	}
	@Test
	public void gitPractice()
	{
		System.out.println("hii git");
	}

}
