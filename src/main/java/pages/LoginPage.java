package pages;
import org.openqa.selenium.WebDriver;
public class LoginPage extends BasePage { //La clase LoginPage extiende de BasePage para obtener los metodos de esa clase.

    private String login = "//a[@href='/login']";
    private String textValidate = "//h2[contains(text(),'New User Signup!')]";
    private String name = "//input[@data-qa='signup-name']";
    private String mail = "//input[@data-qa='signup-email']";
    private String sign = "//button[@data-qa='signup-button']";
    private String dates = "//*[@id=\"form\"]/div/div/div/div[1]/h2";
    private String gender = "//input[@id='id_gender1']";
    private String pass = "//input[@id='password']";

    public LoginPage(WebDriver driver) { //Se crea el constructor de la clase padre BasePage, Se usa para inicializar la clase padre BasePage con un objeto WebDriver
        super(driver);
    }
    public void navigateToPageLogin() { //Se crea el metodo navigate que llama al metodo navigateTo heredado de BasePage y se pasa la URL.
        this.navigateTo("https://www.automationexercise.com/");
    }
    public void closesBrowser(){ //Se crea el metodo close que llama al metodo closeBrowser heredado de BasePage y cierra el driver
        this.closeBrowser();
    }
    public void clickLogin() { //Se crea el metodo clickLogin que llama al metodo clickElement heredado de BasePage
        this.clickElement(this.login);
    }
    public Boolean textValidate(){ //Se crea el metodo textValidate que llama al metodo elementIsDisplayed heredado de BasePage
        return this.elementIsDisplayed(this.textValidate);
    }
    public void writeName(String criteria) { //Se crea el metodo writeName  que llama al metodo write heredado de BasePage
        this.write(this.name, criteria);
    }
    public void writeMail(String criteria) { //Se crea el metodo writeMail que llama al metodo write heredado de BasePage
        this.write(this.mail, criteria);
    }
    public void clickSign() { //Se crea el metodo clickLogin que llama al metodo clickElement heredado de BasePage
        this.clickElement(this.sign);
    }
    public Boolean textValidateDate(){ //Se crea el metodo textValidate que llama al metodo elementIsDisplayed heredado de BasePage
        return this.elementIsDisplayed(this.dates);
    }
    public void clicGender(){ //Se crea el metodo clicGender que llama al metodo clickElement heredado de BasePage
        this.clickElement(gender);
    }
    public void textToWritePass(String textwrite){ //Se crea el metodo textToWritePass que llama al metodo write heredado de BasePage
        this.write(pass, textwrite);
    }
}