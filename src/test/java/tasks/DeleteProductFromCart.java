package tasks;

import lombok.NoArgsConstructor;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterface.CartPage.REMOVE_PROD2_BTN;
import static userinterface.HomePage.*;

@NoArgsConstructor
public class DeleteProductFromCart implements Task {

    @Override
    @Step("{0} elimina un producto del carrito de compras")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CART_BTN),
                WaitUntil.the(REMOVE_PROD2_BTN, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(REMOVE_PROD2_BTN)
        );
    }

    public static DeleteProductFromCart deleteProduct(String productName) {
        return Tasks.instrumented(DeleteProductFromCart.class, productName);
    }
}
