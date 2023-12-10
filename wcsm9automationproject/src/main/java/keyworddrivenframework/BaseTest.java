package keyworddrivenframework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends FLib implements IautoConstant {
	static WebDriver driver;
	static boolean flag = false;

	public void openBrowser() throws IOException {
		FLib flib = new FLib();

		String browserValue = flib.readDataFromProperty("./src/main/resources/Config.properties", "Browser");
		String url = flib.readDataFromProperty("./src/main/resources/Config.properties", "Url");
		

		if (browserValue.equals("chrome")) {
			driver = new ChromeDriver();
			flag = true;
		}

		else if (browserValue.equals("Firefox")) {
			driver = new FirefoxDriver();
			flag = true;
		}

		else if (browserValue.equals("Edge")) {
			driver = new EdgeDriver();
			flag = true;
		} else {
			System.out.println("Invalid Browser Value");
		}

		if (flag) {
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}

	}

	public void closeBrowser() {
		if(flag) {
		driver.quit();
		}
	}

}
