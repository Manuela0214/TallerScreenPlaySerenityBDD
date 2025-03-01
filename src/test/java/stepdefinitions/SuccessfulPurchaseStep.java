package stepdefinitions;

import hook.OpenBrowser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.UrlPage;

import static constants.Constants.ACTOR;
import static constants.Constants.WEB_URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static questions.UrlPage.urlPage;
import static tasks.Login.login;

public class SuccessfulPurchaseStep {
    @Given("un usuario se encuentra en la pagina de inicio de sesion")
    public void unUsuarioSeEncuentraEnLaPaginaDeInicioDeSesion() {
        OnStage.theActorCalled(ACTOR).attemptsTo(
                OpenBrowser.openUrl(WEB_URL)
        );
    }

    @When("ingresa con usuario {string} y contrasena {string} validos")
    public void ingresaConUsuarioYContrasenaValidos(String username, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                login(username, password)
        );
    }

    @Then("debe mostrarse la pagina principal de Swag Labs")
    public void debeMostrarseLaPaginaPrincipalDeSwagLabs() {
        OnStage.theActorInTheSpotlight().should(
                //seeThat(UrlPage.urlPage(), equalTo("https://www.saucedemo.com/v1/inventory.html"))
                seeThat(UrlPage.urlPage(), containsString("inventory.html"))

        );
    }

//    @Given("un usuario inicia sesión con credenciales válidas")
//    public void unUsuarioIniciaSesiónConCredencialesVálidas() {
//    }
//
//    @When("ordena los productos por el orden {string}")
//    public void ordenaLosProductosPorElOrden(String arg0) {
//    }
//
//    @Then("los productos se ordenan en orden {string}")
//    public void losProductosSeOrdenanEnOrden(String arg0) {
//    }
//
//    @Given("un usuario se encuentra en la pagina principal de Swag Labs")
//    public void unUsuarioSeEncuentraEnLaPaginaPrincipalDeSwagLabs() {
//    }
//
//    @When("agrega los productos {string} {string} {string} al carrito")
//    public void agregaLosProductosAlCarrito(String arg0, String arg1, String arg2) {
//    }
//
//    @Then("los productos seleccionados deben aparecer en el carrito")
//    public void losProductosSeleccionadosDebenAparecerEnElCarrito() {
//    }
//
//    @Given("un usuario se encuentra en el carrito de compras")
//    public void unUsuarioSeEncuentraEnElCarritoDeCompras() {
//    }
//
//    @When("elimina el producto {string}")
//    public void eliminaElProducto(String arg0) {
//    }
//
//    @Then("el producto {string} no debe aparecer en el carrito")
//    public void elProductoNoDebeAparecerEnElCarrito(String arg0) {
//    }
//
//    @Given("un usuario tiene productos en el carrito de compras")
//    public void unUsuarioTieneProductosEnElCarritoDeCompras() {
//    }
//
//    @When("procede al checkout y completa la informacion solicitada")
//    public void procedeAlCheckoutYCompletaLaInformacionSolicitada() {
//    }
//
//    @And("finaliza la compra")
//    public void finalizaLaCompra() {
//    }
//
//    @Then("debe mostrarse el mensaje de confirmacion {string}")
//    public void debeMostrarseElMensajeDeConfirmacion(String arg0) {
//    }
}
