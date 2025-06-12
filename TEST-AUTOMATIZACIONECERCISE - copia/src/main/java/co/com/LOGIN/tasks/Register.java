package co.com.LOGIN.tasks;


import co.com.LOGIN.models.CredencialesRegister;
import co.com.LOGIN.utils.hooks.SesionVariable;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.List;

import static co.com.LOGIN.userinterface.Register.*;
import static co.com.LOGIN.userinterface.Register.INPUT_CIUDAD;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Register  implements Task {

    private List<CredencialesRegister> Credenciales;

    public Register(List<CredencialesRegister> Credenciales) {
        this.Credenciales = Credenciales;
    }

    public static Register aute(List<CredencialesRegister> credenciales) {
        return Instrumented.instanceOf(Register.class).withProperties(credenciales);
    }



    String PruebaUsuario = "name";

    String numero = RandomStringUtils.random(2, false, true);

    String letrasMin = RandomStringUtils.random(5, "abcdefghijklmnopqrstuvwxyz");



    public static Performable toAlert(){
        return new DriverTask(driver ->driver.switchTo().alert().accept());
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RADIO_TITULO),
                Scroll.to(INPUT_CONTRASEÑA),
                Click.on(INPUT_CONTRASEÑA),
                Enter.theValue(Credenciales.get(0).getContraseña()).into(INPUT_CONTRASEÑA),
                Scroll.to(BTN_FECHA),
                Click.on(BTN_FECHA),
                SelectFromOptions.byVisibleText("15").from(BTN_FECHA),
                Click.on(BTN_MES),
                SelectFromOptions.byVisibleText("July").from(BTN_MES),
                Click.on(BTN_AÑO),
                SelectFromOptions.byVisibleText("1990").from(BTN_AÑO),
                Click.on(INPUT_FIRSTNAME),
                Enter.theValue(Credenciales.get(0).getFirstName()+letrasMin).into(INPUT_FIRSTNAME),
                Scroll.to(INPUT_APELLIDO),
                Click.on(INPUT_APELLIDO),
                Enter.theValue(Credenciales.get(0).getApellido()+letrasMin).into(INPUT_APELLIDO),
                Click.on(INPUT_DIRECCION),
                Enter.theValue(Credenciales.get(0).getDireccion()+numero+letrasMin).into(INPUT_DIRECCION),
                Click.on(BTN_PAIS),
                SelectFromOptions.byVisibleText("Canada").from(BTN_PAIS),
                Click.on(INPUT_ESTADO),
                Enter.theValue(Credenciales.get(0).getEstado()+letrasMin).into(INPUT_ESTADO),
                Scroll.to(INPUT_CIUDAD),
                Click.on(INPUT_CIUDAD),
                Enter.theValue(Credenciales.get(0).getCiudad()).into(INPUT_CIUDAD),
                Click.on(INPUT_CODIGO_POSTAL),
                Enter.theValue(Credenciales.get(0).getCodigo_Postal()+numero).into(INPUT_CODIGO_POSTAL),
                Click.on(INPUT_MOVIL),
                Enter.theValue(Credenciales.get(0).getMovil()).into(INPUT_MOVIL),
                Click.on(BTN_CREATE)
                );
                theActorInTheSpotlight().remember(SesionVariable.name.toString(),Credenciales.get(0));


    }

}
