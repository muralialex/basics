package ranjan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class MouseAction {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/");
		driver.findElement(By.linkText("Droppable")).click();
		WebElement iframe = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(iframe);
		Actions action = new Actions(driver);
		action.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")), driver.findElement(By.xpath("//div[@id='droppable']"))).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Draggable")).click();
		
		
		
	}

}
