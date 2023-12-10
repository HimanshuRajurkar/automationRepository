package selectionmethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OperationMethod {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Himanshu%20Rajurkar/Desktop/wcsm9Link/DurgaCafe.html");
		WebElement dropdown1 = driver.findElement(By.id("idddd"));
		 
		Select sel = new Select(dropdown1);
		List<WebElement> allops = sel.getOptions();
		for (WebElement opt : allops) {
			if(opt.getText().equals("MasalaMaggie"))
			{ 
				Thread.sleep(2000);
				opt.click();
			}
		}
		//sel.selectByValue("v4");
		
		//System.out.println(sel.getFirstSelectedOption().getText());
		

	}

}

//how to select option from dropdown without using selection method of dropdown