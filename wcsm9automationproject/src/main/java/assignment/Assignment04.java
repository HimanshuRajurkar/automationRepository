package assignment;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment04 {
	
	
    
	public static void searchProduct()
	{      
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("apple Watches");
		driver.findElement(By.name("url")).click();
		driver.findElement(By.xpath("//option[text()='Watches']")).click();
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	}
	
	 static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the Browser value");
	      String browserValue = sc.next();
	      
	      if (browserValue.equalsIgnoreCase("chrome")) {
			driver =new ChromeDriver();
		}
	      else if (browserValue.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
		}
	      else if (browserValue.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
		}
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      driver.get("https://www.amazon.in");
	      searchProduct();
	}

}
