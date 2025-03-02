package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterface.LoginPage.ERROR_MSG;

public class ErrorMessage implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ERROR_MSG).answeredBy(actor);
    }

    public static ErrorMessage errorMessage() {
        return new ErrorMessage();
    }
}
