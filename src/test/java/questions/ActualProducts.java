package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.Arrays;
import java.util.List;

import static userinterface.CartPage.PROD1CART_NAME;
import static userinterface.CartPage.PROD3CART_NAME;

public class ActualProducts implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String firstProduct = Text.of(PROD1CART_NAME).answeredBy(actor);
        String secondProduct = Text.of(PROD3CART_NAME).answeredBy(actor);

        List<String> expectedProducts = Arrays.asList(
                "Sauce Labs Bolt T-Shirt","Sauce Labs Onesie"
        );
        List<String> actualProducts = Arrays.asList(firstProduct, secondProduct);

        return expectedProducts.equals(actualProducts);
    }

    public static ActualProducts actualProducts() {
        return new ActualProducts();
    }
}
