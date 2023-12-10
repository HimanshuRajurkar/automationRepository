package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Argument;

public class HandleDisableElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='Disabled Mode']")).click();
		WebElement disableElement = driver.findElement(By.xpath("//button[text()='Register']"));
		
		//Explicitly typecast into javascriptexecutor
	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	 
	 //handle disable textbox
	 jse.executeScript("document.getElementById('name').value='Himanshu'");
	 jse.executeScript("document.getElementById('email').value='himanshu12@gmail.com'");
	 jse.executeScript("document.getElementById('password').value='himanshu@123'");
	
	 //handle the disable buttons
	 if (disableElement.isDisplayed()) {
		jse.executeScript("arguments[0].click()",disableElement);
		jse.executeScript("arguments[0].click()",driver.findElement(By.xpath("//span[text()='Login']")));
		System.out.println("CLICK");
	}
	 else {
               System.out.println("NOT CLICK");
	}
	 
	}
	
}
