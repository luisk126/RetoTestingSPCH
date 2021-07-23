package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.Login;
import userinterfaces.Organizacion;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CrearNegocio implements Task
{
    private final String negocio;

    public CrearNegocio(String negocio)
    {
        this.negocio = negocio;
    }


    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
                Enter.theValue(negocio).into(Organizacion.INPUT_NEW_NAME_NEGOCIO),
                Click.on(Organizacion.BUTTON_SAVE_UNIDAD_NEGOCIO)
        );
    }

    public static CrearNegocio crearNegocioSave(String negocio)
    {
        return instrumented(CrearNegocio.class, negocio);
    }
}
