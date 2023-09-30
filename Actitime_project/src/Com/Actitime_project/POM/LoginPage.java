package Com.Actitime_project.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declaration
	@FindBy(id="username")
	private WebElement un;
	
	



	@FindBy(name="pwd")
	private WebElement pswd;
	
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement login;
	
	
	
	//initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getUn() {
		return un;
	}



	public WebElement getPswd() {
		return pswd;
	}



	public WebElement getLogin() {
		return login;
	}

}
