package co.com.Mysticalcut.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger; 
import org.slf4j.LoggerFactory;

import static co.com.Mysticalcut.userinterface.Autenticacion.MENSAJE_LOGIN;
import static co.com.Mysticalcut.userinterface.Autenticacion.MENSAJE_MODULS_SERVICES;
import static co.com.Mysticalcut.userinterface.Autenticacion.MENSAJE_MODULS_PRODUCTS;


public class ValidacionLogin implements Question<Boolean> {

    private static final Logger logger = LoggerFactory.getLogger(ValidacionLogin.class);

    public static ValidacionLogin validacionLogin() {
        return new ValidacionLogin();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String nombreUsuarioLogin = Text.of(MENSAJE_LOGIN).viewedBy(actor).asString();
            String moduloServicios = Text.of(MENSAJE_MODULS_SERVICES).viewedBy(actor).asString();
            String moduloProductos = Text.of(MENSAJE_MODULS_PRODUCTS).viewedBy(actor).asString();

            return "Kevin David Sabogal".equals(nombreUsuarioLogin)
                    && "Servicios".equals(moduloServicios)
                    && "Productos".equals(moduloProductos);

        } catch (Exception e) {
            logger.error("Error validando los textos después del login: ", e);
            return false;
        }
    }
}