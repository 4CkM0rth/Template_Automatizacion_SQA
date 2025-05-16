package co.sqasa.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import java.util.List;

public class CategoriaPage extends PageObject {

    private By categoriaLink(String categoria) {
        return By.xpath("//a[contains(text(),'" + categoria + "')]");
    }

    public void abrirPaginaPrincipal() {
        openUrl("https://sanangel.com.co/");
    }

    public void seleccionarCategoria(String categoria) {
        find(categoriaLink(categoria)).click();
    }

    private By botonesAgregar = By.cssSelector(".add-to-cart");

    public void agregarProductosAlCarrito(int cantidad) {
        List<WebElementFacade> lista = findAll(botonesAgregar);
        for (int i = 0; i < cantidad && i < lista.size(); i++) {
            lista.get(i).click();
        }
    }
}