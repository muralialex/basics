package VaishaliPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_usingSendKeys {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.filemail.com/share/upload-file");
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Add Files']/following-sibling::input[@type='file']"))
	.sendKeys(System.getProperty("user.dir")+"\\resources\\screenshots\\actiTime_Login.png");
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[@title='Send']")).click();
	driver.quit();
}
}
