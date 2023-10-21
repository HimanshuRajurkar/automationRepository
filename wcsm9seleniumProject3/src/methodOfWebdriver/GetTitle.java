package methodOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
	       driver.get("https:\\www.instagram.com");
	       Thread.sleep(3000);
	       System.out.println(driver.getTitle());
	       driver.close();
	}

}
