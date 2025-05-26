package co.com.VisualizarServicios.tasks;

import co.com.VisualizarServicios.userinterface.VisualizarServices;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task {

    VisualizarServices visualizarServices;

    public static AbrirPagina laPagina(){ return Tasks.instrumented(AbrirPagina.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Open.browserOn(visualizarServices));

    }
}
