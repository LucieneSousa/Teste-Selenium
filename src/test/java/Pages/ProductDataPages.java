package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Services.DriveManager;

public class ProductDataPages {

	private DriveManager driver;
	private String startdate;
	private String comboInsurance;
	private String comboMeritRating;
	private String combodaMageInsurance;
	private String comboCourtesy;

	public ProductDataPages(DriveManager driver) {
		this.driver = driver;
		this.startdate = "09/06/2021";
		this.comboInsurance = "25.000.000,00";
		this.comboMeritRating = "Super Bonus";
		this.combodaMageInsurance = "Full Coverage";
		this.comboCourtesy = "No";
		
	}

	public void preencheStartDate() {
		driver.sendKeys("startdate", this.startdate);			
	}

	public void preencheIsurancesum() {
		driver.selectByVisibleText("insurancesum", this.comboInsurance);
	}

	public void preencheMeritrating() {
		driver.selectByVisibleText("meritrating", this.comboMeritRating);		
	}

	public void preencheDamageInsurance() {
		driver.selectByVisibleText("damageinsurance", this.combodaMageInsurance);	
		
	}

	public void preencheCourtesycar() {
		driver.selectByVisibleText("courtesycar", this.comboCourtesy);	
	}

	public void preencheOptionalProducts() {
		String xpath = "//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[2]";
		driver.elementClickXpath(xpath);
	}
	
	
	
	
}
