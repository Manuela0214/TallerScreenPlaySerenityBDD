package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterface.LoginPage.USERNAME_FIELD;
import static userinterface.LoginPage.PASSWORD_FIELD;
import static userinterface.LoginPage.LOGIN_BTN;

public class Login implements Task {

    private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(USERNAME_FIELD),
                Enter.keyValues(username).into(USERNAME_FIELD),
                Clear.field(PASSWORD_FIELD),
                Enter.keyValues(password).into(PASSWORD_FIELD),
                Click.on(LOGIN_BTN)
        );
    }

    public static Login login(String username, String password) {
        return Tasks.instrumented(Login.class, username, password);
    }
}
