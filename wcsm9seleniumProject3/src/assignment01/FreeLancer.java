package assignment01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreeLancer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freelancer.com/login");
		
		//identify usernameTB
		driver.findElement(By.xpath("//*[@id=\"emailOrUsernameInput\"]")).sendKeys("himanshurajurka4");
		
		//identify PasswordTB
		driver.findElement(By.xpath("//*[@id=\"passwordInput\"]")).sendKeys("Him@nshuraj");
		
		driver.findElement(By.xpath("/html/body/app-root/app-logged-out-shell/app-login-page/fl-container/fl-bit/app-login/app-credentials-form/form/app-login-signup-button/fl-button/comment()[5]")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
