package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.DashBoard;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionCreacionNegocio implements Task
{
    public SeleccionCreacionNegocio()
    {

    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
                Click.on(DashBoard.CLICK_BUTTON_ORGANIZACION),
                Click.on(DashBoard.CLICK_BUTTON_UNIDAD_NEGOCIO),
                Click.on(DashBoard.CLICK_BUTTON_NEW_UNIDAD_NEGOCIO)
        );
    }

    public static SeleccionCreacionNegocio seleccionCreacion() {
        return instrumented(SeleccionCreacionNegocio.class);
    }
}
