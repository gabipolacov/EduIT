package EduIT;



import java.io.File;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Laboratorio3_Ejercicio1 {
	
	WebDriver driver;
    String url="http://automationpractice.pl/index.php?controller=authentication#account-creation";

	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "..\\EduIT\\Drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		driver= new ChromeDriver(options);
	}
	
	@BeforeTest
    public void irUrl() {
		driver.get(url);

		
	}
	
	@BeforeClass
	public void maxVentana() {
		driver.manage().window().maximize();

	}
	
	@Test
	public void registrarUsuario() {
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
        txt_passwd.sendKeys("123456");
        
        WebElement cbo_dia = driver.findElement(By.id("days"));
        cbo_dia.sendKeys("15");
        
        WebElement cbo_mes = driver.findElement(By.id("months"));
        cbo_mes.sendKeys("may");
	
        WebElement cbo_año = driver.findElement(By.id("years"));
        cbo_año.sendKeys("1993");
        
        WebElement btn_submitAccount = driver.findElement(By.xpath("//*[text()='Register']"));
		btn_submitAccount.click();
		
		//Assert.assertEquals(url, driver.getCurrentUrl());
		//Assert.assertTrue(url.contentEquals(driver.getCurrentUrl()));
		WebElement txt_Class= driver.findElement(By.xpath("//p[contains(text(),'Your account has been created.')]"));
		Assert.assertEquals(txt_Class.getText(), "Your account has been created.");
		
	}
	
	@AfterMethod
	 public void capturaPantalla () throws Exception {
		File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen, new File("..\\EduIT\\Evidencias\\pantalla.png"));
		}
	

	@AfterClass
	public void finPrueba() {
		System.out.println("Fin de prueba");
      
	}
    //@AfterTest
	//public void cierraNavegador() {
    	//driver.close();
	    //}
    @AfterSuite
	public void finSuite () {
    	System.out.println("Fin de la suite");

	}
	

}
