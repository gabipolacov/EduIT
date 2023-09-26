package pruebas;

import static org.testng.Assert.assertEquals;
import org.testng.Assert;
import org.testng.annotations.Test;
import paginas.paginaLogin;
import paginas.paginaCuenta;



public class Laboratorio4_E2 extends TestBase {
	

	paginaLogin login;
	paginaCuenta cuenta;
    
    @Test (priority=1)
   public void InsertarEmail() {
    	login=new paginaLogin(driver);
    	login.createEmail("micorreo"+ Math.random()+"@correo.com");
    	
    }
    
    @Test (priority=2)
    public void CrearCuenta() {	
    	login=new paginaLogin(driver);
    	login.createEmail("micorreo"+ Math.random()+"@correo.com");
    	cuenta=new paginaCuenta(driver);
    	cuenta.createAccount("Mujer", "Maria", "Lopez", "abcde123", "23", "May", "1989");
    	Assert.assertEquals(cuenta.getTexttxt_Class(), "Your account has been created.");
    	
    }
    
    
    

}
