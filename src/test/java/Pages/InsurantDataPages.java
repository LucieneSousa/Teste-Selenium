package Pages;

import Services.DriveManager;

public class InsurantDataPages {
	
	private DriveManager driver;
	private String firstname;
	private String lastname;
	private String birthdate;
	private String streetaddress;
	private String country;
	private String zipcode;
	private String city;
	private String occupation;
	private String website;	
	
	
	public InsurantDataPages(DriveManager driver) {
		this.driver = driver;
		this.firstname = "Luciene";
		this.lastname = "Sousa";
		this.birthdate = "07/31/1984";
		this.streetaddress = "Rua das Flores";
		this.country = "Brazil";
		this.zipcode = "0000";
		this.city = "Rio de Janeiro";
		this.occupation = "Employee";
		this.website = "https://www.linkedin.com/in/lucieneborges/";
		
	}


	public void preencheCampoFirstname() {
		driver.sendKeys("firstname", this.firstname);
		
	}


	public void preencheCampoLastname() {
		driver.sendKeys("lastname", this.lastname);
		
	}


	public void preencheCampoBirthdate() {
		driver.sendKeys("birthdate", this.birthdate);
		
	}


	public void preencheCampoStreetAddress() {
		driver.sendKeys("streetaddress", this.streetaddress);
		
	}


	public void preencheCampoCountry() {
		driver.selectByVisibleText("country", this.country);
		
	}


	public void preencheCampoGender() {
		String xpath = "//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]";
		driver.elementClickXpath(xpath);
	}


	public void preencheZipcode() {
		  driver.sendKeys("zipcode", this.zipcode);
		
	}


	public void preencheCity() {
		driver.sendKeys("city", this.city);		
	}


	public void preencheOccupation() {
		driver.selectByVisibleText("occupation", this.occupation);
		
	}


	public void preencheHobbies() {
		String xpath = "//form[@id='insurance-form']/div/section[2]/div[10]/p/label[1]/span";
		driver.elementClickXpath(xpath);
		
	}


	public void preencheWebsite() {
		driver.sendKeys("website", this.website);
		
	}
}
