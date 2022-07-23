package page;

import control.Boton;
import control.TextBox;
import org.openqa.selenium.By;

public class ChangePwdModal {
    public TextBox textBoxOldPwd=new TextBox(By.id("TextPwOld"));
    public TextBox textBoxNewPwd=new TextBox(By.id("TextPwNew"));
    public Boton botonOK=new Boton(By.xpath("//span[text()='Ok']"));

    }
