package co.com.AutomatizacionFacebookPage.stepsdefinitions;


import co.com.AutomatizacionFacebookPage.models.CredencialesInicioSesion;
import co.com.AutomatizacionFacebookPage.questions.ValidacionLogin;
import co.com.AutomatizacionFacebookPage.tasks.AbrirPagina;
import co.com.AutomatizacionFacebookPage.tasks.Autenticarse;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class AutenticacionFacebookStepDefinitions {

    @Dado("^que el usuario se encuentra en la pagina de inicio de sesion$")
    public void queElUsuarioSeEncuentraEnLaPaginaDeInicioDeSesion() {
        theActorInTheSpotlight().wasAbleTo(AbrirPagina.laPagina());
    }


    @Cuando("^ingrese las credenciales correctas \\(usuario y contrasena\\) en facebook$")
    public void ingreseLasCredencialesCorrectasUsuarioYContrasena(List<CredencialesInicioSesion> credenciales) {
        theActorInTheSpotlight().attemptsTo(Autenticarse.aute(credenciales));
    }

    @Entonces("^se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su pagina de inicio$")
    public void seDebeVerificarQueElUsuarioHayaSidoAutenticadoCorrectamenteYRedirigidoASuPaginaDeInicio() {
        theActorInTheSpotlight().should(seeThat(ValidacionLogin.validacionLogin()));
    }

}
