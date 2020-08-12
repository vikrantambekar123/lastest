package base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass 
{
	public static WebDriver driver;
	public static Properties prop;
	
	public Baseclass()
	{
		try 
		{
			prop=new Properties();
			FileInputStream file=new FileInputStream("C:\\Users\\ambek\\eclipse-workspace\\Cucumber\\config.properties");
			prop.load(file);
			
		} 
		catch (Exception e) 
		{
			System.out.println("File Not Found");
		}
	}
	
	public static void Initilization()
	{
	String browsername=prop.getProperty("browser");
	if(browsername.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ambek\\OneDrive\\Desktop\\Vikrant data\\Selenium\\chromedriver.exe");
		
		driver=new ChromeDriver();
	
		driver.get(prop.getProperty("url"));
	}
	
	}

	
}
