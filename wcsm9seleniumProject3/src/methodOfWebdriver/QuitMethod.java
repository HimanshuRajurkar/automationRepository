package methodOfWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
	       driver.get("https:\\www.omayo.blogspot.com");
	       Thread.sleep(3000);
	       driver.findElement(By.partialLinkText("Open a popup window")).click();
	       Thread.sleep(3000);
	       driver.quit();

	}

}
