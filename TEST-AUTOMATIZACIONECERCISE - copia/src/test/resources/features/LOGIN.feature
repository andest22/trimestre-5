# language: es
# author: Andres Castañeda

Característica: Registro completo de nuevos usuarios en la plataforma
  Como visitante del sitio
  Quiero poder registrarme mediante el formulario "New User Signup!"

  @registro
  Escenario: Registro de usuario completando todos los pasos del formulario
    Dado que el visitante está en la página de Signup/Login
    Cuando ingresa las credenciales básicas:
      | name   | email                     |
      | andres | test24654646545@gmail.com |
    Entonces debe ser redirigido a la vista Enter Account Information

