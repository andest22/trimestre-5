package co.com.Services.stepsdefinitions;

import co.com.Services.questions.ValidacioneQuotes;
import co.com.Services.questions.ValidacionesView;
import co.com.Services.tasks.Quotes;
import co.com.Services.tasks.View;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ViewStepsdefinitions {

    @Cuando("^Seleccionar el servicio$")
    public void seleccionarElServicio() {
        theActorInTheSpotlight().attemptsTo(View.completarCampos()
        );
    }


    @Entonces("^Verificarque sea el servicio seleccionado$")
    public void verificarqueSeaElServicioSeleccionado() {
        theActorInTheSpotlight().should(seeThat(ValidacionesView.ValidacioneView()));
    }
}
