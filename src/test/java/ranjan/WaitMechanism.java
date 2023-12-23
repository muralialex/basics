package ranjan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

class WaitMechanism {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/allstate");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("ranjangp639@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("PnZGE9ZB");
		driver.findElement(By.xpath("(//a[div[contains(text(),'Login ')]])[1]")).click();
		// webdriverwait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='container_tasks']")));
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.id("logoutLink")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("logoutLink")));
		driver.findElement(By.id("username")).sendKeys("ranjangp639@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("PnZGE9ZB");
		driver.findElement(By.xpath("(//a[div[contains(text(),'Login ')]])[1]")).click();
		// fluentwait
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(10)).ignoring(Exception.class);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("container_tasks")));
		driver.findElement(By.id("container_tasks")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//div[contains(text(),'Add')])[1]")));
		driver.quit();

	}

}
