package synchronisationpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.shoppersstack.com/");
		
		driver.findElement(By.xpath("//img[contains(@alt,'Skinny Men Blue Jeans')]")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("432102");
		Thread.sleep(2000);
		driver.findElement(By.name("Check")).click();
		//explicitwait(driver,60, null).click();
	}
	/*
	public static WebElement explicitwait(WebDriver driver, int sec, WebElement ele)
	{
	            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec));
	             WebElement element= wait.until(ExpectedConditions.elementToBeClickable(ele));
	             return element;
	}
  */
}
