package murali;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class HandleMultipleBrowser {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.partialLinkText("BUSES")).click();
		Set<String> windIds = driver.getWindowHandles();
		Iterator<String> itr = windIds.iterator();
		String fWind= itr.next();
		String sWind= itr.next();
		driver.switchTo().window(sWind);
		driver.findElement(By.xpath("//a[span[contains(text(),'Hotels')]]")).click();
		windIds.clear();
		windIds = driver.getWindowHandles();
		itr = windIds.iterator();
		System.out.println(windIds);
		fWind= itr.next();
		sWind= itr.next();
		String tWind= itr.next();
		driver.switchTo().window(tWind);
		driver.findElement(By.id("filterText")).sendKeys("Arokya");
		Thread.sleep(2000);
		driver.switchTo().window(sWind);
		driver.findElement(By.id("departFrom")).sendKeys("Bangalore");
		Thread.sleep(2000);
		driver.switchTo().window(fWind);
		driver.findElement(By.xpath("//p-autocomplete[contains(@aria-label,'From')]//input[@role='searchbox']")).sendKeys("Calcutta");
		driver.quit();
		
	
	}
}
