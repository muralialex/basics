package ranjan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class HandlingCertificates {
	public static void main(String[] args) {
				ChromeOptions handlingSSL = new ChromeOptions();
				handlingSSL.setAcceptInsecureCerts(true);
				WebDriver driver = new ChromeDriver(handlingSSL);
				driver.get("https://expired.badssl.com/");
				
	}

}
