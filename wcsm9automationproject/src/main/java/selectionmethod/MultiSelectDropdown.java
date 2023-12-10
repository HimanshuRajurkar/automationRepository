package selectionmethod;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  WebDriver driver=new ChromeDriver();
	         driver.manage().window().maximize();
	         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	         driver.get("http://demoapps.qspiders.com");
	         driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
	         driver.findElement(By.partialLinkText("Multi Select")).click();
	        WebElement dropdown = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
	            Select sel = new Select(dropdown);

                  for(int i=0;i<=4;i++)
                  {
                	  Thread.sleep(2000);
                	  sel.selectByIndex(i);
                  }
                  sel.deselectAll();
                  /*
                  WebElement dropdown2 = driver.findElement(By.xpath("//label[text()='City']/following-sibling::select"));
  	            Select sel2 = new Select(dropdown2);
                  for(int i=0;i<=4;i++)
                  {
                	  Thread.sleep(2000);
                	  sel2.selectByIndex(i);
                  }
	            */
	}

}
