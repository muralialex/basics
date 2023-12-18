package IndhuPackage1;
	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Indhu_Login { 
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			//driver.get("https://www.amazon.com/");
			//driver.navigate().to("https://online.actitime.com/cisco2");
			driver.get("https://online.actitime.com/cisco2");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.id("username")).sendKeys("unique.muralistl@gmail.com");
			driver.findElement(By.name("pwd")).sendKeys("DgjTEH99");
			driver.findElement(By.cssSelector("input[name='remember']")).click();
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();
			driver.findElement(By.linkText("Logout")).click();
			driver.close();
		}
	}
