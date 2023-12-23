package IndhuPackage3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleToolTip {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.findElement(By.xpath("//li//a[text()='Tooltip']")).click();
	driver.findElement(By.linkText("Tooltip")).click();
	Thread.sleep(10000);
	System.out.println("Thread added so a break will help to move the cursor out of the place");
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
	Actions action1 = new Actions(driver);
	//action1.moveToElement(driver.findElement(By.xpath("//body//p[4]//input[@id='age']"))).build().perform();
	action1.moveToElement(driver.findElement(By.id("age"))).build().perform();
	WebElement text1= driver.findElement(By.className("ui-tooltip-content"));
	// Get the Tool Tip Text
	String toolTipTxt = text1.getText();
	//Assert.assertEquals("We ask for your age only for statistical purposes.", toolTipTxt);
	System.out.println(toolTipTxt);
	String toolTipAttribute = text1.getAttribute("class");
	String attribute1 = driver.findElement(By.className("ui-tooltip-content")).getAttribute("class");
	System.out.println(toolTipAttribute);
	System.out.println(attribute1);
	
	
}
}

