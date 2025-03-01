package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterface.CheckoutPage.*;

public class CompleteCheckout implements Task {

    private String name;
    private String lastName;
    private String postalCode;

    public CompleteCheckout(String name, String lastName, String postalCode) {
        this.name = name;
        this.lastName = lastName;
        this.postalCode = postalCode;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(FIRSTNAME_INPUT),
                Enter.keyValues(name).into(FIRSTNAME_INPUT),
                Clear.field(LASTNAME_INPUT),
                Enter.keyValues(lastName).into(LASTNAME_INPUT),
                Clear.field(POSTALCODE_INPUT),
                Enter.keyValues(postalCode).into(POSTALCODE_INPUT),
                Click.on(CONTINUE_BTN)
        );
    }

    public static CompleteCheckout completeCheckout(String name, String lastName, String postalCode) {
        return Tasks.instrumented(CompleteCheckout.class, name, lastName, postalCode);
    }
}
