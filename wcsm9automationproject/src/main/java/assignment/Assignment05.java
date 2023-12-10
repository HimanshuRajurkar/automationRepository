package assignment;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment05 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        		
        		driver.get("file:///C:/Users/Himanshu%20Rajurkar/Desktop/wcsm9Link/DurgaMultiSelect.html");
             WebElement menuDropdown = driver.findElement(By.id("idddd"));
             Select sel = new Select(menuDropdown);
             
             List<WebElement> allops = sel.getOptions();
             
             //to eliminate the duplicate
           HashSet<String> hs = new HashSet<String>();
           
           for(int i=0;i<allops.size();i++)
           {
        	   WebElement op = allops.get(i);
        	   String dropdownopt = op.getText();
        	   hs.add(dropdownopt);
           }
           Thread.sleep(2000);
           for (String opts : hs) {
        	   Thread.sleep(2000);
        	   System.out.println(opts);
		}
           
           
	} 

}
