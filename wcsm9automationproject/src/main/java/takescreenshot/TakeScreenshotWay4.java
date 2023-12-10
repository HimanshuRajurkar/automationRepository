package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class TakeScreenshotWay4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 WebDriver driver= new ChromeDriver();
		 RemoteWebDriver rwd = ( RemoteWebDriver)driver;
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        
	        driver.get("https://www.myntra.com");
	       
	        
	        //call the method
	        File src = rwd.getScreenshotAs(OutputType.FILE);
	        
	        //define way of storing screenshot
	        File dest = new File("./Screenshot/myntra4.png");
	        
	        //store the screenshot into the dest
	        Files.copy(src, dest);
	}

}
