package co.com.LOGIN.stepsdefinitions;

import co.com.LOGIN.models.CredencialesRegister;
import co.com.LOGIN.questions.ValidacionRegister;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Register {
    @Cuando("^completa los campos requeridos:$")
    public void completaLosCamposRequeridos(List<CredencialesRegister> credenciales) {
        theActorInTheSpotlight().attemptsTo(co.com.LOGIN.tasks.Register.aute(credenciales));
    }

    @Entonces("^la cuenta debe ser creada y el usuario redirigido a la vista de confirmación$")
    public void laCuentaDebeSerCreadaYElUsuarioRedirigidoALaVistaDeConfirmación() {
        theActorInTheSpotlight().should(seeThat(ValidacionRegister.validacionRegister()));
    }
}
