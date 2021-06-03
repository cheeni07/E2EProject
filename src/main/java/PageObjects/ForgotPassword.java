package PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ForgotPassword {

	public WebDriver driver;

	By emailid= By.id("user_email");
	By sendme=By.cssSelector("[value='Send Me Instruction']");
	
	public ForgotPassword(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	
	public WebElement getemailid(){
		
		return driver.findElement(emailid);
	}

    public WebElement getsendme(){
		
		return driver.findElement(sendme);
	}
    
    }
