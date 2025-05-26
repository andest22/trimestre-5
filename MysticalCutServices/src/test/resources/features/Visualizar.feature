#language: es
#author: Andres Esteban Castañenda

Característica: Selección de servicios de cortes en la aplicación Mystical Cut
  Como cliente de la barbería
  Quiero visualizar los servicios de cortes disponibles
  Para poder seleccionar el corte que deseo agendar

  @servicios
  Escenario: Visualización y selección de un servicio de corte
    Dado que el usuario ha iniciado sesión correctamente en la plataforma
    Y se encuentra en la vista de servicios de cortes
    Cuando el usuario visualiza la lista de cortes disponibles
    Entonces debe ver al menos un servicio con su nombre, descripción, imagen y botones de acción
    Y cada servicio debe tener un botón para "Ver" detalles
    Y un botón para "Seleccionar" el corte
