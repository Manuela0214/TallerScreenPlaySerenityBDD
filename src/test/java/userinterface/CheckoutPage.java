package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage extends PageObject {

    public static final Target FIRSTNAME_INPUT = Target.the("Input para el primer nombre")
            .locatedBy("//input[@id='first-name']");
    public static final Target LASTNAME_INPUT = Target.the("Input para el apellido")
            .locatedBy("//input[@id='last-name']");
    public static final Target POSTALCODE_INPUT = Target.the("Input para el codigo postal")
            .locatedBy("//input[@id='postal-code']");
    public static final Target CONTINUE_BTN = Target.the("Boton para continuar la compra")
            .locatedBy("//input[contains(@class, 'btn_primary') and contains(@value,'CONTINUE')]");
    public static final Target FINISH_BTN = Target.the("Boton de finalizacion de compra")
            .locatedBy("//a[contains(text(), 'FINISH')]");
    public static final Target FINAL_MSG = Target.the("Mensaje de confirmacion de compra")
            .locatedBy("//h2[@class='complete-header']");
}
