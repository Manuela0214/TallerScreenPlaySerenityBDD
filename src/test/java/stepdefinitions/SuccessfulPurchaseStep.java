package stepdefinitions;

import hook.OpenBrowser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.*;
import java.util.Arrays;
import java.util.List;

import static constants.Constants.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static questions.SuccessfulMessage.successfulMessage;
import static questions.ErrorMessage.errorMessage;
import static tasks.AddToCart.addToCart;
import static tasks.CompleteCheckout.completeCheckout;
import static tasks.DeleteProductFromCart.deleteProduct;
import static tasks.Login.login;
import static tasks.OrderProducts.orderProducts;

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
                seeThat(UrlPage.urlPage(), containsString(URL_HOMEPAGE))
        );
    }

    @Given("un usuario se encuentra en la pagina principal de Swag Labs")
    public void unUsuarioSeEncuentraEnLaPaginaPrincipalDeSwagLabs() {
        OnStage.theActorCalled(ACTOR).attemptsTo(
                OpenBrowser.openUrl(WEB_URL),
                login(USERNAME, PASSWORD)
        );
    }

    @When("ordena los productos por el orden {string}")
    public void ordenaLosProductosPorElOrden(String orderBy) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                orderProducts(orderBy)
        );
    }

    @Then("los productos se ordenan en orden {string}")
    public void losProductosSeOrdenanEnOrden(String orderBy) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(CorrectOrder.correctOrder(), is(true))
        );
    }

    @Given("un usuario se encuentra en la pagina de productos de Swag Labs")
    public void unUsuarioSeEncuentraEnLaPaginaDeProductosDeSwagLabs() {
        unUsuarioSeEncuentraEnLaPaginaPrincipalDeSwagLabs();
    }

    @When("agrega los productos {string} {string} {string} al carrito")
    public void agregaLosProductosAlCarrito(String product1, String product2, String product3) {
        List<String> productos = Arrays.asList(product1, product2, product3);

        OnStage.theActorInTheSpotlight().attemptsTo(
                addToCart(productos)
        );
    }

    @Then("los productos seleccionados deben aparecer en el carrito")
    public void losProductosSeleccionadosDebenAparecerEnElCarrito() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(ProductsAdded.productsAdded(), is(true))
        );
    }

    @Given("un usuario se encuentra en el carrito de compras")
    public void unUsuarioSeEncuentraEnElCarritoDeCompras() {
        unUsuarioSeEncuentraEnLaPaginaPrincipalDeSwagLabs();
        OnStage.theActorCalled(ACTOR).attemptsTo(
                orderProducts(ORDER_BY),
                addToCart(Arrays.asList(PROD1,PROD2,PROD3))
        );
    }

    @When("elimina el producto {string}")
    public void eliminaElProducto(String product) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                deleteProduct(product)
        );
    }

    @Then("el producto no debe aparecer en el carrito")
    public void elProductoNoDebeAparecerEnElCarrito() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(ActualProducts.actualProducts(), is(true))
        );
    }

    @Given("un usuario tiene productos en el carrito de compras")
    public void unUsuarioTieneProductosEnElCarritoDeCompras() {
        unUsuarioSeEncuentraEnElCarritoDeCompras();
    }

    @When("procede al checkout completando la informacion solicitada {string} {string} {string} y finaliza la compra")
    public void procedeAlCheckoutYCompletaLaInformacionSolicitada(String name, String lastname, String postalcode) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                completeCheckout(name,lastname,postalcode)
        );
    }

    @Then("debe mostrarse el mensaje de confirmacion {string}")
    public void debeMostrarseElMensajeDeConfirmacion(String message) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(successfulMessage(), containsString(SUCCESSFUL_MESSAGE))
        );
    }

    @Given("un usuario se encuentra en la pagina de iniciar de sesion")
    public void unUsuarioSeEncuentraEnLaPaginaDeIniciarDeSesion() {
        unUsuarioSeEncuentraEnLaPaginaDeInicioDeSesion();
    }

    @When("ingresa con usuario {string} y contrasena {string} invalidos")
    public void ingresaConUsuarioYContrasenaInvalidos(String username, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                login(username, password)
        );
    }

    @Then("debe mostrarse el mensaje de error {string}")
    public void debeMostrarseElMensajeDeError(String message) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(errorMessage(), containsString(ERROR_MESSAGE) )
        );
    }
}
