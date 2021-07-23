package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.selectactions.SelectByIndexFromBy;
import org.openqa.selenium.Keys;
import userinterfaces.Login;
import userinterfaces.Meeting;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CrearReunion implements Task
{
    private final String reunion;
    private final String reunionnumero;
    private final String fechaciniReunion;
    private final String fechafinReiunion;

    public CrearReunion(String reunion, String reunionnumero, String fechaciniReunion, String fechafinReiunion)
    {
        this.reunion = reunion;
        this.reunionnumero = reunionnumero;
        this.fechaciniReunion = fechaciniReunion;
        this.fechafinReiunion = fechafinReiunion;
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
                Click.on(Meeting.CLICK_BUTTON_MEETING),
                Click.on(Meeting.CLICK_BUTTON_MEETINGS),
                Click.on(Meeting.CLICK_BUTTON_NEW_MEETING),
                Enter.theValue(reunion).into(Meeting.INPUT_MEETING_NAME),
                Enter.theValue(reunionnumero).into(Meeting.INPUT_MEETING_NUMBER),
                Enter.theValue(fechaciniReunion).into(Meeting.INPUT_MEETING_START_DATE),
                Enter.theValue(fechafinReiunion).into(Meeting.INPUT_MEETING_END_DATE),
                //Click.on(Meeting.INPUT_MEETING_UNIT),
                //Enter.theValue(unidad).into(Meeting.INPUT_MEETING_UNIT)
                //Hit.the(Keys.ENTER).into(Meeting.INPUT_MEETING_UNIT)
                Click.on(Meeting.CLICK_BUTTON_SAVE_MEETING)
        );
    }


    public static CrearReunion crearReunionSave(String reunion, String reunionnumero, String fechaciniReunion, String fechafinReiunion)
    {
        return instrumented(CrearReunion.class, reunion, reunionnumero, fechaciniReunion, fechafinReiunion);
    }
}
