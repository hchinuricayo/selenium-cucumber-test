package page;

import control.Boton;
import control.TextBox;
import org.openqa.selenium.By;

public class SingUpFreeModal {
    public TextBox textBoxNameCreate=new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName"));
    public TextBox textBoxEmailCreate=new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail"));
    public TextBox textBoxPassCreate=new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword"));
    public Boton botonCheckBox=new Boton(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms"));
    public Boton botonSingUp=new Boton(By.id("ctl00_MainContent_SignupControl1_ButtonSignup"));
}
