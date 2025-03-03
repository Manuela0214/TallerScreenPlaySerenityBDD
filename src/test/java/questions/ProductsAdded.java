package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import java.util.Arrays;
import java.util.List;
import static userinterface.CartPage.QUANTITY_PROD1;
import static userinterface.CartPage.QUANTITY_PROD2;
import static userinterface.CartPage.QUANTITY_PROD3;

public class ProductsAdded implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String quantityProd1 = Text.of(QUANTITY_PROD1).answeredBy(actor);
        String quantityProd2 = Text.of(QUANTITY_PROD2).answeredBy(actor);
        String quantityProd3 = Text.of(QUANTITY_PROD3).answeredBy(actor);

        List<String> expectedQuantities = Arrays.asList("1", "1", "1");
        List<String> actualQuantities = Arrays.asList(quantityProd1, quantityProd2, quantityProd3);

        return expectedQuantities.equals(actualQuantities);
    }

    public static ProductsAdded productsAdded() {
        return new ProductsAdded();
    }
}
