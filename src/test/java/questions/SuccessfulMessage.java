package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterface.CheckoutPage.FINAL_MSG;

public class SuccessfulMessage implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(FINAL_MSG).answeredBy(actor);
    }

    public static SuccessfulMessage successfulMessage() {
        return new SuccessfulMessage();
    }
}
