package murali;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

class WaitUsage {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/cisco2");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("unique.muralistl@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("DgjTEH99");
		driver.findElement(By.id("loginButton")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[div[contains(text(),'Tasks')]]")));
		driver.findElement(By.xpath("//a[div[contains(text(),'Tasks')]]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
		driver.findElement(By.linkText("Logout")).click();
		
		Wait fwait = new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofSeconds(10))
				.ignoring(Exception.class);
		fwait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//a[div[contains(text(),'Tasks')]]")));
		fwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		driver.findElement(By.id("username")).sendKeys("unique.muralistl@gmail.com");
	}
}
