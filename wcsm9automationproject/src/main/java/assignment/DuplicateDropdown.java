package assignment;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("file:///C:/Users/Himanshu%20Rajurkar/Desktop/DurgaMultiSelect.html");
	    
	    WebElement dropdown = driver.findElement(By.id("idddd"));
	    
	    Select opt = new Select(dropdown);
	    List<WebElement> eles=opt.getOptions();
	    

	    HashSet<String> removeduplicate = new HashSet<String>();
	    //before removing the duplicate options
	    System.out.println("before removing");
	    for(WebElement ele: eles)
	    {
	    	removeduplicate.add(ele.getText());
	    	System.out.print(ele.getText()+" ");
	    }
	    System.out.println();
	    System.out.println("after removing the duplicate");
	    for(String s: removeduplicate)
	    {
	    	System.out.print(s+" ");
	    }
	    
	    
	    driver.close();


	}

}
