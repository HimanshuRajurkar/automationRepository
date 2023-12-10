package keyworddrivenframework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActitimeValidLogin extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		//Launche the Browser
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		// Read data from Property file
		FLib flib = new FLib();
		
		driver.findElement(By.name("username")).sendKeys(flib.readDataFromProperty(PROP_FILE, "Username"));
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(flib.readDataFromProperty(PROP_FILE, "Password"));
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		bt.closeBrowser();
		
	}

}
