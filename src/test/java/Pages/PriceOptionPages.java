package Pages;

import Services.DriveManager;

public class PriceOptionPages {
	
	private DriveManager driver;
	
	
	public PriceOptionPages(DriveManager driver) {
		this.driver = driver;
	}


	public void preenchePrice() {
		driver.elementClickXpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]");
		
	}


	public void nextQuote() {
		driver.waitById("nextsendquote");
		driver.elementClick("nextsendquote");
	}
	
}
