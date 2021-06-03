package Academy.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Creduser;
import PageObjects.ForgotPassword;
import PageObjects.Loginpage;


import resources.Base;

public class HomePage extends Base {
	
	public  WebDriver driver;
	

	  private static Logger log = LogManager.getLogger(HomePage.class.getName());

	
	@BeforeTest 
	public void initialise() throws IOException{
		
		driver=initializedriver();
		log.info("Driver is initiated");;
		
		
	}
	
	
	@Test(dataProvider="getdata")
	public void Homepagenav(String username,String password) throws IOException{
		
		driver.get("http://www.qaclickacademy.com/");
		log.info("URL is fetched");
		Loginpage login = new Loginpage(driver);
		Creduser cred = login.getLogin();
		cred.getuserid().sendKeys(username);
		cred.getpass().sendKeys(password);
		cred.getloginbtn().click();
		
		ForgotPassword fp = cred.forgotPassword();
		fp.getemailid().sendKeys("abhishek.rawat");
		fp.getsendme().click();
		
		
		
		}
	
	@AfterTest
	public void closebrowser()
	{
		driver.close();
		log.info("Driver closed");
	}
	
 @DataProvider
 public Object[][] getdata(){
	   
	   Object[][]  data = new Object[3][2];
	   
	   data[0][0]="abhishek";
	   data[0][1]="1267";
	   data[1][0]="geeta08";
	   data[1][1]="12345";
	   data[2][0]="jeremy1";
	   data[2][1]="12345";
	  
    return data;
 }

}
