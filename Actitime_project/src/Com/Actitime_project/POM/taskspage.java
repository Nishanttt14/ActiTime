package Com.Actitime_project.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class taskspage {
	//declaration
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement addnewbtn;
	
	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement newcust;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custname;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement custdesp;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement createcustbtn;
	
	@FindBy(xpath = "//div[@class='greyButton cancelBtn']")
	private WebElement canclebtn;
	
	//initialization
	public taskspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization

	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	public WebElement getNewcust() {
		return newcust;
	}

	public WebElement getCustname() {
		return custname;
	}

	public WebElement getCustdesp() {
		return custdesp;
	}

	public WebElement getCreatecustbtn() {
		return createcustbtn;
	}

	public WebElement getCanclebtn() {
		return canclebtn;
	}
	
	
	
	

}
