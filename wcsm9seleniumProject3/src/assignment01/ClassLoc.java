package assignment01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassLoc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		   WebDriver driver = new ChromeDriver();
	         driver.manage().window().maximize();
	         driver.get("https://www.google.com");
	         Thread.sleep(2000);
	         
	         // Switch the control to activeElement
	         driver.switchTo().activeElement().sendKeys("chandl",Keys.ENTER);
	         Thread.sleep(1000);
	         driver.findElement(By.className("lNPNe")).click();
	        // Thread.sleep(10000);
	         //driver.close();
	         
	}

}
