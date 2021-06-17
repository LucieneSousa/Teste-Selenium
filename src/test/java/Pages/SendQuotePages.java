package Pages;

import Services.DriveManager;

public class SendQuotePages {

	private DriveManager driver;
	private String email;
	private String phone;
	private String username;
	private String password;
	private String confirmPassword;

	public SendQuotePages(DriveManager driver) {
		this.driver = driver;
		this.email = "luciene@gmail.com";
		this.phone = "99999999";
		this.username = "Luciene";
		this.password = "Qa123456";
		this.confirmPassword = "Qa123456";
	}

	public void preencheEmail() {
		driver.sendKeys("email", this.email);
	}

	public void preenchePhone() {
		driver.sendKeys("phone", this.phone);
	}

	public void preencheUsername() {
		driver.sendKeys("username", this.username);

	}

	public void preenchePassword() {
		driver.sendKeys("password", this.password);

	}

	public void preencheConfirmPassword() {
		driver.sendKeys("confirmpassword", this.confirmPassword);

	}

	public String verificaFrase() {
		driver.waitByTag("h2");
		// WebDriverWait wait = new WebDriverWait(driver, 30);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h2")));

		// driver.findElement(By.tagName("h2"));
		String frase = driver.elementTextByTag("h2");
		return frase;
		// driver.sendKeys("h2", this.verificaFrase);

	}

}
