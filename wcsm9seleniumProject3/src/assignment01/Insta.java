package assignment01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		 driver.switchTo().activeElement().sendKeys("instagram",Keys.ENTER);
		 driver.findElement(By.xpath("//h3[contains(text(),'Instagram')]")).click();
	}

}
