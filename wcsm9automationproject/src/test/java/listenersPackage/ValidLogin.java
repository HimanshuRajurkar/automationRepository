package listenersPackage;

import org.openqa.selenium.By;

import org.testng.Assert;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(CustomeListeners.class)


public class ValidLogin extends BestTest {
  @Test
  public void validLoginMethod() {
	  String expectedLoginPage = "actiTIME -";
	 // SoftAssert sa = new SoftAssert();
     //  sa.assertEquals(driver.getTitle(), expectedLoginPage);
       Assert.assertEquals(driver.getTitle(), expectedLoginPage);
       
       driver.findElement(By.name("username")).sendKeys("admin");
       driver.findElement(By.name("pwd")).sendKeys("manager");
       driver.findElement(By.id("loginButton")).click();
  }
}
