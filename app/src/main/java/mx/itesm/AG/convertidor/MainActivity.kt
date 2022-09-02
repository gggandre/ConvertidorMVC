package mx.itesm.AG.convertidor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import mx.itesm.AG.convertidor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{

    //Referencias a los componentes de la GUI
    //private var etKilometros: EditText? = null
    //private var etMillas: EditText? = null
    // Button

    //Mecanismo Viewbinding
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) //es la vista principal de la GUI



        configurarGUI()
    }

    private fun configurarGUI() {
        //etKilometros = findViewById(R.id.etKilometros)
        //etMillas = findViewById(R.id.etMillas)
        val btnConvertir = binding.btnConvertir //findViewById<Button>(R.id.btnConvertir)

        btnConvertir.setOnClickListener {
            val kms = binding.etKilometros.text.toString().toDouble()
            val modelo = Convertidor() //Se llama al constructor de Convertidor
            val mi = modelo.convertirKmMi(kms)
            //val mi = kms / 1.6 //Erroor!! El controller no debe hacer lógica
            binding.etMillas.setText( mi.toString() )

        }
    }
}