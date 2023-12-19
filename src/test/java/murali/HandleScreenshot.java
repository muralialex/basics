package murali;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class HandleScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/cisco2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		File actiTimeFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destFile=new File(System.getProperty("user.dir")+"\\resources\\screenshots\\actiTime_Login.png");
		FileUtils.copyFile(actiTimeFile, destFile);
		
		driver.navigate().to("https://www.amazon.in/");
		File amazonFile = driver.findElement(By.tagName("html")).getScreenshotAs(OutputType.FILE);
		destFile=new File(System.getProperty("user.dir")+"\\resources\\screenshots\\amazon_home.png");
		FileUtils.copyFile(amazonFile, destFile);
		
		File amazon_elementFile = driver.findElement(By.xpath("//div[@id='nav-xshop']")).getScreenshotAs(OutputType.FILE);
		destFile=new File(System.getProperty("user.dir")+"\\resources\\screenshots\\amazon_element.png");
		FileUtils.copyFile(amazon_elementFile, destFile);
	}
}
