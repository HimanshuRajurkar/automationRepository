package staleElementReferenceException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 Navigation nav = driver.navigate();
		 nav.to("http://127.0.0.1/login.do");
		Thread.sleep(3000);
		
		//identify usernameTB
		WebElement usnTB = driver.findElement(By.name("username"));
		nav.refresh();
		usnTB.sendKeys("admin");
		
	}

}
