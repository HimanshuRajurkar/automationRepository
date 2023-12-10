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

public class TakeScreenshotWay2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 RemoteWebDriver rwd= new ChromeDriver();
	        rwd.manage().window().maximize();
	        rwd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        
	        rwd.get("https://www.amazon.com");
	        
	        
	        //call the method
	        File src = rwd.getScreenshotAs(OutputType.FILE);
	        
	        //define way of storing screenshot
	        File dest = new File("./Screenshot/amazon2.png");
	        
	        //store the screenshot into the dest
	        Files.copy(src, dest);
	}

}
