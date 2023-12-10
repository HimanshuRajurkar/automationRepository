package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpOp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		  WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.get("https://www.selenium.dev");
	        
	        //Scroll Down Operation
	        JavascriptExecutor jse = (JavascriptExecutor)driver;
	        jse.executeScript("window.scrollBy(0,500)");
	        Thread.sleep(2000);
	        jse.executeScript("window.scrollBy(0,-500)");
	        
	}

}
