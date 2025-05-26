package co.com.LOGIN.tasks;


import co.com.LOGIN.models.CredencialesRegister;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.LOGIN.userinterface.Register.*;
import static co.com.LOGIN.userinterface.Register.INPUT_CIUDAD;

public class Register  implements Task {

    private List<CredencialesRegister> Credenciales;

    public Register(List<CredencialesRegister> Credenciales) {
        this.Credenciales = Credenciales;
    }

    public static Register aute(List<CredencialesRegister> credenciales) {
        return Instrumented.instanceOf(Register.class).withProperties(credenciales);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RADIO_TITULO),
                Click.on(INPUT_CONTRASEÑA),
                Enter.theValue(Credenciales.get(0).getContraseña()).into(INPUT_CONTRASEÑA),
                Click.on(BTN_FECHA),
                SelectFromOptions.byVisibleText("15").from(BTN_FECHA),
                Click.on(BTN_MES),
                SelectFromOptions.byVisibleText("July").from(BTN_MES),
                Click.on(BTN_AÑO),
                SelectFromOptions.byVisibleText("1990").from(BTN_AÑO),
                Click.on(INPUT_FIRSTNAME),
                Enter.theValue(Credenciales.get(0).getFirstName()).into(INPUT_FIRSTNAME),
                Click.on(INPUT_APELLIDO),
                Enter.theValue(Credenciales.get(0).getApellido()).into(INPUT_APELLIDO),
                Click.on(INPUT_DIRECCION),
                Enter.theValue(Credenciales.get(0).getDireccion()).into(INPUT_DIRECCION),
                Click.on(BTN_PAIS),
                SelectFromOptions.byVisibleText("Canada").from(BTN_PAIS),
                Click.on(INPUT_ESTADO),
                Enter.theValue(Credenciales.get(0).getEstado()).into(INPUT_ESTADO),
                Click.on(INPUT_CIUDAD),
                Enter.theValue(Credenciales.get(0).getCiudad()).into(INPUT_CIUDAD),
                Click.on(INPUT_CODIGO_POSTAL),
                Enter.theValue(Credenciales.get(0).getCodigo_Postal()).into(INPUT_CODIGO_POSTAL),
                Click.on(INPUT_MOVIL),
                Enter.theValue(Credenciales.get(0).getMovil()).into(INPUT_MOVIL),
                Click.on(BTN_CREATE)
                );
    }

}
