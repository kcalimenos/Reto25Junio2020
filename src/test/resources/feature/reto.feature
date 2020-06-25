#language:es
@Regression
Característica: Validar codigo de reserva

  Escenario: Kevin, como analista de pruebas, quiere validar su codigo de reserva de seis digitos

    Dado Que necesito abrir la pagina
    Cuando Ejecute el flujo para mirar ejemplo del codigo de reserva
    Entonces Valido que el codigo de reserva tenga seis caracteres VBCDGG.