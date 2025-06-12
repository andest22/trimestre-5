  # language: es
  # author: Andres Castañeda

  Característica: Registro completo de nuevos usuarios en la plataforma
     completar mi información
    Para crear una cuenta y acceder a funcionalidades personalizadas


    Antecedentes:
      Dado que el visitante está en la página de Signup/Login
      Cuando ingresa las credenciales básicas:
        | name   | email                     |
        | andres | test24654646545@gmail.com |

    @registro
    Esquema del escenario: Registro de usuario completando todos los pasos del formulario

      Cuando completa los campos requeridos:
        | Contraseña   | firstName   | apellido   | direccion   | estado   | ciudad   | codigo_Postal   | movil   |
        | <Contraseña> | <firstName> | <apellido> | <direccion> | <estado> | <ciudad> | <codigo_Postal> | <movil> |

      Entonces la cuenta debe ser creada y el usuario redirigido a la vista de confirmación

      Ejemplos:

        | Contraseña | firstName      | apellido | direccion       | estado     | ciudad | codigo_Postal | movil      |
        | prueba123  | Andres Esteban | Perez    | Calle Falsa 123 | Mharashtra | Munbai | 400001        | 3175248114 |
