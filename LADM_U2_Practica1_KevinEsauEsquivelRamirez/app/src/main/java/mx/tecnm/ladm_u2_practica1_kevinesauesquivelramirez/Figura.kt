package mx.tecnm.ladm_u2_practica1_kevinesauesquivelramirez

import android.graphics.Canvas
import android.graphics.Paint

class Figura() {
    var x = 0f
    var y = 0f
    var tipo = 1
    var ancho = 0f
    var alto = 0f

    constructor(x: Int, y: Int, ancho: Int, alto: Int) : this() {
        this.x = x.toFloat()
        this.y = y.toFloat()
        this.ancho = ancho.toFloat()
        this.alto = alto.toFloat()
    }

    fun pintar(c: Canvas, p: Paint) {
        when (tipo) {
            1 -> {
                c.drawRect(x, y, x + ancho, y + alto, p)
            }
        }
    }

}