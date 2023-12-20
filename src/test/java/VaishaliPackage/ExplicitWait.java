package VaishaliPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://online.actitime.com/vlavanya1");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("username")).sendKeys("vaishali.lavanyar@gmail.com");
	driver.findElement(By.name("pwd")).sendKeys("#neHQaA9");
	driver.findElement(By.cssSelector("input[name='remember']")).click();
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();	
	// Explicit Wait - to wait for the compose button to be click-able -- WEBDRIVER WAIT
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[div[contains(text(),'Tasks')]]")));
	// click on the compose button as soon as the "compose" button is visible
	driver.findElement(By.xpath("//a[div[contains(text(),'Tasks')]]")).click();
	Thread.sleep(5000);
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
	
	// -- FLUENTWAIT
	driver.findElement(By.id("username")).sendKeys("vaishali.lavanyar@gmail.com");
	driver.findElement(By.name("pwd")).sendKeys("#neHQaA9");
	driver.findElement(By.cssSelector("input[name='remember']")).click();
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();	
	Wait fwait = new FluentWait(driver)
			   .withTimeout(Duration.ofSeconds(60))
			   .pollingEvery(Duration.ofSeconds(10))
			   .ignoring(Exception.class);
	fwait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//a[div[contains(text(),'Tasks')]]")));
	fwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
	driver.findElement(By.id("username")).sendKeys("vaishali.lavanyar@gmail.com");
	
	Thread.sleep(5000);
	driver.quit();
	Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
}
}
