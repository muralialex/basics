package VaishaliPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Auto_Suggestions {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://in.search.yahoo.com/?fr2=inr");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@placeholder='Search the web']")).sendKeys("Hello");
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@role='listbox']")));
	//List of Auto suggestions for the word "Hello"
	List<WebElement> elements = driver.findElements(By.xpath("//span[@class='sa-item-title']"));
	for(WebElement e:elements) {
		System.out.println(e.getText());
	}
	//Click the first element in the Auto Suggestions 
	driver.findElement(By.xpath("//li[@role='option'][span[contains(text(),'kitty')]]")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Search the web']")).clear();
	driver.findElement(By.xpath("//input[@placeholder='Search the web']")).sendKeys("Hello");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@role='listbox']")));
	
	System.out.println("-------------------------");
	//print the 5th element in the Auto Suggestion
	String element_5 = driver.findElement(By.xpath("(//span[@class='sa-item-title'])[5]")).getText();
	System.out.println(element_5);
	driver.findElement(By.xpath("(//span[@class='sa-item-title'])[5]")).click();
	
	Thread.sleep(2000);
	driver.quit();
}
}
