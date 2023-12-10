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

public class ScrollTillElement {

	public static void main(String[] args) throws IOException, InterruptedException  {
		// TODO Auto-generated method stub

		  WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.get("https://www.selenium.dev/");
	        Thread.sleep(2000);
	        WebElement twitter = driver.findElement(By.xpath("//i[@class='fab fa-twitter']"));
	        JavascriptExecutor jse = (JavascriptExecutor)driver;
	       
	        Point loc = twitter.getLocation();
	        int xaxis =loc.getX();
	        int yaxis =loc.getY();
	        
	        jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
	       
	        Thread.sleep(5000);
	       File src = twitter.getScreenshotAs(OutputType.FILE);
	       File dest = new File("./Screenshot/TwitterLogo.jpg");
	       Files.copy(src, dest);
	         /*
	        Thread.sleep(2000);
	        jse.executeScript("arguments[0].scrollIntoView(true)",twitter);
	        */  
	}

}