package ranjan;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class ScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/allstate/login.do");
		driver.manage().window().maximize();
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destfile = new File("C:\\MyData\\GIT Codes\\Repos\\basics\\src\\test\\java\\ranjan\\ScreenShots\\actitime.png");
		FileUtils.copyFile(srcfile, destfile);
		driver.navigate().to("https://www.amazon.in/");
		File newfile = driver.findElement(By.tagName("html")).getScreenshotAs(OutputType.FILE);
		File dest1file= new File(System.getProperty("user.dir")+"\\src\\\\test\\java\\ranjan\\ScreenShots\\amazon.png");
		FileUtils.copyFile(newfile, dest1file);
		// to take element level ScreenShot
		File elementscreenshot=driver.findElement(By.id("nav-main")).getScreenshotAs(OutputType.FILE);
		File eledestfile = new File(System.getProperty("user.dir")+"\\src\\\\test\\java\\ranjan\\ScreenShots\\amazon1.png");
		FileUtils.copyFile(elementscreenshot, eledestfile);
		
		
		

	}

}

