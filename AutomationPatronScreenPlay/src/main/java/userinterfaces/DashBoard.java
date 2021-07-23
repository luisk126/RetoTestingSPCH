package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DashBoard extends PageObject
{
    public static final Target CLICK_BUTTON_ORGANIZACION = Target.the("Click en Organizacion").locatedBy("//span[contains(text(),'Organization')]");
    public static final Target CLICK_BUTTON_UNIDAD_NEGOCIO = Target.the("Click en Unidad de Negocio").locatedBy("//span[contains(text(),'Business Units')]");
    public static final Target CLICK_BUTTON_NEW_UNIDAD_NEGOCIO = Target.the("Click boton en Nueva Unidad de Negocio").locatedBy("//span[contains(text(),'New Business Unit')]");
}
