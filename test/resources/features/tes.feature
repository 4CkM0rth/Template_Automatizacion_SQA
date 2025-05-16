Feature: Carrito de Compras en sanangel.com.co
  Como usuario
  Quiero añadir y eliminar productos del carrito
  Para verificar que la tienda funciona correctamente

  Scenario: Agregar dos productos al carrito
    Given que estoy en la página principal
    When agrego los primeros dos productos al carrito
    Then veo 2 productos en el carrito

  Scenario: Agregar y luego eliminar un producto
    Given que estoy en la página principal
    When agrego el primer producto al carrito
    Then veo 1 producto en el carrito
    When elimino el producto del carrito
    Then el carrito está vacío