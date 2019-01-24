package com.selenium.qedge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchGmail {

	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
	}

}
