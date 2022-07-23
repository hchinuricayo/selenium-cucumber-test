package page;

import control.Boton;
import org.openqa.selenium.By;

public class MainPage {
    public Boton botonLogin=new Boton(By.xpath("//img[@src='/Images/design/pagelogin.png']"));
    public Boton botonSingUpFree=new Boton(By.xpath("//img[@src='/Images/design/pagesignup.png']"));
}
