package popuphandle;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		WebElement element1 = driver.findElement(By.id("fileInput"));
		
		Actions act = new Actions(driver);
		   act.doubleClick(element1).perform();
		 Thread.sleep(2000);
		  File file = new File("./autoitpgm/DemoScript1.exe");
		  
		  String abspath = file.getAbsolutePath();
		                  
		   Runtime.getRuntime().exec(abspath);
		   Thread.sleep(2000);
		   Runtime.getRuntime().exec(abspath);
	}

}

