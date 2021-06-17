package Pages;

import Services.DriveManager;

public class FormVehiclePages {

	private DriveManager driver;
	private String make;
	private String model;
	private String cylinder;
	private String enginePerformance;
	private String manufactureDate;
	private String seats;
	private String seatsMotor;
	private String fuelType;
	private String payload;
	private String weight;
	private String listPrice;
	private String licenseplatenumber;
	private String annualMileage;


	public FormVehiclePages(DriveManager driver) {
		this.driver = driver;
        this.make = "Porsche"; 
        this.model = "Scooter"; 
        this.cylinder = "2000";
        this.enginePerformance = "1200"; 
        this.manufactureDate = "05/24/2021"; 
        this.seats = "5"; 
		this.seatsMotor = "1";		
        this.fuelType = "Diesel"; 
        this.payload = "1000";
        this.weight = "25000";        
        this.listPrice = "80000"; 
        this.licenseplatenumber = "1234567890";
        this.annualMileage = "100000"; 
	}

	public void preencheTextoMake() {
		driver.selectByVisibleText("make", this.make);
	}

	public void preencheTextoModel() {
		driver.selectByVisibleText("model", this.model);
	}

	public void preencheCylinder() {
		driver.sendKeys("cylindercapacity", this.cylinder);
	}

	public void preencheEnginePerformance() {
		driver.sendKeys("engineperformance", this.enginePerformance);
	}

	public void preencheDateManufacture() {
		driver.sendKeys("dateofmanufacture", this.manufactureDate);
	}

	public void preencheNumberSeats() {
		driver.selectByVisibleText("numberofseats", this.seats);
	}

	public void preencheRightHandDrive() {
		String xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]";
		driver.elementClickXpath(xpath);
	}

	public void preencheNumberSeatsMotorcycle() {
		driver.selectByVisibleText("numberofseatsmotorcycle", this.seatsMotor);
	}

	public void preencheFuel() {
		driver.selectByVisibleText("fuel", this.fuelType);		
	}

	public void preenchePayload() {
		driver.sendKeys("payload", this.payload);		
	}

	public void preencheTotalWeight() {
		driver.sendKeys("totalweight", this.weight);		
	}

	public void preencheListPrice() {
		driver.sendKeys("listprice", this.listPrice);		
	}

	public void preenchePlateNumber() {
		driver.sendKeys("licenseplatenumber", this.licenseplatenumber);
	}

	public void preencheAnnualMileage() {
		driver.sendKeys("annualmileage", this.annualMileage);
	}
	
	

}
