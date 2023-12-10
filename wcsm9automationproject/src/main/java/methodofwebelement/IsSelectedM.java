package methodofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("http://desktop-kh3c9h0/login.do");
			WebElement checkBox = driver.findElement(By.id("keepLoggedInCheckBox"));
			boolean status = checkBox.isSelected();
			System.out.println(status);
			checkBox.click();
			boolean status1 = checkBox.isSelected();
			System.out.println(status1);
	}

}
