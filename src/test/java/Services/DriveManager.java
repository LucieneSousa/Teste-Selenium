package Services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriveManager {

	WebDriver driver = new Settings().setup();

	public void get(String site) {
		driver.get(site);
	}

	public void quit() {
		driver.quit();
	}

	public void elementClick(String id) {
		findElement(By.id(id)).click();
	}

	public WebElement findElement(By by) {
		return driver.findElement(by);
	}

	public void selectByVisibleText(String id, String value) {
		WebElement we = findElement(By.id(id));
		Select select = new Select(we);
		select.selectByVisibleText(value);
	}

	public void sendKeys(String id, String value) {
		findElement(By.id(id)).sendKeys(value);
	}

	public void elementClickXpath(String xpath) {
		findElement(By.xpath(xpath)).click();
	}
	
	public String elementTextByTag(String tag) {
		return findElement(By.tagName(tag)).getText();
	}

	public void waitById(String id) {
		waitBy(By.id(id));
	}

	public void waitByTag(String tag) {
		waitBy(By.tagName(tag));
	}

	private void waitBy(By by) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

}
