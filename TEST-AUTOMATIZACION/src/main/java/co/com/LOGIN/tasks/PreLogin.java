package co.com.LOGIN.tasks;


import co.com.LOGIN.models.CredencialesPreLogin;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.LOGIN.userinterface.PreLoginAU.*;

public class PreLogin implements Task {

    private List<CredencialesPreLogin> credenciales;


    public PreLogin(List<CredencialesPreLogin> credenciales) {
        this.credenciales = credenciales;
    }

    public static PreLogin aute(List<CredencialesPreLogin> credenciales) {
        return Instrumented.instanceOf(PreLogin.class).withProperties(credenciales);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_USUARIO),
                Enter.theValue(credenciales.get(0).getName()).into(INPUT_USUARIO),
                Click.on(INPUT_CORREO),
                Enter.theValue(credenciales.get(0).getEmail()).into(INPUT_CORREO),
                Click.on(BTN_SINGUP)
        );
    }
}

