package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new EdgeDriver();
		driver.get("https:\\www.amazon.com");
		driver.manage().window().maximize();
		System.out.println("Edge is Open");
		Thread.sleep(3000);
		driver.close();
	    System.out.println("Edge is Closed");

	}

}
