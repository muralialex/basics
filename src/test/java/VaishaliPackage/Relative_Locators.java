package VaishaliPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Relative_Locators {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.browserstack.com/");
	
	//ABOVE - Assume - “Get A Demo” button element does not have any unique identifier, so in that case we can locate “Automate” element and then use above()
	WebElement automate = driver.findElement(By.xpath("(//span/h4[contains(text(),'Automate')])[1]"));
	WebElement getADemo = driver.findElement(RelativeLocator.with(By.tagName("button")).above(automate));
	getADemo.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@class=\"tingle-modal__closeIcon\"]")).click();
	Thread.sleep(2000);
	
	//BELOW - assume Live bar does not have any unique identifier, so we are locating Get Started free
	WebElement textSection = driver.findElement(By.cssSelector("div.text-section p"));
	WebElement getAdemo = driver.findElement(RelativeLocator.with(By.tagName("button")).below(textSection));
	getAdemo.click();
	Thread.sleep(2000);
	
	driver.quit();
	
}
}
