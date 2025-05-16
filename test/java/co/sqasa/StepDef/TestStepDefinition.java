package co.sqasa.StepDef;

import co.sqasa.Steps.CarritoSteps;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class TestStepDefinition {

    @Steps
    CarritoSteps steps;

    @Dado("que estoy en la página principal")
    public void dadoEstoyEnLaPaginaPrincipal() {
        steps.abrirPaginaPrincipal();
    }

    @Cuando("agrego los primeros dos productos al carrito")
    public void agregoDosProductos() {
        steps.agregarProductos(2);
    }

    @Cuando("agrego el primer producto al carrito")
    public void agregoUnProducto() {
        steps.agregarProductos(1);
    }

    @Entonces("veo {int} productos en el carrito")
    public void veoCantidadEnElCarrito(int cantidad) {
        steps.verificarCantidad(cantidad);
    }

    @Cuando("elimino el producto del carrito")
    public void cuandoEliminoElProducto() {
        steps.eliminarProducto();
    }

    @Entonces("el carrito está vacío")
    public void entoncesElCarritoEstaVacio() {
        steps.verificarCantidad(0);
    }
}