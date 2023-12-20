package murali;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*
Window Scroll ==
Kill a Process/ChromeDriver ==
Zoom In and Zoom Out ==
Incognito Window ==
*/
class Miscellaneous {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		// Incognito
		options.addArguments("incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Zoom IN Zoom OUT
//		WebElement html = driver.findElement(By.tagName("html"));
//		html.sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
//		Thread.sleep(3000);
//		html.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("document.body.style.zoom = '70%'");
		Thread.sleep(2000);
		executor.executeScript("document.body.style.zoom = '120%'");
		Thread.sleep(2000);
		//Window Scroll 
		executor.executeScript("window.scrollBy(0,2000)", "");
		Thread.sleep(2000);
		executor.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//*[contains(text(),'Platforms')]")));
		
		//Kill a Process/ChromeDriver
		driver.quit();
		Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
	}
}
