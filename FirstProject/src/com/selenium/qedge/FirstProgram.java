package com.selenium.qedge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstProgram {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com"); 
	}

}
