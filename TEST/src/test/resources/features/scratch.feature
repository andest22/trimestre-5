#language:es
  #author:Andres Castañeda

Característica: visualizar los productos en la pagina de automatizacion
  Como usuario de automatizacion
  Quiero agregar un producto en el portal de productos
  Para poder acceder al carrito

  @autenticacion
  Escenario: Visualizar los productos en la pagina
    Dado que el usuario se encuentra en la pagina de productos
    Cuando ingrese el nombre de un producto que quiere buscar
      | Search Product | Blue Top|
    Entonces se debe dirigir a la vista de Carrito