package Com.Actitime_project.TestScript;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Com.Actitime_project.GenericLibrary.Baseclass;
import Com.Actitime_project.GenericLibrary.Filelibrary;
import Com.Actitime_project.GenericLibrary.ListenerImplementation;
import Com.Actitime_project.POM.homepage;
import Com.Actitime_project.POM.taskspage;
@Listeners(ListenerImplementation.class)
public class createcust extends Baseclass{
	@Test
	public void createcustomer() throws EncryptedDocumentException, IOException {
		homepage hp=new homepage(driver);
		hp.getTaskstab().click();
		
		taskspage tp=new taskspage(driver);
		tp.getAddnewbtn().click();
		tp.getNewcust().click();
		Filelibrary f=new Filelibrary();
		String name = f.readdatafromexcelsheet("Sheet1", 5, 1);
		tp.getCustname().sendKeys(name);
		String desp = f.readdatafromexcelsheet("Sheet1", 5, 2);
		tp.getCustdesp().sendKeys(desp);
		tp.getCreatecustbtn().click();
		
		String expectedresult = name;
		String actualresult = driver.findElement(By.xpath("(//div[.='"+name+"'])[2]")).getText();
		SoftAssert s=new SoftAssert();
		s.assertEquals(expectedresult, actualresult);
		s.assertAll();
		
	}
	

}
