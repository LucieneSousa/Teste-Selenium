package steps;

import static org.junit.Assert.assertEquals;

import Pages.FormVehiclePages;
import Pages.InsurantDataPages;
import Pages.PriceOptionPages;
import Pages.ProductDataPages;
import Pages.SendQuotePages;
import Services.DriveManager;

import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;

public class PreencherFormularioSteps {

	DriveManager driveManager = new DriveManager();

	@Dado("que o usuario entra no {string} da SampleApp")
	public void que_o_usuario_entra_no_da_sample_app(String site) {
		driveManager.get(site);
	}

	@Então("seleciona a aba “Enter Vehicle Data”")
	public void seleciona_a_aba_enter_vehicle_data() {
		driveManager.elementClick("entervehicledata");
	}

	@Então("preenche o formulário Vehicle Data")
	public void preenche_o_formulário_vehicle_data() {
		FormVehiclePages formVehicle = new FormVehiclePages(driveManager);

		formVehicle.preencheTextoMake();
		formVehicle.preencheTextoModel();
		formVehicle.preencheCylinder();
		formVehicle.preencheEnginePerformance();
		formVehicle.preencheDateManufacture();

		formVehicle.preencheNumberSeats();
		formVehicle.preencheRightHandDrive();

		formVehicle.preencheNumberSeatsMotorcycle();
		formVehicle.preencheFuel();

		formVehicle.preenchePayload();
		formVehicle.preencheTotalWeight();
		formVehicle.preencheListPrice();
		formVehicle.preenchePlateNumber();
		formVehicle.preencheAnnualMileage();

	}

	@Então("clica no botão {string} para Vehicle Data")
	public void clica_no_botão_para_vehicle_data(String next) {
		driveManager.elementClick("nextenterinsurantdata");
	}

	@Então("o usuario preenche o formulário na aba “Enter Insurant Data”")
	public void o_usuario_preenche_o_formulário_na_aba_enter_insurant_data() {
		InsurantDataPages insurantDataPages = new InsurantDataPages(driveManager);
		insurantDataPages.preencheCampoFirstname();
		insurantDataPages.preencheCampoLastname();
		insurantDataPages.preencheCampoBirthdate();
		insurantDataPages.preencheCampoStreetAddress();
		insurantDataPages.preencheCampoCountry();
		insurantDataPages.preencheCampoGender();
		insurantDataPages.preencheZipcode();
		insurantDataPages.preencheCity();
		insurantDataPages.preencheOccupation();
		insurantDataPages.preencheHobbies();
		insurantDataPages.preencheWebsite();

	}

	@Então("clica no botão {string} para Insurant Data")
	public void clica_no_botão_para_insurant_data(String next) {
		driveManager.elementClick("nextenterproductdata");
	}

	@Então("o usuário preenche o formulário na aba “Enter Product Data”")
	public void o_usuário_preenche_o_formulário_na_aba_enter_product_data() {
		ProductDataPages productDataPages = new ProductDataPages(driveManager);
		productDataPages.preencheStartDate();
		productDataPages.preencheIsurancesum();
		productDataPages.preencheMeritrating();
		productDataPages.preencheDamageInsurance();
		productDataPages.preencheCourtesycar();
		productDataPages.preencheOptionalProducts();

	}

	@Então("clica no botão {string} para Product Data")
	public void clica_no_botão_para_product_data(String next) {
		driveManager.elementClick("nextselectpriceoption");
	}

	@Então("o usuário preenche o formulário na aba “Select Price Option”")
	public void o_usuário_preenche_o_formulário_na_aba_select_price_option() {
		PriceOptionPages optionPages = new PriceOptionPages(driveManager);
		optionPages.preenchePrice();

	}

	@Então("clica no botão {string} para Price Option")
	public void clica_no_botão_para_price_option(String next) {
		PriceOptionPages optionPages = new PriceOptionPages(driveManager);
		optionPages.nextQuote();
	}

	@Então("o usuário preenche o formulário na aba “Send Quote”")
	public void o_usuário_preenche_o_formulário_na_aba_send_quote() {

		SendQuotePages sendQuotePages = new SendQuotePages(driveManager);
		sendQuotePages.preencheEmail();
		sendQuotePages.preenchePhone();
		sendQuotePages.preencheUsername();
		sendQuotePages.preenchePassword();
		sendQuotePages.preencheConfirmPassword();

	}

	@Então("clica no botão {string}")
	public void clica_no_botão(String send) {
		driveManager.elementClick("sendemail");
	}

	@Então("deve aparecer na tela a mensagem {string}")
	public void deve_aparecer_na_tela_a_mensagem(String resultado) {

		SendQuotePages sendQuotePages = new SendQuotePages(driveManager);
		String frase = sendQuotePages.verificaFrase();

		System.out.println(frase);
		System.out.println(resultado);
		assertEquals(frase, resultado);
	}

	@After
	public void dps() {
		driveManager.quit();
	}

}
