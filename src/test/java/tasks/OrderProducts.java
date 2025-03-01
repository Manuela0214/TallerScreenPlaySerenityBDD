package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.htmlunit.jetty.websocket.common.CloseInfo;

import static userinterface.HomePage.LOWTOHIGH_OPT;
import static userinterface.HomePage.ORDERBY_BTN;

public class OrderProducts implements Task {

    private String orderBy;

    public OrderProducts(String orderBy) {
        this.orderBy = orderBy;
    }

    @Override
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
