package EduIT;

import org.junit.Ignore;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Laboratorio1 {
	@Test @Ignore
	 public void lab1_Test() {
		 System.out.println("Hola mundo de Automatización!");
		 
	 }
	@Test @Ignore
	
	public void lab1_e1() {
		System.setProperty("webdriver.chrome.driver","..\\EduIT\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.pl/index.php");
		driver.manage().window().maximize();
		driver.close();
		
	}
	@Test @Ignore
	
	public void lab1_e2() {
		System.setProperty("webdriver.gecko.driver","..\\EduIT\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://automationpractice.pl/index.php");
		driver.manage().window().maximize();
		//driver.close();
		
	}
	
	@Test
    public void lab1_e3() {
		System.setProperty("webdriver.chrome.driver", "..\\EduIT\\Drivers\\chromedriver.exe");
		
		
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://automationpractice.pl/index.php");
        driver.manage().window().maximize();
        WebElement txtSearch = driver.findElement(By.id("search_query_top"));
        txtSearch.sendKeys("blouse");
        txtSearch.sendKeys(Keys.ENTER);
		
	}
}
