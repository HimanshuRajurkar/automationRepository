package pageObjectModel;

import java.io.IOException;

import org.openqa.selenium.By;

import keyworddrivenframework.BaseTest;
import keyworddrivenframework.FLib;
																																																																																																																
public class ActiTimeValidLogin extends pageObjectModel.BaseTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BaseTest bt = new BaseTest();
		
		
		// Read data from Property file
		FLib flib = new FLib();
		LoginPage lb = new LoginPage(driver);
		//lp.validLogin(flib.readDataFromProperty(PROP_FILE, "Username"), flib.readDataFromProperty(PROP_FILE, "Password"));

	}

}

	
