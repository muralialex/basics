package chaitra;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Basics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("document.body.style.zoom='80%';");
		Thread.sleep(5000);
		List<WebElement> elements = driver.findElements(By.xpath("//div[@id='nav-xshop']/a[position()<=15]"));
		for (WebElement element : elements) {
			System.out.println("Text=> " + element.getText());
			System.out.println("Attribute=> " + element.getAttribute("data-csa-c-content-id"));
		}

	}
}
