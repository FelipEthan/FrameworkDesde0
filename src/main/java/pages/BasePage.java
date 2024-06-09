package pages;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage {
    //Creamos nuestras variables protegidas, las usaremos en nuestro driver.
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;

    //Creamos el constructor de la clase que inicializa las variables con el WebDriver pasado como argumento
    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.actions = new Actions(driver);
        PageFactory.initElements(driver,this);
        driver.manage().window().maximize();
    }
    //Creamos el siguiente metodo para inicializar el driver, Chrome Options configura las opciones para el navegador Chrome
    public static WebDriver initDriver(){
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(chromeOptions);
    }
    public void navigateTo(String url){
        driver.get(url);
    }
}
