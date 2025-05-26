package co.com.LOGIN.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


import static co.com.LOGIN.userinterface.Register.MENSAJE_REGISTER;
import static jxl.biff.FormatRecord.logger;

public class ValidacionRegister implements Question<Boolean> {

    public static ValidacionRegister validacionRegister() {return new ValidacionRegister(); }


    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(MENSAJE_REGISTER).viewedBy(actor).asString();
            return "Congratulations! Your new account has been successfully created!".equals(texto);
        } catch (Exception e) {
            logger.info(" No encontró el texto o hubo otro error");
            return false;
        }
    }
}
