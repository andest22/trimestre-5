package co.com.Mysticalcut.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.Mysticalcut.userinterface.autenticacionRecuperarContrase.MENSAJE_LOGIN;
import static co.com.Mysticalcut.userinterface.autenticacionRecuperarContrase.MENSAJE_REP_CONTR;
import static co.com.Mysticalcut.userinterface.autenticacionRecuperarContrase.MENSAJE_ACCION;


public class ValidacionRecuperarContrase implements Question<Boolean> {


    private static final Logger logger = LoggerFactory.getLogger(ValidacionRecuperarContrase.class);

    public static ValidacionRecuperarContrase ValidacionRecuperarContrase() {
        return new ValidacionRecuperarContrase();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String mensajeLogin = Text.of(MENSAJE_LOGIN).viewedBy(actor).asString();
            String mensajeRecuperarContrasena = Text.of(MENSAJE_REP_CONTR).viewedBy(actor).asString();
            String mensajeAccion = Text.of(MENSAJE_ACCION).viewedBy(actor).asString();

            return "Si el correo está registrado, recibirás un enlace de recuperación.".equals(mensajeLogin)
                    && "Recuperar Contraseña".equals(mensajeRecuperarContrasena)
                    && "Enviar".equals(mensajeAccion);

        } catch (Exception e) {

            logger.error("No se encontró el texto o hubo otro error al validar la recuperación de contraseña: ", e);
            return false;
        }
    }
}