#language: es
#author: TuNombre

Característica: Registro de nuevos usuarios en la plataforma
  Como visitante del sitio
  Quiero poder registrarme mediante el formulario de "New User Signup!"
  Para crear una cuenta y acceder a funcionalidades personalizadas

  @registro
  Escenario: Ingresar datos básicos para iniciar el proceso de registro
    Dado que el visitante está en la página de Signup/Login
    Cuando ingrese las credenciales correctas (nombre y correo)
      | name   | email                     |
      | andres | test24654646545@gmail.com |
    Entonces debe ser redirigido a la vista de Enter Account Information
