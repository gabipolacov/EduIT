package paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


public class paginaInicio {
	
	@FindBy(xpath="//a[@class='login'][contains(.,'Sign in')]")
	 WebElement btnSignin;
	
	public paginaInicio(WebDriver driver) {
		PageFactory.initElements(new AjaxElementLocatorFactory (driver,30), this); // Inicializar los elementos de la clase
	}
	
	public void hacerClicEnSignIn() {
		btnSignin.click();
	}
}
