package VaishaliPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class MouseOptions_Droppable {
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.linkText("Droppable")).click();
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
	WebElement from = driver.findElement(By.xpath("//div[@id='draggable']"));//Element which needs to drag.  
	WebElement to = driver.findElement(By.xpath("//div[@id='droppable']"));//Element on which need to drop.
	Actions act = new Actions(driver);//Using Action class for drag and drop.
	act.dragAndDrop(from, to).build().perform();//Dragged and dropped.	
	
	Thread.sleep(2000);
    driver.switchTo().defaultContent();
    driver.switchTo().window(driver.getWindowHandle());
    driver.quit();
	Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
}
}
