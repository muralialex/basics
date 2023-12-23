package ranjan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class WebTable {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> tablerows = table.findElements(By.tagName("tr"));
		System.out.println(tablerows.size());
		System.out.println("====================");
		// print headers
		List<WebElement> tableheaderelements = tablerows.get(0).findElements(By.tagName("th"));
		for (WebElement header : tableheaderelements) {
			System.out.println(header.getText());
		}
		System.out.println("=============");
		// to print all ths data except headers
		List<WebElement> Allelements_NoHeaders = table.findElements(By.tagName("td"));
		for (WebElement element : Allelements_NoHeaders) {
			System.out.println(element.getText());
		}
		System.out.println("=============");
		// to print all data including headers
		List<WebElement> Allelements_withHeaders = table
				.findElements(By.xpath("//th[text()='Company']/ancestor::tbody/tr/*"));
		for (WebElement alldata : Allelements_withHeaders) {
			System.out.println(alldata.getText());
		}
		System.out.println("=============");
		// to get all the elements of first row
		List<WebElement> countryelements = table.findElements(By.xpath("//table[@id='customers']//td[position()=count(//th[text()='Country']/preceding-sibling::th)+1]"));
		for (WebElement elements : countryelements) {
			System.out.println(elements.getText());
		}
		System.out.println("=================");
		//to print first row including headers
		List<WebElement> FirstRow_withHeaders = table.findElements(By.xpath("//table[@id='customers']/tbody/tr/*[1]"));
		for(WebElement ele:FirstRow_withHeaders) {
			System.out.println(ele.getText());
		}
		System.out.println("==================");
		//to print contact alone 
		List<WebElement> contactelements = table.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));
		for(WebElement element :contactelements) {
			System.out.println(element.getText());
		}
		System.out.println("============");
		//to print first row alone
		 List<WebElement> firstrowelements = tablerows.get(1).findElements(By.tagName("td"));
		 for(WebElement element:firstrowelements) {
			 System.out.println(element.getText());
		 }
		 System.out.println("==================");
		 //to print last row elements
		 List<WebElement> lastrowelements = tablerows.get(6).findElements(By.tagName("td"));
		 for(WebElement element:lastrowelements) {
			 System.out.println(element.getText());
		 }
		 
		
	}

}
