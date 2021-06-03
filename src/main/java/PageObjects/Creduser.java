package PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Creduser {

	public WebDriver driver;

	By userid= By.id("user_email");
	By pass = By.id("user_password");
	By login = By.name("commit");
	By forgotPassword = By.cssSelector("[href*='password/new']");
	
	
	public Creduser(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	
	public ForgotPassword forgotPassword()
	{
		driver.findElement(forgotPassword).click();
		ForgotPassword fp = new ForgotPassword(driver);
		return fp;
	}
	
	public WebElement getuserid(){
		
		return driver.findElement(userid);
	}

    public WebElement getpass(){
		
		return driver.findElement(pass);
	}
    
    public WebElement getloginbtn(){
		
		return driver.findElement(login);
	}


}
