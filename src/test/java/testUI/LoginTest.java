package testUI;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.ChangePwdModal;
import page.LoginModal;
import page.MainPage;
import page.MenuSection;
import session.Session;

public class LoginTest {
    MainPage mainPage = new MainPage();
    LoginModal loginModal = new LoginModal();
    MenuSection menuSection = new MenuSection();


    @BeforeEach
    public void goWebApp() {
        Session.getInstance().getBrowser().get("https://todo.ly/");
    }

    @AfterEach
    public void closeWebApp() {
        Session.getInstance().closeSession();
    }

    @Test
    public void verifyLoginTest() {
        mainPage.botonLogin.click();
        loginModal.textBoxEmail.writeText("hchinuri@maestria.com");
        loginModal.textBoxPass.writeText("123456");
        loginModal.botonLogin.click();


        Assertions.assertTrue(menuSection.botonLogout.isControlDisplayed(), "Error fallo en el login");

    }

}
