package co.com.Mysticalcut.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.Mysticalcut.userinterface.AutenticacionBuscarUsuario.MENSAJE_RETURN;
import static co.com.Mysticalcut.userinterface.AutenticacionBuscarUsuario.MENSAJE_USUARIOS;
import static co.com.Mysticalcut.userinterface.AutenticacionBuscarUsuario.MENSAJE_VER_USER;



public class ValidacionBuscarUsuario implements Question<Boolean> {


    private static final Logger logger = LoggerFactory.getLogger(ValidacionBuscarUsuario.class);

    public static ValidacionBuscarUsuario ValidacionBuscarUsuario() {
        return new ValidacionBuscarUsuario();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String textoUsuario = Text.of(MENSAJE_USUARIOS).viewedBy(actor).asString();
            String textoVerUsuario = Text.of(MENSAJE_VER_USER).viewedBy(actor).asString();
            String textoReturn = Text.of(MENSAJE_RETURN).viewedBy(actor).asString();

            return "Diana Pérez".equals(textoUsuario)
                    && "Ver usuarios inactivos".equals(textoVerUsuario)
                    && "Regresar".equals(textoReturn);

        } catch (Exception e) {

            logger.error("No se encontró el texto o hubo otro error al buscar el usuario: ", e);
            return false;
        }
    }
}