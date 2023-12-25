package VaishaliPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebElement tableElement = driver.findElement(By.id("customers"));
	List<WebElement> tableRowsElement = tableElement.findElements(By.tagName("tr"));
	//Print the number of Rows
	System.out.println(tableRowsElement.size());
	System.out.println("====================");
	//Print Header
	List<WebElement> headerElements = tableRowsElement.get(0).findElements(By.tagName("th"));
	for(WebElement rowcount:headerElements) {
		System.out.println(rowcount.getText());
	}
	System.out.println("====================");
	//Print all data except Header
	List<WebElement> AllElements_NoHeader = tableElement.findElements(By.tagName("td"));
	for(WebElement header:AllElements_NoHeader) {
		System.out.println(header.getText());
	}
	System.out.println("====================");
	//Print All data 
	List<WebElement> AllElements = tableElement.findElements(By.xpath("//th[text()='Company']/ancestor::tbody//tr/*"));
	for(WebElement elements:AllElements) {
		System.out.println(elements.getText());
	}
	System.out.println("====================");
	//print country names alone
	List<WebElement> countryNames_only = tableElement.findElements(By.xpath("//td[3]"));
	for(WebElement countries:countryNames_only) {
		System.out.println(countries.getText());
	}
	System.out.println("====================");
	//print first row
	List<WebElement> first_Row = tableElement.findElements(By.xpath("//table[@id='customers']//tr[2]/td"));
	for(WebElement firstrow:first_Row) {
		System.out.println(firstrow.getText());
	}
	System.out.println("====================");
	//print last row
		List<WebElement> last_Row = tableElement.findElements(By.xpath("//table[@id='customers']//tr[position()=7]/td"));
		for(WebElement lastrow:last_Row) {
			System.out.println(lastrow.getText());
		}
	System.out.println("====================");
	//print country names alone - other ways
	//table[@id='customers']//td[position()=count(//th[text()='Country']/preceding-sibling::th)+1]
	//table[@id='customers']//td[position()=3
	
	driver.quit();
}
}
