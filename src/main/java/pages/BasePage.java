package pages;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class BasePage { //Creamos nuestras variables protegidas, las usaremos en nuestro driver.
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;

    public BasePage(WebDriver driver) { //Creamos el constructor de la clase que inicializa las variables con el WebDriver pasado como argumento
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.actions = new Actions(driver);
        PageFactory.initElements(driver,this);
        driver.manage().window().maximize();
    }
    public static WebDriver initDriver(){ //Creamos el siguiente metodo para inicializar el driver, Chrome Options configura las opciones para el navegador Chrome
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(chromeOptions);
    }
    public void navigateTo(String url){ //Creamos el metodo para navegar que recibe el argumento String url
        driver.get(url);
    }
    public void closeBrowser() { // Método para cerrar el navegador, cierra todas las ventanas abiertas del navegador y finaliza la sesión de WebDriver
        driver.quit();
    }
    private WebElement Find(String locator) { // Método privado para encontrar un elemento en la página usando un localizador XPath
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator))); // Espera hasta que el elemento especificado por el localizador sea visible en la página
    }
    public void clickElement(String locator) { // Método público para hacer clic en un elemento de la página
        this.Find(locator).click(); // Encuentra el elemento usando el método Find y luego hace clic en él
    }
    public Boolean elementIsDisplayed(String locator){ // Método público para detectar si un elemento de la página es visible
        return this.Find(locator).isDisplayed(); //Encuentra el elemento dentro de la pagina
    }
    public void write(String locator, String textToWrite) { // Método público para escribir en un elemento de la página es visible
        this.Find(locator).sendKeys(textToWrite); //Encuentra el elemento dentro de la pagina y escribe
    }
}