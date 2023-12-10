package keyworddrivenframework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActitimeInvalidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		    //Launche the Browser
			BaseTest bt = new BaseTest();
			// Read data from Property file
			FLib flib = new FLib();
			bt.openBrowser();
			int rc = flib.rowCount("./src/main/resources/Invalidlogin.xlsx", "Invalid");
				for(int i = 1;i<=rc;i++)
				{
					 String invalidusn = (flib.readDataFromExcel("./src/main/resources/Invalidlogin.xlsx","Invalid", i, 0));
					 String invalidpass = (flib.readDataFromExcel("./src/main/resources/Invalidlogin.xlsx","Invalid", i, 1));
					 
			        WebElement usnTB = driver.findElement(By.name("username"));
			        usnTB.sendKeys(invalidusn);
			     	Thread.sleep(2000);
			    	WebElement passTB = driver.findElement(By.name("pwd"));
				    passTB.sendKeys(invalidpass);
			     
				    Thread.sleep(2000);
				    driver.findElement(By.id("loginButton")).click();
			    	Thread.sleep(2000);
				    usnTB.clear();
				}
				
	}

}
