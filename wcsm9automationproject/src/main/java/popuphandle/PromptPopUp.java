package popuphandle;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		
		driver.findElement(By.xpath("//a[text()='Prompt']")).click();
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		  al.sendKeys("yes");
		  al.accept();
		
	}

}
