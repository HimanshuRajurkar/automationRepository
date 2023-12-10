package synchronisationpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       driver.get("https://www.google.com/");
       driver.switchTo().activeElement().sendKeys("flipkart",Keys.ENTER);
       driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
       driver.findElement(By.xpath("//span[text()='✕']")).click();
       driver.findElement(By.name("q")).sendKeys("Mobile");
       
       driver.findElement(By.xpath("//button[contains(@aria-label,'Search for Prod')]")).click();
       
	}

}
