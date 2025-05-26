package co.com.LOGIN.stepsdefinitions;


import co.com.LOGIN.models.CredencialesPreLogin;
import co.com.LOGIN.questions.ValidacionPreLogin;
import co.com.LOGIN.tasks.AbrirPagina;
import co.com.LOGIN.tasks.PreLogin;
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


    @Cuando("^ingrese las credenciales correctas \\(nombre y correo\\)$")
    public void ingreseLasCredencialesCorrectasNombreYCorreo(List<CredencialesPreLogin> credenciales) {
        theActorInTheSpotlight().attemptsTo(PreLogin.aute(credenciales));
    }

    @Entonces("^debe ser redirigido a la vista de Enter Account Information$")
    public void debeSerRedirigidoALaVistaDeEnterAccountInformation() {
        theActorInTheSpotlight().should(seeThat(ValidacionPreLogin.validacionPreLogin()));

    }
}
