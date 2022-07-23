package runner;

import io.cucumber.java.en.When;
import page.ChangePwdModal;
import page.MenuSection;

public class MyStepChangePWD {
    ChangePwdModal changePwdModal=new ChangePwdModal();
    MenuSection menuSection=new MenuSection();

    @When("deberia cambiar el password actual {string} a password nuevo {string}")
    public void deberiaCambiarElPasswordActualAPasswordNuevo(String pwdOld, String pwdNew) {
        menuSection.botonSetting.click();
        changePwdModal.textBoxOldPwd.writeText(pwdOld);
        changePwdModal.textBoxNewPwd.writeText(pwdNew);
        changePwdModal.botonOK.click();
        menuSection.botonLogout.click();
    }
}
