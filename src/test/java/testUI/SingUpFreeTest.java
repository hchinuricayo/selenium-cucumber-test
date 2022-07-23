package testUI;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.MainPage;
import page.MenuSection;
import page.SingUpFreeModal;
import session.Session;

public class SingUpFreeTest {
    MainPage mainPage=new MainPage();
    MenuSection menuSection=new MenuSection();
    SingUpFreeModal singUpFreeModal=new SingUpFreeModal();

    @BeforeEach
    public void goWebApp() {
        Session.getInstance().getBrowser().get("https://todo.ly/");
    }

    @AfterEach
    public void closeWebApp() {
        Session.getInstance().closeSession();
    }
    @Test
    public void verifySingUpTest(){
        mainPage.botonSingUpFree.click();
        singUpFreeModal.textBoxNameCreate.writeText("ronald chinuri cayo");
        singUpFreeModal.textBoxEmailCreate.writeText("ronaldchinuri@maestria.com");
        singUpFreeModal.textBoxPassCreate.writeText("123456");
        singUpFreeModal.botonCheckBox.click();
        singUpFreeModal.botonSingUp.click();

        Assertions.assertTrue(menuSection.botonLogout.isControlDisplayed(), "Error No se ha creado la cuenta");
    }

    }
