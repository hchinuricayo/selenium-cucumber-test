package page;

import control.Boton;
import org.openqa.selenium.By;

public class MenuSection {
    public Boton botonLogout=new Boton(By.id("ctl00_HeaderTopControl1_LinkButtonLogout"));
    public Boton botonSetting=new Boton(By.xpath("//a[text()='Settings']"));
}
