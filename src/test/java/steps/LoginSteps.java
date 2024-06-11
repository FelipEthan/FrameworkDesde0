package steps;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.LoginPage;
public class LoginSteps {
    // Variables privadas para el WebDriver y la página de login.
    private WebDriver driver;
    private LoginPage loginPage;
    // Constructor de la clase LoginSteps.
    public LoginSteps() {
        // Inicializa el WebDriver usando el método init de la clase BasePage.
        this.driver = BasePage.initDriver();
        // Crea una nueva instancia de LoginPage y le pasa el WebDriver inicializado.
        this.loginPage = new LoginPage(this.driver);
    }
    // Anotación de Cucumber que define un paso Given en el archivo feature.
    @Given("I am on the automation page")
    public void navigateToPage() {
        // Llama al método navigateToLogin de la página de login para navegar a la página de inicio de sesión.
        this.loginPage.navigateToPageLogin();
    }
}