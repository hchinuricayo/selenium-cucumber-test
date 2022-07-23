package session;

import browser.FactoryBrowser;
import org.openqa.selenium.WebDriver;

public class Session {
    // tener con el mismo nombre un atributo
    private static Session session=null;
    private WebDriver browser;
    // tener un constructor privado
    private Session(){
        browser= FactoryBrowser.make("chrome").create();
    }

    // tener una obleto publico estatico para controlar la session
    public static Session getInstance(){
        if (session==null)
            session=new Session();
        return session;
    }

    public void closeSession(){
        browser.quit();
        session=null;
    }

    public WebDriver getBrowser(){
        return browser;
    }
}
