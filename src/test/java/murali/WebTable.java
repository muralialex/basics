package murali;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class WebTable {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement tableElement= driver.findElement(By.id("customers"));
		List<WebElement> tableRowElements= tableElement.findElements(By.tagName("tr"));
		System.out.println(tableRowElements.size());
		//Print Headers
		List<WebElement> headerElements= tableRowElements.get(0).findElements(By.tagName("th"));
		for(WebElement header: headerElements) {
			System.out.println(header.getText());
		}
		System.out.println("=====");
		//Print Data apart from Headers
		List<WebElement> AllElements_NoHeaders= tableElement.findElements(By.tagName("td"));
		for(WebElement element: AllElements_NoHeaders) {
			System.out.println(element.getText());
		}
		
		System.out.println("=====");
		//Print All Data
		List<WebElement> AllElements= tableElement.findElements(By.xpath("//th[text()='Company']/ancestor::tbody//tr/*"));
		for(WebElement element:AllElements) {
			System.out.println(element.getText());
		}
		
		System.out.println("=====");
		//Print Country Names alone
		//table[@id='customers']//td[position()=3]
		//table[@id='customers']//td[position()=count(//th[text()='Country']/preceding-sibling::th)+1]
		
		List<WebElement> countryElements = driver.findElements(By.xpath("//table[@id='customers']//td[position()=count(//th[text()='Country']/preceding-sibling::th)+1]"));
		for(WebElement element:countryElements) {
			System.out.println(element.getText());
		}
		
		driver.quit();
	}
}
