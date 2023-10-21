package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {
    
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		//To take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the valid Browser name");
		String browserValue = sc.next();
		if (browserValue.equalsIgnoreCase("chrome"))
		{
			   driver = new ChromeDriver();
		       driver.get("https:\\www.instagram.com");
		       driver.manage().window().maximize();
		       System.out.println("Chrome is Open");
		       Thread.sleep(3000);
		       driver.close();
		       System.out.println("Chrome is Closed");
		}
		else if (browserValue.equalsIgnoreCase("firefox")) 
		{
		  driver = new FirefoxDriver();
			System.out.println("Firefox is Open");
			driver.get("https:\\www.flipkart.com");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.close();
			
		    System.out.println("Firefox is Closed");
		}
		else if (browserValue.equalsIgnoreCase("Edge"))
		{
			driver= new EdgeDriver();
			driver.get("https:\\www.amazon.com");
			driver.manage().window().maximize();
			System.out.println("Edge is Open");
			Thread.sleep(4900);
			driver.close();
		    System.out.println("Edge is Closed");
		}
		else
		{   
			System.out.println("Enter valid Browser valuec");
		}

	}

}
