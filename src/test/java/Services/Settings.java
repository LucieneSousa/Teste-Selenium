package Services;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Settings {
	
	WebDriver driver;
	
	public static String pathDriver = System.getProperty("user.dir") + File.separator + "driver" + File.separator + "chromedriver";
	
	public WebDriver setup(){
        System.setProperty("webdriver.chrome.driver", pathDriver);
        driver = new ChromeDriver();        
        driver.manage().window().maximize();
        
        return driver;
	} 
	
	
}
