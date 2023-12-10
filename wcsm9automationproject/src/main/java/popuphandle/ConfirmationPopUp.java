package popuphandle;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		
		driver.findElement(By.xpath("//a[text()='Confirm']")).click();
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		
		//Handle Alert PopUp
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.dismiss();
	}

}
