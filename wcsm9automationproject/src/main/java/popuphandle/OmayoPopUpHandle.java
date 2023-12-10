package popuphandle;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.get("https://omayo.blogspot.com/");
	        Thread.sleep(2000);
	        JavascriptExecutor jse = (JavascriptExecutor)driver;
	        jse.executeScript("window.scrollBy(0,500)");
	        driver.findElement(By.id("alert1")).click();
	        Alert al = driver.switchTo().alert();
	        System.out.println(al.getText());
			  al.accept();
	}

}
