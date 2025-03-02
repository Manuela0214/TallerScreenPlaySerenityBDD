package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CartPage extends PageObject {

    public static final Target QUANTITY_PROD1 = Target.the("Cantidad producto 1 en el carrito")
            .locatedBy("//div[@id='cart_contents_container']/div/div[1]/div[3]/div[1]");
    public static final Target QUANTITY_PROD2 = Target.the("Cantidad producto 1 en el carrito")
            .locatedBy("//div[@id='cart_contents_container']/div/div[1]/div[4]/div[1]");
    public static final Target QUANTITY_PROD3 = Target.the("Cantidad producto 1 en el carrito")
            .locatedBy("//div[@id='cart_contents_container']/div/div[1]/div[5]/div[1]");
    public static final Target REMOVE_PROD2_BTN = Target.the("Boton eliminar segundo producto")
            .locatedBy("//div[@id='cart_contents_container']/div/div[1]/div[4]/div[2]/div[2]/button");

    public static final Target PROD1CART_NAME = Target.the("Producto 1 en el carrito")
            .locatedBy("//a[@id='item_1_title_link']/div");
    public static final Target PROD2CART_NAME = Target.the("Producto 2 en el carrito")
            .locatedBy("//a[@id='item_0_title_link']/div");
    public static final Target PROD3CART_NAME = Target.the("Producto 3 en el carrito")
            .locatedBy("//a[@id='item_2_title_link']/div");

    public static final Target CHECKOUT_BTN = Target.the("Boton checkout")
            .locatedBy("//a[contains(@class,'checkout_button')]");

}
