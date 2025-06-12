package co.com.LOGIN.questions;

import co.com.LOGIN.utils.hooks.SesionVariable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.LOGIN.userinterface.PreLoginAU.MENSAJE_LOGIN;
import static jxl.biff.FormatRecord.logger;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ValidacionPreLogin implements Question<Boolean> {

    public static ValidacionPreLogin validacionPreLogin() {
        return new ValidacionPreLogin();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
       // String name = theActorInTheSpotlight().recall(SesionVariable.name.toString());
        try {
            String texto = Text.of(MENSAJE_LOGIN).viewedBy(actor).asString();
            return "Title".equals(texto);
        } catch (Exception e) {
            logger.info(" No encontró el texto o hubo otro error");
            return false;
        }
    }
}
