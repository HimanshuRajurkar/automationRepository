package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathloc {
	
   public static void main(String[] args) throws InterruptedException
    {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.irctc.co.in/nget/train-search");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"nlpCubeBox200X200\"]/div/div[1]/span[1]/img"));
	driver.switchTo().activeElement().sendKeys("Pune");
	
    }
}
