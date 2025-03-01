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
    public static final Target NAMEPRODUCT1_CHECKOUT = Target.the("Nombre primer producto comprado")
            .locatedBy("//div[@class='cart_list']/div[3]/div[2]/a");
    public static final Target NAMEPRODUCT2_CHECKOUT = Target.the("Nombre segundo producto comprado")
            .locatedBy("//div[@class='cart_list']/div[4]/div[2]/a");
    public static final Target PRICEPRODUCT1_CHECKOUT = Target.the("Precio primer producto comprado")
            .locatedBy("//div[@class='cart_list']/div[3]/div[2]/div[2]");
    public static final Target PRICEPRODUCT2_CHECKOUT = Target.the("Precio segundo producto comprado")
            .locatedBy("//div[@class='cart_list']/div[4]/div[2]/div[2]");
    public static final Target ITEMTOTAL_FIELD = Target.the("Campo del costo de los productos")
            .locatedBy("//div[@class='summary_subtotal_label']");
    public static final Target TAX_FIELD = Target.the("Campo del valor del impuesto")
            .locatedBy("//div[@class='summary_tax_label']");
    public static final Target TOTALPRICE_FIELD = Target.the("Campo del precio total con impuesto")
            .locatedBy("//div[@class='summary_total_label']");
    public static final Target FINISH_BTN = Target.the("Boton de finalizacion de compra")
            .locatedBy("//a[contains(text(), 'FINISH')]");
    public static final Target FINAL_MSG = Target.the("Mensaje de confirmacion de compra")
            .locatedBy("//h2[@class='complete-header']");
}
