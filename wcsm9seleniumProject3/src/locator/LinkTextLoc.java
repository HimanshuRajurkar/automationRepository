package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLoc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Himanshu%20Rajurkar/Desktop/wcsm9Link/Link.html");
		Thread.sleep(2000);
        driver.findElement(By.linkText("seleniumLink")).click();
        
	}

}
