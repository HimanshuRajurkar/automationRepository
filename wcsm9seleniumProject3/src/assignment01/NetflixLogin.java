package assignment01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		Thread.sleep(1000);
		driver.findElement(By.id("id_userLoginId")).sendKeys("nfdnfdlfna");
		Thread.sleep(1000);
		driver.findElement(By.id("id_password")).sendKeys("ffjnefnefn");

		driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/form/button")).click();
		Thread.sleep(4000);
		driver.close();
	}

}
