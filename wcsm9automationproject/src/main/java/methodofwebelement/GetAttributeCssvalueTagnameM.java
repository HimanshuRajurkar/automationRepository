package methodofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeCssvalueTagnameM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		 WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	      //get Attribute
	     WebElement usnTB = driver.findElement(By.xpath("//input[@placeholder='Username']"));
	     String attributevalue = usnTB.getAttribute("name");
	      System.out.println(attributevalue);
	      //get css value
	      String cssValue = usnTB.getCssValue("color");
	      System.out.println(cssValue);
	      
	      // get tag name
	      System.out.println(usnTB.getTagName()); 
	}

}