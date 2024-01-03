package ranjan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

class RelativeLocators {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/allstate/login.do");
		driver.manage().window().maximize();
		driver.findElement(RelativeLocator.with(By.className("textField"))
				.above(By.name("pwd"))).sendKeys("ranjan");
		Thread.sleep(1000);
		driver.findElement(RelativeLocator.with(By.name("pwd"))
				.above(By.id("keepLoggedInLabel"))).sendKeys("1234567890");
		Thread.sleep(1000);
		driver.findElement(RelativeLocator.with(By.id("keepLoggedInLabel"))
				.below(By.name("pwd"))).click();
		Thread.sleep(1000);
		driver.findElement(RelativeLocator.with(By.id("loginButton"))
				.toRightOf(By.id("keepLoggedInLabel"))).click();
		Thread.sleep(1000);
		driver.quit();
		
		
	}

}
