#language: es

Característica: ingresar a la pagina de libreria nacional

  @EscenarioLogin
  Escenario:Acceso pagina principal libreria nacional y validacion de ingreso exitoso
    Dado que el usuario se encuentra en la pagina web de libreria nacional
    Cuando ingresa sus credenciales
    Entonces se visualiza el panel principal con logo bienvenido Edison
