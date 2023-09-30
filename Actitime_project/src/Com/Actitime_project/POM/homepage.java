package Com.Actitime_project.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	//declaration
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement taskstab;
	
	@FindBy(xpath = "//div[.='Reports']")
	private WebElement reportstab;
	
	@FindBy(xpath = "//div[.='Users']")
	private WebElement userstab;
	
	@FindBy(xpath = "//a[.='Logout']")
	private WebElement logoutbtn;
	
	//initialization
	public homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getTaskstab() {
		return taskstab;
	}

	public WebElement getReportstab() {
		return reportstab;
	}

	public WebElement getUserstab() {
		return userstab;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}
	
	
	

}
