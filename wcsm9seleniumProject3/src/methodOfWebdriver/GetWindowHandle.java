package methodOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
               WebDriver driver=new ChromeDriver();
               driver.manage().window().maximize();
               driver.get("https://omayo.blogspot.com/");
               Thread.sleep(3000);
               //take a address of current browser or window
               //parent browser ...(the browser or window has control)
               String parentHandle = driver.getWindowHandle();
               System.out.println("address of parent browser or window"+parentHandle);
               Thread.sleep(3000);
               driver.close();
               
	}

}
