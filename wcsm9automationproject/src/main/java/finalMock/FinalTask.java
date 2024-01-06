package finalMock;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FinalTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("iphones");
		Thread.sleep(2000);
	   List<WebElement> options = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
	   Thread.sleep(2000);
	   
	    for(int i=0;i<options.size();i++)
	    {
	    	String data = options.get(i).getText();
	    	Thread.sleep(2000);
	    	System.out.println(data);
	    }
      driver.quit();
      /*
      for(WebElement op:options)
		{
			String options1 = op.getText();
			Thread.sleep(2000);
			System.out.println(options1);
		}
	*/
	}

}
