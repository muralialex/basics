package ranjan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class ToolTip {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Tooltip")).click();
		Thread.sleep(10000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("age"))).build().perform();
		String text = driver.findElement(By.className("ui-tooltip-content")).getText();
		System.out.println(text);
		String attribute = driver.findElement(By.className("ui-tooltip-content")).getAttribute("class");
		System.out.println(attribute);
	}

}
