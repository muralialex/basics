package IndhuPackage3;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class WebTableFromeScratch {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement tableElement = driver.findElement(By.id("customers"));
		System.out.println("========Execution starts==========");
		List<WebElement> tablerowElement = tableElement.findElements(By.tagName("tr"));
		System.out.println(tablerowElement.size());
		System.out.println("========Print Headers==============");
	    List<WebElement> headerElements=tablerowElement.get(0).findElements(By.tagName("th"));
	    System.out.println("Count the header   :  "+headerElements.size());
	    System.out.println("Name the headers from table : ");
	    for(WebElement header : headerElements)
	    {
		System.out.println(header.getText());
	    }
	    System.out.println("print the data without header");
	   List<WebElement> tabledataelement=tableElement.findElements(By.tagName("td"));
	   //System.out.println("Number of data without header "+tabledataelement.size());
	   for(WebElement element :tabledataelement )
	   {
		   System.out.println(element.getText());
		    }
	   System.out.println("===================print the data with header===================");
	   List<WebElement> tabledatawithheader=tableElement.findElements(By.xpath("//th[text()='Company']/ancestor::tbody//tr/*"));
	    for(WebElement element1 :tabledatawithheader )
	   {
		   System.out.println(element1.getText());
		    }
	   
	    System.out.println("===================print only country ===================");
		   List<WebElement> countryonly=driver.findElements(By.xpath("//table[@id='customers']//td[position()=3]"));
		    for(WebElement element2 :countryonly )
		   {
			   System.out.println(element2.getText());
			    }
		    System.out.println("===================print only country using a xpath ===================");
			   List<WebElement> countryonly1=driver.findElements(By.xpath("//table[@id='customers']//td[position()=count(//th[text()='Country']/preceding-sibling::th)+1]"));
			    for(WebElement element3 :countryonly1 )
			   {
				   System.out.println(element3.getText());
				    }
			    
	   }
	}

