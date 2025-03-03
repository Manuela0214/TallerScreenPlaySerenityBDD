package tasks;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static userinterface.HomePage.LOWTOHIGH_OPT;
import static userinterface.HomePage.ORDERBY_BTN;

@NoArgsConstructor
public class OrderProducts implements Task {

    @Override
    @Step("{0} selecciona una opcion de ordenacion de productos")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ORDERBY_BTN),
                Click.on(LOWTOHIGH_OPT)
        );
    }

    public static OrderProducts orderProducts(String orderBy) {
        return Tasks.instrumented(OrderProducts.class, orderBy);
    }
}
