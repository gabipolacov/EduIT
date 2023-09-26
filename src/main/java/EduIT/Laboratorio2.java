package EduIT;

import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.junit.AfterClass;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.openqa.selenium.By;

import java.time.Duration;




@Test
public class Laboratorio2 {
	 WebDriver driver;
	 String url= "http://www.automationpractice.pl/index.php?controller=authentication&back=my-account";
	 
	@BeforeSuite
	public void lab2_Setup() {
			System.setProperty("webdriver.chrome.driver", "..\\EduIT\\Drivers\\chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			options.addArguments("remote-allow-origins=*");
			driver= new ChromeDriver(options);
			driver= new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
	 }
	
	@BeforeTest
	public void lab2_IrURL() {
			driver.get(url);
			driver.manage().window().maximize();
	 }
	
	@BeforeClass
	public void lab2_maxwin() {
			driver.manage().window().maximize();
	 }
	 
	@Test
	 public void lab2_e1() {
			
			WebElement txt_ValidateEmail= driver.findElement(By.id("email_create"));
		    txt_ValidateEmail.sendKeys("micorreo"+ Math.random()+"@correo.com");
		    
		    WebElement btn_Create=driver.findElement(By.id("SubmitCreate"));
		    btn_Create.click();
		    
		    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10)); 
		    WebElement rdb_Title= wait.until(ExpectedConditions.elementToBeClickable(By.id("id_gender2")));
			rdb_Title.click();
			
			WebElement txt_FirstName= driver.findElement(By.name("customer_firstname"));
			txt_FirstName.sendKeys("Nombre");
			
			WebElement txt_LastName= driver.findElement(By.name("customer_lastname"));
			txt_LastName.sendKeys("Apellido");
			
			WebElement txt_passwd = driver.findElement(By.id("passwd")); 
	        txt_passwd.sendKeys("123456789");
	        
	        WebElement cbo_dia = driver.findElement(By.id("days"));
	        cbo_dia.sendKeys("15");
	        
	        WebElement cbo_mes = driver.findElement(By.id("months"));
	        cbo_mes.sendKeys("may");
		
	        WebElement cbo_año = driver.findElement(By.id("years"));
	        cbo_año.sendKeys("1993");
	        
	        WebElement btn_submitAccount = driver.findElement(By.xpath("//*[text()='Register']"));
			btn_submitAccount.click();
			
			WebElement txt_Class= driver.findElement(By.xpath("//p[contains(text(),'Your account has been created.')]"));
			AssertJUnit.assertTrue(txt_Class.getText() == " Your account has been created.");
					
			
		}
	 	@AfterClass
		public void tear_Down() {
			driver.close();
			}
	
	
	

}
