package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.LoginPage;

public class LoginSteps {     // Se crean variables privadas para el WebDriver y la página de login.
    private WebDriver driver;
    private LoginPage loginPage;

    public LoginSteps() { // Se crea el constructor de la clase LoginSteps.
        this.driver = BasePage.initDriver(); // Se inicializa el WebDriver usando el método init de la clase BasePage.
        this.loginPage = new LoginPage(this.driver); // Crea una nueva instancia de LoginPage y le pasa el WebDriver inicializado.
    }

    @Given("I am on the automation page") // Anotación de Cucumber que define un paso Given en el archivo feature.
    public void navigateToPage() {
        this.loginPage.navigateToPageLogin();  // Llama al método navigateToLogin de loginPage para navegar a la página de inicio de sesión.
        this.loginPage.clickLogin(); // Llama al método clickLogin de loginPage para navegar a la página de inicio de sesión.
        this.loginPage.textValidate(); // Llama al método textValidate de loginPage para validar si el texto es visible
    }

    @When("I enter valid username and password") // Anotación de Cucumber que define un paso When en el archivo feature.
    public void insertNameMail() {
        this.loginPage.writeName("Andres"); // Llama al método writeName de loginPage para escribir el user
        this.loginPage.writeMail("afquimbayoa@gmail.com"); // Llama al método writeMail de loginPage para escribir el mail
    }

    @And("I click on the login button") // Anotación de Cucumber que define un paso When en el archivo feature.
    public void clicSign() {
        this.loginPage.clickSign(); // Llama al método clickSign de loginPage para hacer clic
    }
    @Then("I should be redirected to the date")
    public void textDatesUser() {
        this.loginPage.textValidateDate(); // Llama al método textValidateDate de loginPage para validar un texto
    }
    @And("I am complete information date")
    public void clicRadio(){
        this.loginPage.clickradio();
        this.loginPage.closeBrowser();
    }
}