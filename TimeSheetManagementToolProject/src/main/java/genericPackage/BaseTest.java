package genericPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v119.page.model.GatedAPIFeatures;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Flib implements IautoConstant {
	
	protected static WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		Flib flib = new Flib();
		String browserValue = flib.readDataFromProperty(PROP_PATH, "Browser");
		String url = flib.readDataFromProperty(PROP_PATH, "Url");
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (browserValue.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
else if (browserValue.equalsIgnoreCase("edge")) {
	driver = new EdgeDriver();
		}
else
{
	Reporter.log("You enter wrong browser value", true);
	}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
	}
	
	public void failedSsMethod(String failedMethodName)
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
