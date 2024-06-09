package pages;
import org.openqa.selenium.WebDriver;
//La clase LoginPage extiende de BasePage para obtener los metodos de esa clase.
public class LoginPage extends BasePage {
//Se crea el constructor de la clase padre BasePage, Se usa para inicializar la clase padre BasePage con un objeto WebDriver
    public LoginPage(WebDriver driver) {
        super(driver);
    }
//Se crea el metodo navigate que llama al metodo navigateTo heredado de BasePage y se pasa la URL.
    public void navigateToLogin() {
        navigateTo("https://www.automationexercise.com/login");
    }
}