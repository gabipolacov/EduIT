package pruebas;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver; //= null;
	  
    @BeforeMethod
    public void initialize() throws IOException {
  
    	WebDriverManager.chromedriver().setup();
    
        ChromeOptions options=new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		driver= new ChromeDriver(options);
    
        // To maximize browser
        driver.manage().window().maximize();
    
        // To open  site
        driver.get("http://automationpractice.pl/index.php?controller=authentication&back=my-account");
    }
  
    @AfterMethod
    // Test cleanup
    public void TeardownTest() {
        TestBase.driver.quit();
    }
}


