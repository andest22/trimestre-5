package co.com.LOGIN.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Register extends PageObject {

    public static Target RADIO_TITULO = Target.the("Opción de título ").located(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/div[1]/div[1]/label"));

    public static Target INPUT_CONTRASEÑA = Target.the(" Campo de Contraseña").located(By.xpath("//*[@id=\"password\"]"));

    public static Target BTN_FECHA = Target.the(" Campo de Fecha Nacimiento").located(By.xpath("//*[@id=\"days\"]"));
    public static Target BTN_MES = Target.the(" Campo de Mes Nacimiento").located(By.xpath("//*[@id=\"months\"]"));
    public static Target BTN_AÑO = Target.the(" Campo de Mes Nacimiento").located(By.xpath("//*[@id=\"years\"]"));

    public static Target INPUT_FIRSTNAME = Target.the(" Campo de Nombre").located(By.xpath("//*[@id=\"first_name\"]"));

    public static Target INPUT_APELLIDO = Target.the(" Campo de Apellido").located(By.xpath("//*[@id=\"last_name\"]"));

    public static Target INPUT_DIRECCION = Target.the(" Campo de Direccion").located(By.xpath("//*[@id=\"address1\"]"));

    public static Target BTN_PAIS = Target.the(" Campo de Pais").located(By.xpath("//*[@id=\"country\"]"));

    public static Target INPUT_ESTADO = Target.the(" Campo de Estado").located(By.xpath("//*[@id=\"state\"]"));

    public static Target INPUT_CIUDAD = Target.the(" Campo de Ciudad").located(By.xpath("//*[@id=\"city\"]"));

    public static Target INPUT_CODIGO_POSTAL = Target.the(" Campo de Codigo Postal").located(By.xpath("//*[@id=\"zipcode\"]"));

    public static Target INPUT_MOVIL = Target.the(" Campo de Movil").located(By.xpath("//*[@id=\"mobile_number\"]"));

    public static Target BTN_CREATE = Target.the(" Campo de Crear").located(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button"));

    public static Target MENSAJE_REGISTER = Target.the("mensaje de 'Congratulations").located(By.xpath("//*[@id=\"form\"]/div/div/div/p[1]"));
}
