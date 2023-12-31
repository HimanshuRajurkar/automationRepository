package popuphandle;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do");
		Thread.sleep(1000);
		
		//identify usernameTB
		driver.findElement(By.name("username")).sendKeys("admin");
		
		//identify PasswordTB
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
	     driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();
	     driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
	     driver.findElement(By.id("uploadNewLogoOption")).click();
	     
	   WebElement element1 = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
	   //element1.click();
	   Actions act = new Actions(driver);
	   act.doubleClick(element1).perform();
	   //Handle File Upload PopUp
	   Thread.sleep(4000);
	  File file = new File("./autoitpgm/Script1.exe");
	  
	  String abspath = file.getAbsolutePath();
	                  
	   Runtime.getRuntime().exec(abspath);
	   Runtime.getRuntime().exec(abspath);
	}

}
