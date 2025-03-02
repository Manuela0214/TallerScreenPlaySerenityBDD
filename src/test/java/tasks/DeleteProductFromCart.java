package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userinterface.CartPage.REMOVE_PROD2_BTN;
import static userinterface.HomePage.*;
import static userinterface.HomePage.ADDTOCART_PROD3_BTN;

public class DeleteProductFromCart implements Task {

    private String productName;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CART_BTN),
                Click.on(REMOVE_PROD2_BTN)
        );
    }

    public static DeleteProductFromCart deleteProduct(String productName) {
        return Tasks.instrumented(DeleteProductFromCart.class, productName);
    }
}
