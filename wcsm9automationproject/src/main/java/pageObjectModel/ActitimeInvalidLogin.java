package pageObjectModel;

import java.io.IOException;

public class ActitimeInvalidLogin extends BaseTest {

	public static void main(String[] args) throws IOException {
		//to open and close browsers
		BaseTest bt = new BaseTest();
		bt.setup();
		//get the webeleement from login page  pom class
		LoginPage lp = new LoginPage(driver);
		//read data from excel sheet
		FLib flib = new FLib();
		//read rowCount
		int rc = flib.rowCount(EXCEL_PATH, INVALIDCREEDS_SHEET);
		

		for(int i=1;i<=rc;i++)
		{
		    //get the method to perform invalid login from loginpage pom class
			lp.invalidLogin(flib.readDataFromExcel(EXCEL_PATH, INVALIDCREEDS_SHEET, i,0),flib.readDataFromExcel(EXCEL_PATH, INVALIDCREEDS_SHEET, i,1));		
		}
		bt.tearDown();
		
	}
}
