package VaishaliPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Login_Logout {

public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://online.actitime.com/vlavanya1");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("username")).sendKeys("vaishali.lavanyar@gmail.com");
	driver.findElement(By.name("pwd")).sendKeys("#neHQaA9");
	driver.findElement(By.cssSelector("input[name='remember']")).click();
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	driver.findElement(By.linkText("Logout")).click();
	driver.close();	

}
}
