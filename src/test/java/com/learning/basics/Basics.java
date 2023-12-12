package com.learning.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Basics {
	static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.manage().window().minimize();
		Thread.sleep(1000);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.close();
	}
}
