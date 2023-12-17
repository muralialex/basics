package ranjan;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class HandlingMultipleElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("document.body.style.zoom = '0.67'");
	    Thread.sleep(3000);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   List<WebElement> elements = driver.findElements(By.xpath("//div[@id='nav-xshop']/a[position()<=15]"));
	   for(WebElement element :elements) {
		   System.out.println("text :"+element.getText());
		   System.out.println("Attribute is :"+element.getAttribute("data-csa-c-slot-id"));
	   }
	    
	

}
}
