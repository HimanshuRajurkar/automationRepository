package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class LaunchChromeDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.get("https:\\www.instagram.com");
       driver.manage().window().maximize();
       System.out.println("Chrome is Open");
       Thread.sleep(3000);
       driver.close();
       System.out.println("Chrome is Closed");
	}

}
