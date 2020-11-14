package mx.tecnm.ladm_u2_practica1_kevinesauesquivelramirez


import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.CountDownTimer
import android.view.MotionEvent
import android.view.View

class Lienzo(p: MainActivity) : View(p) {
    var activo  = false
    var cuadro = Figura(0,500,1200,1000)

    var guirnalda1 = Imagen(this, 50f,150f, R.drawable.guirnalda)
    var guirnalda2 = Imagen(this, 250f,150f, R.drawable.guirnalda)
    var guirnalda3 = Imagen(this, 450f,150f, R.drawable.guirnalda)
    var guirnalda4 = Imagen(this, 650f,150f, R.drawable.guirnalda)
    var guirnalda5 = Imagen(this, 850f,150f, R.drawable.guirnalda)

    var guirnalda6 = Imagen(this, 50f,1600f, R.drawable.guirnalda)
    var guirnalda7 = Imagen(this, 250f,1600f, R.drawable.guirnalda)
    var guirnalda8 = Imagen(this, 450f,1600f, R.drawable.guirnalda)
    var guirnalda9 = Imagen(this, 650f,1600f, R.drawable.guirnalda)
    var guirnalda10 = Imagen(this, 850f,1600f, R.drawable.guirnalda)

    var tumba1 = Imagen(this, 100f, 700f, R.drawable.tumba)
    var tumba2 = Imagen(this, 450f,600f, R.drawable.tumba)
    var tumba3 = Imagen(this, 800f,700f, R.drawable.tumba)
    var tumba4 = Imagen(this, 50f,900f, R.drawable.tumba)
    var tumba5 = Imagen(this, 850f,900f, R.drawable.tumba)
    var tumba6 = Imagen(this, 100f,1100f, R.drawable.tumba)
    var tumba7 = Imagen(this, 450f,1200f, R.drawable.tumba)
    var tumba8 = Imagen(this, 750f,1100f, R.drawable.tumba)

    var xC=400f
    var yC=800f
    var incrementoX=5

    val timer = object : CountDownTimer(30,100){
        override fun onTick(p0: Long) {
            xC+=incrementoX
            if (xC<=200 || xC>=550){
                incrementoX*=-1
            }
            invalidate()
        }
        override fun onFinish() {
            start()
        }
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val paint = Paint()
        //fondo
        canvas.drawColor(Color.rgb(0, 0, 0))

        // pinta cuadro
        paint.color = Color.rgb(254, 248, 109)
        cuadro.pintar(canvas, paint)

        //dibujar tumbas
        tumba1.dibujar(canvas)
        tumba2.dibujar(canvas)
        tumba3.dibujar(canvas)
        tumba4.dibujar(canvas)
        tumba5.dibujar(canvas)
        tumba6.dibujar(canvas)
        tumba7.dibujar(canvas)
        tumba8.dibujar(canvas)

        //dibujar guirnaldas
        guirnalda1.dibujar(canvas)
        guirnalda2.dibujar(canvas)
        guirnalda3.dibujar(canvas)
        guirnalda4.dibujar(canvas)
        guirnalda5.dibujar(canvas)
        guirnalda6.dibujar(canvas)
        guirnalda7.dibujar(canvas)
        guirnalda8.dibujar(canvas)
        guirnalda9.dibujar(canvas)
        guirnalda10.dibujar(canvas)

        //calavera
        var calavera = Imagen(this, xC, yC, R.drawable.calavera)
        calavera.dibujar(canvas)

    }//OnDrawn

    //event.action para iniciar el movimiento de la calavera
    override fun onTouchEvent(event: MotionEvent): Boolean {

        if (event.action == MotionEvent.ACTION_DOWN) {
            //Entra si se presiona
            if (activo == false) {
                timer.start()
                activo = true
            }
        }
        if (event.action == MotionEvent.ACTION_MOVE) {

        }
        if (event.action == MotionEvent.ACTION_UP) {

        }
        invalidate()
        return true
    }

}