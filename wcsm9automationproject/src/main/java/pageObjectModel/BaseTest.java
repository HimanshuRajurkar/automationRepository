package pageObjectModel;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import keyworddrivenframework.FLib;

public class BaseTest extends pageObjectModel.FLib implements IautoConstant {

	static WebDriver driver;
	

	public void setup() throws IOException {
		FLib flib = new FLib();

		String browserValue = flib.readDataFromProperty("./src/main/resources/Config.properties", "Browser");
		String url = flib.readDataFromProperty("./src/main/resources/Config.properties", "Url");
		

		if (browserValue.equals("chrome")) {
			driver = new ChromeDriver();
			
		}

		else if (browserValue.equals("Firefox")) {
			driver = new FirefoxDriver();
			
		}

		else if (browserValue.equals("Edge")) {
			driver = new EdgeDriver();
			
		} else {
			System.out.println("Invalid Browser Value");
		}

		
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		

	}

	public void tearDown()
	{
		driver.quit();
	}

}
