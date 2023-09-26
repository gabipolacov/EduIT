package paginas;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class paginaCuenta {
	
	public paginaCuenta(WebDriver driver) {
		 PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20),this);
	}
	
	
	@FindBy(id="id_gender2")
	WebElement rdb_Title2;
	
	@FindBy(id="id_gender1")
	WebElement rdb_Title1;
	
	@FindBy(id="customer_firstname")
	WebElement txt_FirstName;
	
	@FindBy(id="customer_lastname")
	WebElement txt_LastName;
	
	@FindBy(id="passwd")
	WebElement txt_passwd;
	
	@FindBy(id="days")
	WebElement cbo_dia;
	
	@FindBy(id="months")
	WebElement cbo_mes;
	
	@FindBy(id="years")
	WebElement cbo_año;
	
	@FindBy(xpath="//*[text()='Register']")
	WebElement btn_submitAccount;
	
	@FindBy(xpath="//p[contains(text(),'Your account has been created.')]")
	WebElement txt_Class;
	
	
	
	 
	public void createAccount(String genero, String nombre, String Apellido, String Password, String dia, String mes, String año) {
		 //txtEmail.clear();
		
		if (genero.equalsIgnoreCase("Hombre")){
			
			rdb_Title1.click();
		}
		else
		{
			rdb_Title2.click();
		}
	  
		txt_FirstName.sendKeys(nombre);
		txt_LastName.sendKeys(Apellido);
		txt_passwd.sendKeys(Password);
		//Select cbo_dia=new Select(driver.findElement(By.id("days")));
		cbo_dia.sendKeys(dia);
		//Select cbo_mes=new Select(driver.findElement(By.id("months")));
		cbo_mes.sendKeys(mes);
		//Select cbo_año=new Select(driver.findElement(By.id("years")));
		cbo_año.sendKeys(año);
		btn_submitAccount.click();
		   
      }


	 
	 public String getTexttxt_Class() {
		 return txt_Class.getText();
	 }
	
}
