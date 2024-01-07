package VaishaliPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

class Handle_DropDown {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options = new ChromeOptions();
	options.setAcceptInsecureCerts(true);
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	driver.manage().window().maximize();
	driver.switchTo().frame("iframeResult");
	Select dropdown = new Select(driver.findElement(By.id("cars")));
	dropdown.selectByIndex(0);
	Thread.sleep(1000);
	dropdown.selectByValue("saab");
	Thread.sleep(1000);
	dropdown.selectByVisibleText("Audi");
	
	Thread.sleep(1000);
	dropdown.deselectByIndex(0);
	Thread.sleep(1000);
	dropdown.deselectByValue("saab");
	Thread.sleep(1000);
	dropdown.deselectByVisibleText("Audi");
	
	Thread.sleep(1000);
	dropdown.selectByIndex(0);
	Thread.sleep(1000);
	dropdown.selectByValue("saab");
	Thread.sleep(1000);
	dropdown.selectByVisibleText("Opel");
	Thread.sleep(1000);
	System.out.println("=====Selected options in dropdown:=====");
	List<WebElement> selectedoptions = dropdown.getAllSelectedOptions();
	for(WebElement sc:selectedoptions) {
		System.out.println(sc.getText());
	}
	System.out.println("=====All options in dropdown:=====");
	List<WebElement> alloptions = dropdown.getOptions();
	for(WebElement all:alloptions) {
		System.out.println(all.getText());
	}
	}
}
