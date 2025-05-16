package co.sqasa.Steps;

import co.sqasa.pageObjects.CategoriaPage;
import co.sqasa.pageObjects.CarritoPage;
import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.Assertions.assertThat;

public class CarritoSteps {

    CategoriaPage categoriaPage;
    CarritoPage carritoPage;

    @Step("Abrir la página principal")
    public void abrirPaginaPrincipal() {
        categoriaPage.abrirPaginaPrincipal();
    }

    @Step("Agregar {0} productos al carrito")
    public void agregarProductos(int cantidad) {
        categoriaPage.agregarProductosAlCarrito(cantidad);
    }

    @Step("Verificar que el carrito tiene {0} productos")
    public void verificarCantidad(int esperado) {
        int actual = carritoPage.obtenerCantidadEnCarrito();
        assertThat(actual).isEqualTo(esperado);
    }

    @Step("Eliminar un producto del carrito")
    public void eliminarProducto() {
        carritoPage.eliminarProducto();
    }
}