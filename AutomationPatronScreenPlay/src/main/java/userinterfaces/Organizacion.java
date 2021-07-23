package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Organizacion extends PageObject
{
    public static final Target INPUT_NEW_NAME_NEGOCIO = Target.the("Input donde se diligencia el nombre del nuevo negocio").located(By.name("Name"));
    public static final Target BUTTON_SAVE_UNIDAD_NEGOCIO = Target.the("Click en boton guardar Nuevo Negocio").locatedBy("//span[contains(text(),'Save')]");

}
