package Edu_it;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.time.Duration;


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
import org.testng.annotations.AfterClass;


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
	
	}
	
	@BeforeTest
    public void irUrl() {

		
	}
	
	@BeforeClass
	public void maxVentana() {

	}
	
	@Test(priority=1 ,description="Test")
	public void registrarUsuario() {
		
			
		
	
	}
	
	@Test(enabled=false)
	public void pruebaTest() {
	    assertTrue(true);
	}
	

	@AfterClass
	public void finPrueba() {
	
      
	}
    @AfterTest
	public void cierraNavegador() {
     
	    }
    @AfterSuite
	public void finSuite () {
    

	}
	

}
