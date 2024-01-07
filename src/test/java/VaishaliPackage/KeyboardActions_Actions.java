package VaishaliPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions_Actions {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/key_presses");
	driver.manage().window().maximize();
	Actions action = new Actions(driver);
	action.sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(2000);
	action.sendKeys(Keys.SHIFT).build().perform();
	Thread.sleep(2000);
	action.sendKeys("K").build().perform();
	Thread.sleep(2000);
	
	driver.navigate().to("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_textarea");
	driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
	driver.findElement(By.xpath("//textarea[@id='w3review']")).click();
	action.keyDown(Keys.CONTROL);
	action.sendKeys("A");
	action.keyUp(Keys.CONTROL);
	action.build().perform();
	Thread.sleep(2000);
	
	action.keyDown(Keys.CONTROL);
	action.sendKeys("C");
	action.keyUp(Keys.CONTROL);
	action.build().perform();
	Thread.sleep(2000);
	
	action.sendKeys(Keys.DELETE);
	action.build().perform();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//textarea[@id='w3review']")).click();
	action.keyDown(Keys.CONTROL);
	action.sendKeys("V");
	action.keyUp(Keys.CONTROL);
	action.build().perform();
	Thread.sleep(2000);
	

	driver.quit();
}
}
