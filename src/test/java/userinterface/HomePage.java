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

    public static final Target PRICEPROD1_NAME = Target.the("Precio del producto 1 ordenado menor a mayor")
            .locatedBy("(//div[@class='inventory_item_price'])[1]");
    public static final Target PRICEPROD2_NAME = Target.the("Precio del producto 2 ordenado menor a mayor")
            .locatedBy("(//div[@class='inventory_item_price'])[2]");
    public static final Target PRICEPROD3_NAME = Target.the("Precio del producto 3 ordenado menor a mayor")
            .locatedBy("(//div[@class='inventory_item_price'])[3]");
    public static final Target PRICEPROD4_NAME = Target.the("Precio del producto 4 ordenado menor a mayor")
            .locatedBy("(//div[@class='inventory_item_price'])[4]");
    public static final Target PRICEPROD5_NAME = Target.the("Precio del producto 5 ordenado menor a mayor")
            .locatedBy("(//div[@class='inventory_item_price'])[5]");
    public static final Target PRICEPROD6_NAME = Target.the("Precio del producto 6 ordenado menor a mayor")
            .locatedBy("(//div[@class='inventory_item_price'])[6]");


    public static final Target ADDTOCART_PROD1_BTN = Target.the("Boton agregar primer producto")
            .locatedBy("//div[contains(@class, 'inventory_item')][.//div[contains(text(), 'Sauce Labs Bolt T-Shirt')]]//button[contains(@class, 'btn_inventory')]");
    public static final Target ADDTOCART_PROD2_BTN = Target.the("Boton agregar segundo producto")
            .locatedBy("//div[contains(@class, 'inventory_item')][.//div[contains(text(), 'Sauce Labs Bike Light')]]//button[contains(@class, 'btn_inventory')]");
    public static final Target ADDTOCART_PROD3_BTN = Target.the("Boton agregar tercer producto")
            .locatedBy("//div[contains(@class, 'inventory_item')][.//div[contains(text(), 'Sauce Labs Onesie')]]//button[contains(@class, 'btn_inventory')]");
    public static final Target CART_BTN = Target.the("")
            .locatedBy("//div[@id='shopping_cart_container']/a");

}
