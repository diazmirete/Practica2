package IgnacioDiazMireteiessochoa.net

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class AgendaActivity : AppCompatActivity() {
    private lateinit var btAceptar: Button
    private lateinit var btCancelar: Button
    private lateinit var etNombre: EditText
    private lateinit var etApellidos: EditText
    private lateinit var tvNuevoContacto: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agenda)
        btAceptar = findViewById(R.id.btAceptar)
        btCancelar = findViewById(R.id.btCancelar)
        etNombre = findViewById(R.id.etNombre)
        etApellidos = findViewById(R.id.etApellidos)
        tvNuevoContacto = findViewById(R.id.tvNuevoContacto)
        btAceptar.setOnClickListener(){
            if (!(etNombre.text.toString().isEmpty()&&etApellidos.text.toString().isEmpty())){
                var nombreApellido = etNombre.text.toString()+" "+etApellidos.text.toString()
                tvNuevoContacto.setText(nombreApellido)
            } else {
                Toast.makeText(this, getString(R.string.mensajeAceptar),Toast.LENGTH_LONG).show()
            }
        }
        btCancelar.setOnClickListener() { finish() }
    }
}

private fun TextView.setText(nombreApellido: EditText) {
    TODO("Not yet implemented")
}

