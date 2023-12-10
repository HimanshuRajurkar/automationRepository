package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenshotWay1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
         
		    ChromeDriver driver= new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        
	        driver.get("https://www.flipkart.com");
	        driver.findElement(By.xpath("//span[text()='✕']")).click();
	       
	        Thread.sleep(2000);
	        //call the method
	        File src = driver.getScreenshotAs(OutputType.FILE);
	        
	        //define way of storing screenshot
	        File dest = new File("./Screenshot/flipkart1.png");
	        
	        //store the screenshot into the dest
	        Files.copy(src, dest);
	}

}
