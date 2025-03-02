Feature: Compra de productos en un sitio web

  Scenario Outline: Ingreso a la pagina principal de Swag Labs con credenciales validas
    Given un usuario se encuentra en la pagina de inicio de sesion
    When ingresa con usuario "<usuario>" y contrasena "<contrasena>" validos
    Then debe mostrarse la pagina principal de Swag Labs

    Examples:
      | usuario        | contrasena    |
      | standard_user  | secret_sauce  |

  Scenario Outline: Ingreso a la pagina principal de Swag Labs con usuario bloqueado
    Given un usuario se encuentra en la pagina de iniciar de sesion
    When ingresa con usuario "<usuario>" y contrasena "<contrasena>" invalidos
    Then debe mostrarse el mensaje de error "<mensaje>"

    Examples:
      | usuario         | contrasena    |mensaje       |
      | locked_out_user | secret_sauce  |Epic sadface  |

  Scenario Outline: Ordenamiento de productos
    Given un usuario se encuentra en la pagina principal de Swag Labs
    When ordena los productos por el orden "<orden>"
    Then los productos se ordenan en orden "<orden>"
    Examples:
    |orden              |
    |Price (low to high)|

  Scenario Outline: Agregar productos al carrito
    Given un usuario se encuentra en la pagina de productos de Swag Labs
    When agrega los productos "<producto1>" "<producto2>" "<producto3>" al carrito
    Then los productos seleccionados deben aparecer en el carrito
    Examples:
    |producto1              |producto2            |producto3        |
    |Sauce Labs Bolt T-Shirt|Sauce Labs Bike Light|Sauce Labs Onesie|

  Scenario Outline: Eliminar productos del carrito
    Given un usuario se encuentra en el carrito de compras
    When elimina el producto "<producto>"
    Then el producto no debe aparecer en el carrito
    Examples:
    |producto             |
    |Sauce Labs Bike Light|

  Scenario Outline: Finalizar la compra exitosamente
    Given un usuario tiene productos en el carrito de compras
    When procede al checkout completando la informacion solicitada "<nombre>" "<apellido>" "<codigopostal>" y finaliza la compra
    Then debe mostrarse el mensaje de confirmacion "<mensaje>"
    Examples:
    |mensaje                  |nombre |apellido  |codigopostal|
    |THANK YOU FOR YOUR ORDER |pepito |perez     |12345       |




  