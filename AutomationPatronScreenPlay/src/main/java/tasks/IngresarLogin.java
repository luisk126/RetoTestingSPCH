package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.Login;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarLogin implements Task
{
    private final String username;
    private final String password;

    public IngresarLogin(String username, String password)
    {
        this.username = username;
        this.password = password;
    }



    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
                Enter.theValue(username).into(Login.INPUT_USUARIO_LOGIN),
                Enter.theValue(password).into(Login.INPUT_PASSWORD_LOGIN),
                Click.on(Login.BUTTON_SIGN_LOGIN)
        );

    }


    public static IngresarLogin conCredenciales(String username, String password)
    {
        return instrumented(IngresarLogin.class, username, password);
    }
}
