package co.com.Mysticalcut.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.Mysticalcut.userinterface.EliminarProducto.MENSAJE_VIEW_PRODUCTS_ELIMINAR;
import static co.com.Mysticalcut.userinterface.EliminarProducto.MENSAJE_VIEW_DESCRIPCION_PRODUCTS_ELIMINAR;
import static co.com.Mysticalcut.userinterface.EliminarProducto.MENSAJE_VIEW_PRICE_PRODUCTS_ELIMINAR;


public class ValidacionEliminarProducto implements Question<Boolean> {


    private static final Logger logger = LoggerFactory.getLogger(ValidacionEliminarProducto.class);

    public static ValidacionEliminarProducto Validacion() {
        return new ValidacionEliminarProducto();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {

            String nombreProducto = Text.of(MENSAJE_VIEW_PRODUCTS_ELIMINAR).viewedBy(actor).asString();
            String descripcionProducto = Text.of(MENSAJE_VIEW_DESCRIPCION_PRODUCTS_ELIMINAR).viewedBy(actor).asString();
            String precioProducto = Text.of(MENSAJE_VIEW_PRICE_PRODUCTS_ELIMINAR).viewedBy(actor).asString();


            return "Tratamiento de Keratina".equals(nombreProducto)
                    && "Hidratación profunda con keratina".equals(descripcionProducto)
                    && "Precio".equals(precioProducto);

        } catch (Exception e) {

            logger.error("Error validando los textos en la vista del producto a eliminar: ", e);
            return false;
        }
    }
}