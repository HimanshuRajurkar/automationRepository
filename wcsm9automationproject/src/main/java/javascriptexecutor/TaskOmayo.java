package javascriptexecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TaskOmayo {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.get("https://omayo.blogspot.com/");
	        Thread.sleep(2000);
	        
	        JavascriptExecutor jse = (JavascriptExecutor)driver;
	        WebElement disableElement = driver.findElement(By.id("tb2"));
	        Point loc = disableElement.getLocation();
	        		int xaxis = loc.getX();
	                int yaxis = loc.getY(); 
	          jse.executeScript("window.scrollBy(\"+xaxis+\","+(yaxis-50)+")");
	          jse.executeScript("document.getElementById('tb2').value='Automation Testing'");
	          
	          Thread.sleep(5000);
		       File src = disableElement.getScreenshotAs(OutputType.FILE);
		       File dest = new File("./Screenshot/TextBox.png");
		       Files.copy(src, dest);
	          
	}

}
