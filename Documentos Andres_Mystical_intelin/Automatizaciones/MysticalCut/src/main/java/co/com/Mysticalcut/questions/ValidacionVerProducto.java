package co.com.Mysticalcut.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.Mysticalcut.userinterface.VerProducto.MENSAJE_VIEW_PRODUCTS;
import static co.com.Mysticalcut.userinterface.VerProducto.MENSAJE_VIEW_DESCRIP;
import static co.com.Mysticalcut.userinterface.VerProducto.MENSAJE_VIEW_PRICE;


public class ValidacionVerProducto implements Question<Boolean> {


    private static final Logger logger = LoggerFactory.getLogger(ValidacionVerProducto.class);

    public static ValidacionVerProducto Validacion() {
        return new ValidacionVerProducto();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {

            String nombreProducto = Text.of(MENSAJE_VIEW_PRODUCTS).viewedBy(actor).asString();
            String descripcionProducto = Text.of(MENSAJE_VIEW_DESCRIP).viewedBy(actor).asString();
            String precioProducto = Text.of(MENSAJE_VIEW_PRICE).viewedBy(actor).asString();


            return "Cepillo Capilar".equals(nombreProducto)
                    && "Descripción: Cepillo para cabello delicado".equals(descripcionProducto)
                    && "Precio: $15.000".equals(precioProducto);

        } catch (Exception e) {

            logger.error("Error validando los textos en la vista del producto: ", e);
            return false;
        }
    }
}