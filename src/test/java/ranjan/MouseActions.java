package ranjan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class MouseActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		Actions action = new Actions(driver);
		action.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")),driver.findElement(By.xpath("//div[@id='droppable']"))).build().perform();
		Thread.sleep(2000);
        driver.switchTo().defaultContent();
        driver.switchTo().window(driver.getWindowHandle());
        driver.findElement(By.linkText("Draggable")).click();
		
	}
	

}
