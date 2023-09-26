package Common;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Setup {
		
	public static WebDriver driver = null;
		  
	@BeforeMethod
	public void initialize() throws IOException {
		Properties properties=new Properties();
		properties.load(new FileReader("Configs/Configuration.properties"));
		
		String urlWeb=properties.getProperty("url");
		String driverPath=properties.getProperty("driver");
		
		System.out.println(urlWeb);
		System.out.println(driverPath);
		;
		  
		System.setProperty("webdriver.chrome.driver",driverPath);
		    
		ChromeOptions options=new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
				driver= new ChromeDriver(options);	
		    
		        // To maximize browser
		        driver.manage().window().maximize();
		    
		        // To open  site
		        driver.get(urlWeb);
		    }
		  
		    
	@AfterMethod
		    
	// Test cleanup
		    
	public void TeardownTest() {
		        
		Setup.driver.quit();
		    }
	}


