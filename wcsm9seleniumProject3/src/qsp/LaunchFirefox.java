package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		System.out.println("Firefox is Open");
		driver.get("https:\\www.flipkart.com");
		Thread.sleep(3000);
		driver.close();
	    System.out.println("Firefox is Closed");


	}

}
