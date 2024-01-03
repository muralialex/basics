package ranjan;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class Calenders {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//a[@class='close']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		driver.findElement(By.xpath("(//div[text()='BOM'])[1]")).click();
		driver.findElement(By.xpath("//label[@for='toCity']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'DEL')]")).click();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@class='DayPicker-Month']//div[contains(@class,'today')]//p[position()=1]")));
		driver.findElement(By.xpath("//div[@class='DayPicker-Month']//div[contains(@class,'today')]//p[position()=1]"))
				.click();
		wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-cy='returnArea']")));
		driver.findElement(By.xpath("//div[@data-cy='returnArea']")).click();
		driver.findElement(By.xpath(
				"//div[@class='DayPicker-Month'][position()=2]//div[@class='DayPicker-Week'][1]//div[@class='DayPicker-Day'][1]//p"))
				.click();
		driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();
		wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'OKAY')]")));
		driver.findElement(By.xpath("//span[contains(@class,'bgProperties  overlayCrossIcon icon20')]")).click();
		String text = driver.findElement(By.xpath("(//div[@class='listingCard '])[1]//span[contains(text(),'Air')]")).getText();
		System.out.println(text);
		
		
		//
		

	}

}
