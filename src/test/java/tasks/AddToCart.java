package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static userinterface.HomePage.ADDTOCART_PROD1_BTN;
import static userinterface.HomePage.ADDTOCART_PROD2_BTN;
import static userinterface.HomePage.ADDTOCART_PROD3_BTN;
import static userinterface.HomePage.CART_BTN;

public class AddToCart implements Task {

    private List<String> products;

    public AddToCart(List<String> products) {
        this.products = products;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ADDTOCART_PROD1_BTN),
                Click.on(ADDTOCART_PROD2_BTN),
                Click.on(ADDTOCART_PROD3_BTN),
                Click.on(CART_BTN)
        );
    }

    public static AddToCart addToCart(List<String> products) {
        return Tasks.instrumented(AddToCart.class, products);
    }
}
