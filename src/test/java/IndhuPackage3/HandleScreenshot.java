package IndhuPackage3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class HandleScreenshot {

public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	File file1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	File destFile = new File("C:\\Users\\abkvi\\workspace\\Selenium_M2\\Screenshots\\Homepage.png");
	FileUtils.copyFile(file1, destFile);
	System.out.println("done-1");
	driver.get("https://www.amazon.in/");
	File file2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    File destFile1=new File(System.getProperty("users.dir")+"\\Screenshots\\screenshot.png");
    FileUtils.copyFile(file2, destFile1);
    
    System.out.println("/------------Murali's-1----------------------------/");
    driver.get("https://online.actitime.com/cisco2");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	File file3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	File destFile2=new File(System.getProperty("user.dir")+"\\Selenium_M2\\Screenshots\\actiTime_Login.png");
	FileUtils.copyFile(file3, destFile2);
	
	System.out.println("/------------Murali's-2----------------------------/");
    driver.navigate().to("https://www.amazon.in/");
	File file4 = driver.findElement(By.tagName("html")).getScreenshotAs(OutputType.FILE);
	File destFile4 =new File("C:\\Users\\abkvi\\workspace\\Selenium_M2\\Screenshots\\amazon_home.png");
	FileUtils.copyFile(file4, destFile4);
	
	System.out.println("/------------Murali's-3----------------------------/");
	File file5Element = driver.findElement(By.xpath("//div[@id='nav-xshop']")).getScreenshotAs(OutputType.FILE);
	File destFile5=new File("C:\\Users\\abkvi\\workspace\\Selenium_M2\\Screenshots\\amazon_Element.png");
	FileUtils.copyFile(file5Element, destFile5);
    
    
}
}
