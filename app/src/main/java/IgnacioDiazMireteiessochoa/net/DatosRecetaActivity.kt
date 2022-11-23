package IgnacioDiazMireteiessochoa.net

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DatosRecetaActivity : AppCompatActivity() {
    companion object{
        val EXTRA_DATO="Practica2.DatosRecetaActivity.dato"
        val EXTRA_TIPO="Practica2.DatosRecetaActivity.tipo"
        private lateinit var tvEncabezado: TextView
        private lateinit var tvTexto: TextView
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos_receta)
        tvEncabezado = findViewById(R.id.tvEncabezado)
        tvTexto = findViewById(R.id.tvTexto)


    }
}