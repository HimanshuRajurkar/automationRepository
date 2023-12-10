package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath ="//div[text()='Time-Track']/following-sibling::div/img" ) private WebElement Time_Track_Module;
	@FindBy(xpath = "//div[text()='Tasks']/following-sibling::img") private WebElement Task_Module;
	@FindBy(xpath = "//div[text()='Reports']/following-sibling::img") private WebElement Reports_Module;
	@FindBy(xpath = "//div[text()='Users']/following-sibling::img") private WebElement Users_Module;
	@FindBy(xpath = "//div[text()='Work Schedule']/following-sibling::img") private WebElement Work_Schedule_Module;
	@FindBy(xpath = "//div[text()='Settings']/following-sibling::img") private WebElement Setting_Module;
	@FindBy(partialLinkText = "Logout") private WebElement Logout_Link;
	
	//initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//utilization
	public WebElement getTime_Track_Module() {
		return Time_Track_Module;
	}

	public WebElement getTask_Module() {
		return Task_Module;
	}

	public WebElement getReports_Module() {
		return Reports_Module;
	}

	public WebElement getUsers_Module() {
		return Users_Module;
	}

	public WebElement getWork_Schedule_Module() {
		return Work_Schedule_Module;
	}

	public WebElement getSetting_Module() {
		return Setting_Module;
	}

	public WebElement getLogout_Link() {
		return Logout_Link;
	}

      //Operational Method
	
	public void click_on_Time_Track_Module()
	{
		Time_Track_Module.click();
	}
	
	
	public void click_on_Tasks_Module()
	{
		Task_Module.click();
	}
	
	
	public void click_on_Reports_Module()
    {
		Reports_Module.click();
    }
	
	
	public void click_on_Users_Module()
	{
		Users_Module.click();
	}
	
	
	public void click_on_Work_Schedule()
	{
		Work_Schedule_Module.click();
	}
	
	
	public void click_on_Setting_Module()
	{
		Setting_Module.click();
	}
	
	
	public void click_on_Logout_Link()
	{
		Logout_Link.click();
	}
	
	
	
	
}
