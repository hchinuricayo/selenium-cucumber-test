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

public class ChangePWDTest {
    MainPage mainPage=new MainPage();
    LoginModal loginModal=new LoginModal();
    ChangePwdModal changePwdModal=new ChangePwdModal();
    MenuSection menuSection=new MenuSection();

    @BeforeEach
    public void goWebApp() {
        Session.getInstance().getBrowser().get("https://todo.ly/");
    }

    @AfterEach
    public void closeWebApp() {
        Session.getInstance().closeSession();
    }

    @Test
    public void verifyChangePwdTest(){
        // login de usuario
        mainPage.botonLogin.click();
        loginModal.textBoxEmail.writeText("rita@maestria.com");
        loginModal.textBoxPass.writeText("123456");
        loginModal.botonLogin.click();

        Assertions.assertTrue(menuSection.botonLogout.isControlDisplayed(), "Error fallo en el login");

        //Cambio de password
        menuSection.botonSetting.click();
        changePwdModal.textBoxOldPwd.writeText("123456");
        changePwdModal.textBoxNewPwd.writeText("123");
        changePwdModal.botonOK.click();
        menuSection.botonLogout.click();

        //verificacion de del password nuevo
        mainPage.botonLogin.click();
        loginModal.textBoxEmail.writeText("rita@maestria.com");
        loginModal.textBoxPass.writeText("123");
        loginModal.botonLogin.click();

        Assertions.assertTrue(menuSection.botonLogout.isControlDisplayed(), "Error fallo en el login");
    }

}
