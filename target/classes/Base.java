package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
public WebDriver driver;
	
	public WebDriver initializedriver() throws IOException{
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\Eclipse_Workspace\\E2EProject\\src\\main\\java\\resources\\data.properties");
	    prop.load(fis);
	    String browsername=prop.getProperty("browser");
	    
	    if(browsername.equals("chrome"))
	    {
	    	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	        driver=new ChromeDriver();
	       
	    	
	    	
	    }
	    
	    else if(browsername.equals("firefox"))
	    {
	    	//firefox
	    }

	    else if(browsername.equals("IE"))
	    {
	    	//internetexplorer
	    }

	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    return driver;
 	}
	
	
	public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;


	}

}
