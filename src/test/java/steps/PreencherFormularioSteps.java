package steps;


import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.VehiclePage;
import Services.Settings;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;

public class PreencherFormularioSteps {	
	 
    WebDriver driver = new Settings().setup();	 
	
	@Dado("que o usuario entra no {string} da SampleApp")
	public void que_o_usuario_entra_no_da_sample_app(String site) {
	   driver.get(site);
	}

	@Então("seleciona a aba “Enter Vehicle Data”")
	public void seleciona_a_aba_enter_vehicle_data() {
	    driver.findElement(By.id("entervehicledata")).click();
	}

	@Então("preenche o formulário Vehicle Data")
	public void preenche_o_formulário_vehicle_data() {		
		WebElement comboMake	=	driver.findElement(By.id("make"));
	    Select select	=	new	Select(comboMake);
	    select.selectByVisibleText("Porsche");
	     
	    WebElement comboModel	=	driver.findElement(By.id("model"));
	    select	=	new	Select(comboModel);
	    select.selectByVisibleText("Scooter");
	     
	    driver.findElement(By.id("cylindercapacity")).sendKeys("2000");	    
	    driver.findElement(By.id("engineperformance")).sendKeys("120");
	    driver.findElement(By.id("dateofmanufacture")).sendKeys("05/24/2021");
	    
	    
	    WebElement comboNumberSeats	=	driver.findElement(By.id("numberofseats"));
	    select	=	new	Select(comboNumberSeats);
	    select.selectByVisibleText("5");

	    
	    driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]")).click();
	   
	
	    WebElement comboNumberSeatsMotor	=	driver.findElement(By.id("numberofseatsmotorcycle"));
	    select	=	new	Select(comboNumberSeatsMotor);
	    select.selectByVisibleText("1");
	     
	    WebElement comboFuel	=	driver.findElement(By.id("fuel"));
	    select	=	new	Select(comboFuel);
	    select.selectByVisibleText("Diesel");
	     
	    driver.findElement(By.id("payload")).sendKeys("1000");
	    driver.findElement(By.id("totalweight")).sendKeys("10000");
	    driver.findElement(By.id("listprice")).sendKeys("25000");
	    driver.findElement(By.id("licenseplatenumber")).sendKeys("1234567890");
	    driver.findElement(By.id("annualmileage")).sendKeys("100000");	  
	     
	}

	@Então("clica no botão {string} para Vehicle Data")
	public void clica_no_botão_para_vehicle_data(String next) {
	   driver.findElement(By.id("nextenterinsurantdata")).click();
	}

	@Então("o usuario preenche o formulário na aba “Enter Insurant Data”")
	public void o_usuario_preenche_o_formulário_na_aba_enter_insurant_data() {
	    driver.findElement(By.id("firstname")).sendKeys("Luciene");
	    driver.findElement(By.id("lastname")).sendKeys("Sousa");
	    driver.findElement(By.id("birthdate")).sendKeys("07/31/1984");
	    driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]")).click();
	    driver.findElement(By.id("streetaddress")).sendKeys("Rua das Flores");
	    
	    WebElement comboCountry = driver.findElement(By.id("country"));
	    Select select = new Select(comboCountry);
	    select.selectByVisibleText("Brazil");
	    
	    driver.findElement(By.id("zipcode")).sendKeys("0000");
	    driver.findElement(By.id("city")).sendKeys("Rio de Janeiro");
	    
	    
	    WebElement comboOccupation =  driver.findElement(By.id("occupation"));
	    select = new Select(comboOccupation);
	    select.selectByVisibleText("Employee");
	    
	    driver.findElement(By.xpath("//form[@id='insurance-form']/div/section[2]/div[10]/p/label[1]/span")).click();
	    
	    driver.findElement(By.id("website")).sendKeys("https://www.linkedin.com/in/lucieneborges/");
	}

	@Então("clica no botão {string} para Insurant Data")
	public void clica_no_botão_para_insurant_data(String next) {
	   driver.findElement(By.id("nextenterproductdata")).click();
	}

	@Então("o usuário preenche o formulário na aba “Enter Product Data”")
	public void o_usuário_preenche_o_formulário_na_aba_enter_product_data() {
	   driver.findElement(By.id("startdate")).sendKeys("09/06/2021");
	   
	   WebElement comboInsurance = driver.findElement(By.id("insurancesum"));
	   Select select = new Select(comboInsurance);
	   select.selectByVisibleText("25.000.000,00");
	   
	   WebElement comboMeritRating = driver.findElement(By.id("meritrating"));
	   select = new Select(comboMeritRating);
	   select.selectByVisibleText("Super Bonus");
	   
	   WebElement combodaMageInsurance = driver.findElement(By.id("damageinsurance"));
	   select = new Select(combodaMageInsurance);
	   select.selectByVisibleText("Full Coverage");
	   
	   WebElement comboCourtesy = driver.findElement(By.id("courtesycar"));
	   select =  new Select(comboCourtesy);
	   select.selectByVisibleText("No");
	   
	   driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]")).click();
	   
	}

	@Então("clica no botão {string} para Product Data")
	public void clica_no_botão_para_product_data(String next) {
	   driver.findElement(By.id("nextselectpriceoption")).click();
	}

	@Então("o usuário preenche o formulário na aba “Select Price Option”")
	public void o_usuário_preenche_o_formulário_na_aba_select_price_option() {
	   driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]")).click();
	}

	@Então("clica no botão {string} para Price Option")
	public void clica_no_botão_para_price_option(String next) {
	  WebDriverWait wait = new WebDriverWait(driver, 30);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nextsendquote")));
	  driver.findElement(By.id("nextsendquote")).click();
	  	  
	}

	@Então("o usuário preenche o formulário na aba “Send Quote”")
	public void o_usuário_preenche_o_formulário_na_aba_send_quote() {
	   driver.findElement(By.id("email")).sendKeys("luciene@gmail.com");
	   driver.findElement(By.id("phone")).sendKeys("99999999");
	   driver.findElement(By.id("username")).sendKeys("Luciene");
	   driver.findElement(By.id("password")).sendKeys("Pa123456");
	   driver.findElement(By.id("confirmpassword")).sendKeys("Pa123456");  
	}

	@Então("clica no botão {string}")
	public void clica_no_botão(String send) {
	    driver.findElement(By.id("sendemail")).click();
	}

	@Então("deve aparecer na tela a mensagem {string}")
	public void deve_aparecer_na_tela_a_mensagem(String resultado) {
		  WebDriverWait wait = new WebDriverWait(driver, 30);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h2")));
		  
		  driver.findElement(By.tagName("h2")); 
		  String frase = driver.findElement(By.tagName("h2")).getText();
		  System.out.println(frase);
		  System.out.println(resultado);
		  assertEquals(frase, resultado);		  
	}
	
	
	
//	@After
//	public void dps(){
//		driver.quit();
//	}
	

}
