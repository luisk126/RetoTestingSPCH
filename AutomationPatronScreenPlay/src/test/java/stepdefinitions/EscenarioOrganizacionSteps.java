package stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.aspectj.apache.bcel.classfile.Module;
import org.openqa.selenium.WebDriver;
import tasks.*;
import userinterfaces.Login;
import userinterfaces.Organizacion;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class EscenarioOrganizacionSteps
{

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Luis");
    private Login login = new Login();


    @Dado("^que el usuario ingresa a la plataforma$")
    public void queElUsuarioIngresaALaPlataforma() {
        // Write code here that turns the phrase above into concrete actions
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(login));

        actor.wasAbleTo(

                IngresarLogin.conCredenciales("admin", "serenity")
        );
    }

    @Cuando("^el crea y diligencia el nuevo negocio$")
    public void elCreaYDiligenciaElNuevoNegocio() {
        // Write code here that turns the phrase above into concrete actions
        actor.wasAbleTo(
                SeleccionCreacionNegocio.seleccionCreacion(),
                CrearNegocio.crearNegocioSave("Prueba1"),
                CrearReunion.crearReunionSave("PruebaReunion1", "2", "07/23/2021", "07/27/2021")
        );


    }

    @Entonces("^el confirma de que el negocio fue creado exitosamente$")
    public void elConfirmaDeQueElNegocioFueCreadoExitosamente()
    {
        // Write code here that turns the phrase above into concrete actions
        actor.wasAbleTo(VolverReuniones.volverReunionesValida());

    }

}
