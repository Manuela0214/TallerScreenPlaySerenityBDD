package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage extends PageObject {

    public static final Target USERNAME_FIELD = Target.the("Campo de nombre de usuario")
            .locatedBy("//input[@id='user-name']");
    public static final Target PASSWORD_FIELD = Target.the("Campo de contrasena")
            .locatedBy("//input[@id='password']");
    public static final Target LOGIN_BTN = Target.the("Boton de inicio de sesion")
            .locatedBy("//input[@id='login-button']");
}
