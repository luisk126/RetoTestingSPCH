package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.Meeting;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VolverReuniones implements Task
{

    public VolverReuniones()
    {

    }


    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
                //Click.on(Meeting.CLICK_BUTTON_MEETING),
                Click.on(Meeting.CLICK_BUTTON_MEETINGS)
        );
    }

    public static VolverReuniones volverReunionesValida()
    {
        return instrumented(VolverReuniones.class);
    }
}
