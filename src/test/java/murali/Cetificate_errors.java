package murali;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

public class Cetificate_errors {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://expired.badssl.com");
		
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.setAcceptInsecureCerts(true);
		WebDriver edriver = new EdgeDriver(edgeOptions);
		
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.setAcceptInsecureCerts(true);
		WebDriver fdriver = new FirefoxDriver(firefoxOptions);
		
		WebDriver sdriver = new SafariDriver();
        driver.get("https://revoked.badssl.com");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("CertificateWarningController.visitInsecureWebsiteWithTemporaryBypass()");


	}
}
