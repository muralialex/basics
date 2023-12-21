package ranjan;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class Miscelleanous {
	public static void main(String[] args) throws InterruptedException, IOException {
		// to open incognito window
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(3000);
		// window scroll
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)", "");
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//button[@class='btn btn-dark btn-lg btn-block rounded-0 text-left'])[1]")));
		Thread.sleep(3000);
		//zoom in and zoom out 
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("document.body.style.zoom = '2.0'");
		Thread.sleep(3000);
		executor.executeScript("document.body.style.zoom = '0.7'");
		//to kill the process
		driver.quit();
		Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
		
	}

}
