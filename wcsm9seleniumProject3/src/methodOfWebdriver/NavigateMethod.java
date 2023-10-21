package methodOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Launch the web application with navigate()
		 Navigation nav = driver.navigate();
		 nav.to("https://www.selenium.dev");
		 Thread.sleep(1500);
		 //to perform backword operation
		 nav.back();
		 Thread.sleep(1500);
		 //to perform forward operation
		 nav.forward();
		 Thread.sleep(1500);
		 //to perform refresh operation
		 nav.refresh();
		 Thread.sleep(1500);
		 driver.close();
		 
		

	}

}
