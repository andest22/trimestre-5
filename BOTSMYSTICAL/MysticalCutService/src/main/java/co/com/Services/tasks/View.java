package co.com.Services.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.Services.userinterface.View.*;


public class View implements Task {

    public static View completarCampos() {return Instrumented.instanceOf(View.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SERVICES),
                Click.on(LI_CATEGORIES),
                Click.on(BTN_SERVICES_SELECT)
        );
    }
}
