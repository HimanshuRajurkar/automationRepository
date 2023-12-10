package methodofwebelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
		driver.switchTo().activeElement().sendKeys("iphone");
	    List<WebElement> alliphone = driver.findElements(By.xpath("//div[@class='lnnVSe']"));
	    Thread.sleep(2000);
	    for (WebElement phone : alliphone) {
			System.out.println(phone.getText()); 
		}	
	}

}
