package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TasksPage {

	// Store the WebElement of TasksPage
	@FindBy(partialLinkText = "Projects & Customers")
	private WebElement Projects_Customers_SubModule;
	@FindBy(xpath = "//input[@value='Create New Customer']")
	private WebElement Create_New_Customer_Button;
	@FindBy(xpath = "//input[@value='Create New Project']")
	private WebElement Create_New_Project_Button;
	
	@FindBy(name = "name")
	private WebElement customer_nameTB;
	@FindBy(name = "createCustomerSubmit")
	private WebElement create_customer_Button;
	
	@FindBy(name = "customerId")
	private WebElement customer_name_dropdown;
	@FindBy(name = "name")
	private WebElement project_nameTB;
	@FindBy(name = "createProjectSubmit")
	private WebElement create_project_button;
	
	public TasksPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getProjects_Customers_SubModule() {
		return Projects_Customers_SubModule;
	}

	public WebElement getCreate_New_Customer_Button() {
		return Create_New_Customer_Button;
	}

	public WebElement getCreate_New_Project_Button() {
		return Create_New_Project_Button;
	}

	public WebElement getCustomer_nameTB() {
		return customer_nameTB;
	}

	public WebElement getCreat_customer_Button() {
		return create_customer_Button;
	}

	public WebElement getCustomer_name_dropdown() {
		return customer_name_dropdown;
	}

	public WebElement getProject_nameTB() {
		return project_nameTB;
	}

	public WebElement getCreate_project_button() {
		return create_project_button;
	}
	
	public void createcustomer_createproject_method(String cust_name,String pro_name) throws InterruptedException
	{
		Projects_Customers_SubModule.click();
		Thread.sleep(1000);
		Create_New_Customer_Button.click();
		Thread.sleep(1000);
		customer_nameTB.sendKeys(cust_name);
		create_customer_Button.click();
		Thread.sleep(1000);
		Create_New_Project_Button.click();
		Select sel = new Select(customer_name_dropdown);
		sel.selectByVisibleText(cust_name);
		Thread.sleep(1000);
		project_nameTB.sendKeys(pro_name);
		create_project_button.click();		
		
	}
	
	
	
}
