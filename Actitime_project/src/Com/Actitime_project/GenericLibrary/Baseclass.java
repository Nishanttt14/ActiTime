package Com.Actitime_project.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Com.Actitime_project.POM.LoginPage;

public class Baseclass {
	Filelibrary f=new Filelibrary();
	public WebDriver driver;
	@BeforeSuite
	public void databaseconnection() {
		Reporter.log("Database Connected",true);
	}
	@BeforeClass
	public void launchbrowser() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String URL = f.readdatafrompropertyfile("url");
		driver.get(URL);
		Reporter.log("Browser launch successfully",true);
	}
	@BeforeMethod
	public void LoginActitime() throws IOException {
		//driver.findElement(By.id(null))//manually
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		//driver.findElement(By.xpath("//div[text()='Login ']")).click();
		LoginPage lp=new LoginPage(driver);
		String UN = f.readdatafrompropertyfile("username");
		lp.getUn().sendKeys(UN);
		String PASS = f.readdatafrompropertyfile("password");
		lp.getPswd().sendKeys(PASS);
		lp.getLogin().click();  
		
		
		
		Reporter.log("logged in successfully",true);
	}
	@AfterMethod
	public void logoutactitime() {
		driver.findElement(By.id("logoutLink")).click();
		Reporter.log("Logout successfully",true);
		
	}
	@AfterClass
	public void closebrowser() {
		driver.close();
		Reporter.log("browser closed successfully",true);
	}

}
