package tasks;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static userinterface.LoginPage.USERNAME_FIELD;
import static userinterface.LoginPage.PASSWORD_FIELD;
import static userinterface.LoginPage.LOGIN_BTN;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@NoArgsConstructor
@AllArgsConstructor
public class Login implements Task {

    private static final Logger logger = LoggerFactory.getLogger(Login.class);

    private String username;
    private String password;

    @Override
    @Step("{0} ingresa usuario y contrasena para iniciar sesion")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(USERNAME_FIELD),
                Enter.keyValues(username).into(USERNAME_FIELD),
                Clear.field(PASSWORD_FIELD),
                Enter.keyValues(password).into(PASSWORD_FIELD),
                Click.on(LOGIN_BTN)
        );
        logger.info("Usuario ingresado: {}", username);
        logger.info("Contrasena ingresada: {}", password);
    }

    public static Login login(String username, String password) {
        return Tasks.instrumented(Login.class, username, password);
    }
}
