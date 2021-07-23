package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://serenity.is/demo/")
public class Login extends PageObject
{
    //public static final Target TITLE_PAGINA_LOGIN = Target.the("Input donde se realiza la busqueda").located(By.id("search-key"));
    public static final Target INPUT_USUARIO_LOGIN = Target.the("Input para ingresar usuario").located(By.name("Username"));
    public static final Target INPUT_PASSWORD_LOGIN = Target.the("Input para ingresar password").located(By.name("Password"));
    public static final Target BUTTON_SIGN_LOGIN = Target.the("Boton para ingresar desde login").located(By.id("StartSharp_Membership_LoginPanel0_LoginButton"));
}
