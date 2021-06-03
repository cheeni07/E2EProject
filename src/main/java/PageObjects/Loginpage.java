package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Loginpage {

public WebDriver driver;
	
	//create object for locators
	
	By signin = By.cssSelector("a[href*='sign_in']");
	By title= By.cssSelector(".text-center>h2");
	public Loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public Creduser getLogin()
	{
		
		driver.findElement(signin).click();
		Creduser cred = new Creduser(driver);
		return cred;
	}
	
	public WebElement getTitle()
	{
		
		return driver.findElement(title);
	}
	
}
