package steps;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.LoginPage;
public class LoginSteps {
    // Se crean variables privadas para el WebDriver y la página de login.
    private WebDriver driver;
    private LoginPage loginPage;

    // Se crea el constructor de la clase LoginSteps.
    public LoginSteps() {
        // Se inicializa el WebDriver usando el método init de la clase BasePage.
        this.driver = BasePage.initDriver();
        // Crea una nueva instancia de LoginPage y le pasa el WebDriver inicializado.
        this.loginPage = new LoginPage(this.driver);
    }
    // Anotación de Cucumber que define un paso Given en el archivo feature.
    @Given("I am on the automation page")
    public void navigateToPage() {
        // 1 Llama al método navigateToLogin de loginPage para navegar a la página de inicio de sesión.
        // 2 Llama al método clickLogin de loginPage para navegar a la página de inicio de sesión.
        // 3 Llama al método closesBrowser de loginPage para navegar a la página de inicio de sesión.
        this.loginPage.navigateToPageLogin();
        this.loginPage.clickLogin();
        this.loginPage.closesBrowser();
    }
}