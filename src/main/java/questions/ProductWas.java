package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class ProductWas implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        actor.attemptsTo(
                //WaitUntil.the(TITLE_CART, isVisible()).forNoMoreThan(15).seconds(),
               // Ensure.that(PRODUCT_CART).hasText( actor.recall("productName"))

        );
        return true;

    }
    public static ProductWas Added(){return new ProductWas();}

}
