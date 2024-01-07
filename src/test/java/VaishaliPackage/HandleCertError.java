package VaishaliPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HandleCertError {
public static void main(String[] args) {
	// Example for Handle Cert error
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://expired.badssl.com/");
//	System.out.println("The page title is : " +driver.getTitle());
//	driver.quit();
//GoogleChrome
	// Create instance of ChromeOptions Class
	ChromeOptions handlingSSL = new ChromeOptions();
	// Using the accept insecure cert method with true as parameter to accept the untrusted certificate
	handlingSSL.setAcceptInsecureCerts(true);
	// Creating instance of Chrome driver by passing reference of ChromeOptions object
	WebDriver driver = new ChromeDriver(handlingSSL);
	// Launching the URL
	driver.get("https://expired.badssl.com/");
	System.out.println("The page title is : " + driver.getTitle());
	driver.quit();
	
//FireFoxBrowser
	FirefoxOptions firefoxOptions = new FirefoxOptions();
	firefoxOptions.setAcceptInsecureCerts(false);
	WebDriver driverf = new FirefoxDriver(firefoxOptions);
	driverf.get("https://self-signed.badssl.com/");
	System.out.println("The page title is : " + driverf.getTitle());
	driver.quit();
	
	

}
}
