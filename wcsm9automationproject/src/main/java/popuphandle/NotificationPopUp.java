package popuphandle;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationPopUp {
   static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Browser Value");
        String browservalue = scan.next();
        if (browservalue.equalsIgnoreCase("chrome")) {
        	ChromeOptions co = new ChromeOptions();
        	co.addArguments("--disable-notifications");
        	driver = new ChromeDriver(co);
			
		} else if (browservalue.equalsIgnoreCase("firefox")){
			FirefoxOptions fo = new FirefoxOptions();
			fo.addArguments("--disable-notifications");
			driver= new FirefoxDriver(fo);
		
		}
		else if (browservalue.equalsIgnoreCase("edgw")){
			EdgeOptions eo = new EdgeOptions();
			eo.addArguments("--disable-notifications");
			driver= new EdgeDriver(eo); 
	}
        driver.get("");

}
}