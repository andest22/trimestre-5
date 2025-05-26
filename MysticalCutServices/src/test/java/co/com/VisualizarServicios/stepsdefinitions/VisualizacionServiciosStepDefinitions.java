package co.com.VisualizarServicios.stepsdefinitions;

import co.com.VisualizarServicios.tasks.AbrirPagina;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class VisualizacionServiciosStepDefinitions {

    @Dado("^que el usuario ha iniciado sesión correctamente en la plataforma$")
    public void queElUsuarioHaIniciadoSesiónCorrectamenteEnLaPlataforma() {
        theActorInTheSpotlight().wasAbleTo(AbrirPagina.laPagina());
    }


    @Dado("^se encuentra en la vista de servicios de cortes$")
    public void seEncuentraEnLaVistaDeServiciosDeCortes() {

    }

    @Cuando("^el usuario visualiza la lista de cortes disponibles$")
    public void elUsuarioVisualizaLaListaDeCortesDisponibles() {

    }

    @Entonces("^debe ver al menos un servicio con su nombre, descripción, imagen y botones de acción$")
    public void debeVerAlMenosUnServicioConSuNombreDescripciónImagenYBotonesDeAcción() {

    }

    @Entonces("^cada servicio debe tener un botón para \"([^\"]*)\" detalles$")
    public void cadaServicioDebeTenerUnBotónParaDetalles(String arg1) {

    }

    @Entonces("^un botón para \"([^\"]*)\" el corte$")
    public void unBotónParaElCorte(String arg1) {

    }
}
