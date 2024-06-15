package pages;
import org.openqa.selenium.WebDriver;
//La clase LoginPage extiende de BasePage para obtener los metodos de esa clase.
public class LoginPage extends BasePage {
    //Se crea la variable login que recibira el elemento Xpath
    private String login = "//a[@href='/login']";
    //Se crea el constructor de la clase padre BasePage, Se usa para inicializar la clase padre BasePage con un objeto WebDriver
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    //Se crea el metodo navigate que llama al metodo navigateTo heredado de BasePage y se pasa la URL.
    public void navigateToPageLogin() {
        this.navigateTo("https://www.automationexercise.com/");
    }
    //Se crea el metodo close que llama al metodo closeBrowser heredado de BasePage y cierra el driver
    public void closesBrowser(){
        this.closeBrowser();
    }
    //Se crea el metodo clickLogin que llama al metodo clickElement heredado de BasePage
    public void clickLogin() {
        this.clickElement(this.login);
    }
}