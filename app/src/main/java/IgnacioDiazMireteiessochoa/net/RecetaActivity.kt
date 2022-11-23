package IgnacioDiazMireteiessochoa.net

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RecetaActivity : AppCompatActivity() {
    private lateinit var tvDescripcion: TextView
    private lateinit var tvDescripcionText: TextView
    private lateinit var tvRecetaText: TextView
    private lateinit var tvReceta: TextView
    private lateinit var tvIngredientes: TextView
    private lateinit var tvIngredientesText: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receta)
        tvDescripcion = findViewById(R.id.tvDescripcion)
        tvDescripcionText = findViewById(R.id.tvDescripcionText)
        tvRecetaText = findViewById(R.id.tvRecetaText)
        tvReceta = findViewById(R.id.tvReceta)
        tvIngredientes = findViewById(R.id.tvIngredientes)
        tvIngredientesText = findViewById(R.id.tvIngredientesText)
        tvDescripcion.setOnClickListener(){llamarActivityDatos(tvDescripcion.text.toString(), tvDescripcionText.text.toString())}
        tvDescripcionText.setOnClickListener(){llamarActivityDatos(tvDescripcion.text.toString(), tvDescripcionText.text.toString())}
        tvReceta.setOnClickListener(){llamarActivityDatos(tvReceta.text.toString(), tvRecetaText.text.toString())}
        tvRecetaText.setOnClickListener(){llamarActivityDatos(tvReceta.text.toString(), tvRecetaText.text.toString())}
    }

    private fun llamarActivityDatos(toString1: String, toString: String) {
        val intent = Intent(this, DatosRecetaActivity::class.java)
        llamarActivityDatos(toString1, toString)
        startActivity(intent)
    }
}