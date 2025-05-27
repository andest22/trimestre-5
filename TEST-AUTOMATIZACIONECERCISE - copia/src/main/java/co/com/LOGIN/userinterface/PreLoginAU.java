package co.com.LOGIN.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PreLoginAU extends PageObject {

    public static Target INPUT_USUARIO = Target.the(" Campo de nombre en el formulario de registro").located(By.xpath("//*[@id='form']/div/div/div[3]/div/form/input[2]"));

    public static Target INPUT_CORREO = Target.the("Campo de correo electrónico en el formulario de registro").located(By.xpath("//*[@id='form']/div/div/div[3]/div/form/input[3]"));

    public static Target BTN_SINGUP = Target.the("Click Boton Singup").located(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"));

    public static Target MENSAJE_LOGIN = Target.the("mensaje de 'Enter Account Information").located(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/div[1]/label"));
}

