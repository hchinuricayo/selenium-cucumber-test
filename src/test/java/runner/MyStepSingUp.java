package runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import page.MainPage;
import page.MenuSection;
import page.SingUpFreeModal;
import session.Session;

import java.util.Map;

public class MyStepSingUp {
    MainPage mainPage=new MainPage();
    MenuSection menuSection=new MenuSection();
    SingUpFreeModal singUpFreeModal=new SingUpFreeModal();

    @Given("que la pagina {string} este abierta")
    public void queLaPaginaEsteAbierta(String url) {
        Session.getInstance().getBrowser().get(url);
    }

    @When("yo quiero registra la nueva cuenta")
    public void yoQuieroRegistraLaNuevaCuenta(Map<String,String> acountCreate) {
        mainPage.botonSingUpFree.click();
        singUpFreeModal.textBoxNameCreate.writeText(acountCreate.get("name"));
        singUpFreeModal.textBoxEmailCreate.writeText(acountCreate.get("email"));
        singUpFreeModal.textBoxPassCreate.writeText(acountCreate.get("password"));
        singUpFreeModal.botonCheckBox.click();
        singUpFreeModal.botonSingUp.click();
    }

    @Then("yo debo ingresar al web app")
    public void yoDeboIngresarAlWebApp() {
        Assertions.assertTrue(menuSection.botonLogout.isControlDisplayed(), "Error No se ha creado la cuenta");
    }
}
