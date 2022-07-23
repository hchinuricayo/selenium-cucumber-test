package basicSelenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BasicSelenium {

    ChromeDriver driver;

    @BeforeEach
    public void openBrowser(){

        System.setProperty ("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        driver=new ChromeDriver();
        // impicit wait---> genrico
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://todo.ly/");
    }

    @AfterEach
    public  void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    /*
    *Los localizadores deben ser unicos
    * **/
    @Test
    public void testSomeThing(){

        //click en el boton Login
        driver.findElement(By.xpath("//img[@src='/Images/design/pagelogin.png']")).click();

        //escribir el email
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail")).sendKeys("hchinuri@maestria.com");

        //escribir el pass
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword")).sendKeys("123456");

        //click en el boton login (ventana modal)
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_ButtonLogin")).click();

        //verificacion
        Assertions.assertTrue(driver.findElement(By.id("ctl00_HeaderTopControl1_LinkButtonLogout")).isDisplayed(),"Error el usuario no ingresar al sistema");


    }

}
