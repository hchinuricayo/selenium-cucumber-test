package runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import page.LoginModal;
import page.MainPage;
import page.MenuSection;
import session.Session;

import java.util.Map;

public class MyStepLogin {
    MainPage mainPage = new MainPage();
    LoginModal loginModal = new LoginModal();
    MenuSection menuSection = new MenuSection();


    @Given("la pagina {string} este abierta")
    public void laPaginaEsteAbierta(String url) {
        Session.getInstance().getBrowser().get(url);

    }

    @When("yo quiero realizar login")
    public void yoQuieroRealizarLogin(Map<String,String> credentials) {
        mainPage.botonLogin.click();
        loginModal.textBoxEmail.writeText(credentials.get("email"));
        loginModal.textBoxPass.writeText(credentials.get("password"));
        loginModal.botonLogin.click();
    }

    @Then("yo quiero ingresar al web app")
    public void yoQuieroIngresarAlWebApp() {
        Assertions.assertTrue(menuSection.botonLogout.isControlDisplayed(), "Error fallo en el login");
    }
}
