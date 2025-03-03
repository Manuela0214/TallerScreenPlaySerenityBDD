package questions;

import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static userinterface.LoginPage.ERROR_MSG;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ErrorMessage implements Question<String> {

    private static final Logger logger = LoggerFactory.getLogger(ErrorMessage.class);

    @Override
    public String answeredBy(Actor actor) {
        logger.error("Usuario y contrasena ingresados invalidos");
        return Text.of(ERROR_MSG).answeredBy(actor);
    }

    public static ErrorMessage errorMessage() {
        return new ErrorMessage();
    }
}
