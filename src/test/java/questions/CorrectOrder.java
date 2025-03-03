package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import java.util.Arrays;
import java.util.List;
import static userinterface.HomePage.PRICEPROD1_NAME;
import static userinterface.HomePage.PRICEPROD2_NAME;
import static userinterface.HomePage.PRICEPROD3_NAME;
import static userinterface.HomePage.PRICEPROD4_NAME;
import static userinterface.HomePage.PRICEPROD5_NAME;
import static userinterface.HomePage.PRICEPROD6_NAME;

public class CorrectOrder implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String priceProd1 = Text.of(PRICEPROD1_NAME).answeredBy(actor);
        String priceProd2 = Text.of(PRICEPROD2_NAME).answeredBy(actor);
        String priceProd3 = Text.of(PRICEPROD3_NAME).answeredBy(actor);
        String priceProd4 = Text.of(PRICEPROD4_NAME).answeredBy(actor);
        String priceProd5 = Text.of(PRICEPROD5_NAME).answeredBy(actor);
        String priceProd6 = Text.of(PRICEPROD6_NAME).answeredBy(actor);

        List<String> expectedPrices = Arrays.asList("$7.99","$9.99","$15.99","$15.99","$29.99","$49.99");
        List<String> actualPrices = Arrays.asList(priceProd1, priceProd2, priceProd3, priceProd4, priceProd5, priceProd6);

        return expectedPrices.equals(actualPrices);
    }

    public static CorrectOrder correctOrder() {
        return new CorrectOrder();
    }
}
