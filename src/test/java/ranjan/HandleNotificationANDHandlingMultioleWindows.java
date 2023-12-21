package ranjan;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class HandleNotificationANDHandlingMultioleWindows{
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[span[@class='allcircle circletwo']]")).click();
		Set<String> winids = driver.getWindowHandles();
		Iterator<String> itr = winids.iterator();
		String firstwind=itr.next();
		String secondwind = itr.next();
		driver.switchTo().window(secondwind);
		driver.findElement(By.id("filterText")).sendKeys("ranjan");
		driver.switchTo().window(firstwind);
		driver.findElement(By.xpath("(//input[@role='searchbox'])[1]")).sendKeys("Banglore");
		driver.quit();
		
		
	};

}


