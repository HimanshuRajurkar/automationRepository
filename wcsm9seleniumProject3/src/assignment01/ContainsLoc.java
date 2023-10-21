package assignment01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsLoc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		//identify username text box and pass input
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("hddjdkklj");
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("hddj@14243");
		driver.findElement(By.xpath("//div[contains(text(),'L')]")).click();
		driver.quit();
		

	}

}
