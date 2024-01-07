package VaishaliPackage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_DoubleClick {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver= new ChromeDriver();
	
	//Launch the Application Under Test (AUT)
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	
	// Right click t	he button to launch right click menu options
	Actions action = new Actions(driver);
	WebElement link_rightclick = driver.findElement(By.cssSelector(".context-menu-one"));
	action.contextClick(link_rightclick).perform();
	// Click on Edit link on the displayed menu options
	WebElement element = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
	element.click();
	// Accept the alert displayed
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	
	WebElement link_doubleclick =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	action.doubleClick(link_doubleclick).perform();
	//Switch to the alert box and click on OK button
	Alert alert = driver.switchTo().alert();
	System.out.println("Alert Text\n" +alert.getText());
	alert.accept();
	Thread.sleep(3000);
	
	driver.quit();
}
}
