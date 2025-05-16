package co.sqasa.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class CarritoPage extends PageObject {

    private By contadorCarrito = By.cssSelector(".cart-count");
    private By botonEliminar = By.cssSelector(".remove-item");

    public int obtenerCantidadEnCarrito() {
        String texto = find(contadorCarrito).getText();
        return Integer.parseInt(texto);
    }

    public void eliminarProducto() {
        find(botonEliminar).click();
    }
}