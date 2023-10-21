package methodOfWebdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo2 {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://omayo.blogspot.com/");
         Thread.sleep(2000);
         //take a address of current browser or window
         //parent browser ...(the browser or window has control)
         String parentHandle = driver.getWindowHandle();
         System.out.println("address of parent browser or window"+parentHandle);
         Thread.sleep(1500);
         driver.findElement(By.partialLinkText("Open a popup window")).click();
         
		Set<String> allHandle = driver.getWindowHandles();
		for (String wh : allHandle) 
		{
			if (! parentHandle.equals(wh))
			{
				System.out.println("address of child window:"+wh);
				driver.switchTo().window(wh).manage().window().maximize();
				Thread.sleep(3000);
				driver.close();
				
			}
			else
			{
				System.out.println("address of parent window:"+wh);
			}
		}
		Thread.sleep(2000);
        
	}

}
