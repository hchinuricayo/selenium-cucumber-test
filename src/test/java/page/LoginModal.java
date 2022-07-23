package page;

import control.Boton;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginModal {
    public TextBox textBoxEmail=new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail"));
    public TextBox textBoxPass=new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword"));
    public Boton botonLogin=new Boton(By.id("ctl00_MainContent_LoginControl1_ButtonLogin"));
}
