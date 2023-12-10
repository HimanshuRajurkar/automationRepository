package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class TakeScreenshotWay3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		 WebDriver driver= new ChromeDriver();
		EventFiringWebDriver efw = new EventFiringWebDriver(driver);
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        
	        driver.get("https://www.bluestone.com");
	        driver.findElement(By.id("denyBtn")).click();
	        Thread.sleep(2000);
	       
	        
	        //call the method
	        File src = efw.getScreenshotAs(OutputType.FILE);
	        
	        //define way of storing screenshot
	        File dest = new File("./Screenshot/bluestone3.png");
	        
	        //store the screenshot into the dest
	        Files.copy(src, dest);
	}

}
