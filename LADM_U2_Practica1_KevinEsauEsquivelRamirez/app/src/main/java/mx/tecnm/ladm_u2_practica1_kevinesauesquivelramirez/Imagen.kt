package mx.tecnm.ladm_u2_practica1_kevinesauesquivelramirez

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint

class Imagen(punterolienzo: Lienzo, posX:Float, posY:Float, nombreImagen: Int){
    var x = posX
    var y = posY
    var imagen = BitmapFactory.decodeResource(punterolienzo.resources, nombreImagen)

    fun dibujar(c: Canvas){
        c.drawBitmap(imagen, x, y, Paint())
    }

}