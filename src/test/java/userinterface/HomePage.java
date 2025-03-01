package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {

    public static final Target TITLESECTION = Target.the("Titulo seccion de productos")
            .locatedBy("//div[@class='product_label']");
    public static final Target ORDERBY_BTN = Target.the("Boton para odenar")
            .locatedBy("//select[@class='product_sort_container']");
    public static final Target LOWTOHIGH_OPT = Target.the("Opcion Price low to high")
            .locatedBy("//option[@value='lohi']");
    public static final Target ADDTOCART_PROD1_BTN = Target.the("Boton agregar primer producto")
            .locatedBy("//div[contains(@class, 'inventory_item')][.//div[contains(text(), 'Sauce Labs Bolt T-Shirt')]]//button[contains(@class, 'btn_inventory')]");
    public static final Target ADDTOCART_PROD2_BTN = Target.the("Boton agregar segundo producto")
            .locatedBy("//div[contains(@class, 'inventory_item')][.//div[contains(text(), 'Sauce Labs Bike Light')]]//button[contains(@class, 'btn_inventory')]");
    public static final Target ADDTOCART_PROD3_BTN = Target.the("Boton agregar tercer producto")
            .locatedBy("//div[contains(@class, 'inventory_item')][.//div[contains(text(), 'Sauce Labs Onesie')]]//button[contains(@class, 'btn_inventory')]");
    public static final Target CART_BTN = Target.the("")
            .locatedBy("//div[@id='shopping_cart_container']/a");

}
