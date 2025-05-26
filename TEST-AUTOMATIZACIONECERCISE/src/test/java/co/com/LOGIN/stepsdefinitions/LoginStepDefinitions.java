package co.com.LOGIN.stepsdefinitions;


import co.com.LOGIN.models.CredencialesPreLogin;
import co.com.LOGIN.models.CredencialesRegister;
import co.com.LOGIN.questions.ValidacionPreLogin;
import co.com.LOGIN.questions.ValidacionRegister;
import co.com.LOGIN.tasks.AbrirPagina;
import co.com.LOGIN.tasks.PreLogin;
import co.com.LOGIN.tasks.Register;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinitions {

    @Dado("^que el visitante está en la página de Signup/Login$")
    public void queElVisitanteEstáEnLaPáginaDeSignupLogin() {
        theActorInTheSpotlight().wasAbleTo(AbrirPagina.laPagina());
    }
    @Cuando("^ingresa las credenciales básicas:$")
    public void ingresaLasCredencialesBásicas(List<CredencialesPreLogin> credenciales) {
        theActorInTheSpotlight().attemptsTo(PreLogin.aute(credenciales));
    }


    @Entonces("^debe ser redirigido a la vista Enter Account Information$")
    public void debeSerRedirigidoALaVistaEnterAccountInformation() {
        theActorInTheSpotlight().should(seeThat(ValidacionPreLogin.validacionPreLogin()));
    }

    @Cuando("^completa los campos requeridos:$")
    public void completaLosCamposRequeridos(List<CredencialesRegister> credenciales) {
        theActorInTheSpotlight().attemptsTo(Register.aute(credenciales));
    }

    @Cuando("^presiona el botón \"([^\"]*)\"$")
    public void presionaElBotón(String arg1) {

    }

    @Entonces("^la cuenta debe ser creada y el usuario redirigido a la vista de confirmación$")
    public void laCuentaDebeSerCreadaYElUsuarioRedirigidoALaVistaDeConfirmación() {
        theActorInTheSpotlight().should(seeThat(ValidacionRegister.validacionRegister()));
    }
}
