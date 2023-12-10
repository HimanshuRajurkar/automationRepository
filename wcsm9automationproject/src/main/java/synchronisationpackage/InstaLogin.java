package synchronisationpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InstaLogin {
	

	public static WebElement explicitwait(WebDriver driver, int sec, WebElement ele)
	{
	            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	             WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ele));
	             return element;
	}
	//explicitwait(driver,30,checkbutton).click();
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/");
	 //   Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")).sendKeys("himanshuraj");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")).sendKeys("Him566@#fndfd");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
    	Thread.sleep(4000);
		driver.close();
		
		

		
	}

}
