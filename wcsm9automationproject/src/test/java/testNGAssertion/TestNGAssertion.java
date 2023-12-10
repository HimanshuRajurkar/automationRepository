package testNGAssertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class TestNGAssertion {
	static WebDriver driver;
	@BeforeMethod
	  public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://himanshu/login.do");
	  }

  @Test
  public void f() {
	 String expectedLoginPage = "actiTIME - Login";
	  SoftAssert sa = new SoftAssert();
       sa.assertEquals(driver.getTitle(), expectedLoginPage);
       
       driver.findElement(By.name("username"));
       driver.findElement(By.name("pwd"));
       driver.findElement(By.id("loginButton")).click();;
  }
  
}
