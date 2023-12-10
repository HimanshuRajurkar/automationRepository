package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspDemoDisableElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Synchronization']")).click();
		driver.findElement(By.xpath("//section[text()='Progress Bar']")).click();
		
		WebElement disableElement = driver.findElement(By.xpath("//input[@placeholder='Enter time in seconds']"));
		disableElement.sendKeys("2");
		driver.findElement(By.xpath("//buttion[text()='Start']"));
		//Explicitly typecast into javascriptexecutor
	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	}

}
