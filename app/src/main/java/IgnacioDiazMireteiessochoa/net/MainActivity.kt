package IgnacioDiazMireteiessochoa.net

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btAgenda: Button
    private lateinit var btReceta:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btAgenda=findViewById(R.id.btAgenda)
        btAgenda.setOnClickListener{
            val intent = Intent(this, AgendaActivity::class.java)
            startActivity(intent)
        }
        btReceta=findViewById(R.id.btReceta)
        btReceta.setOnClickListener{
            val intent = Intent(this, RecetaActivity::class.java)
            startActivity(intent)
        }
    }
}