package com.example.conversor

import android.content.Intent
import android.icu.lang.UCharacter.NumericType
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var otrosDolares : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var MisDolares : EditText = findViewById(R.id.EditTextDolares)
        otrosDolares = 100
        //Este boton realiza una conversion de dolares a pesos

        var button: Button = findViewById(R.id.button)
        button.setOnClickListener(){
            var miCadena : Boolean = true
            //colocamos el valor del editText convertido en String en una variable para poder manipularlo
            var Dola = MisDolares.text.toString()
            /*Posteriomente se realiza la conversion, se convierte la variable de string a double y porteriomente
            se multiplica por el valor definido en lam equivalencia, donde el resultado se almacena en una variable
            del tipo double
             */
            val  numP:Double = Dola.toDouble()*19.95
            /*
            Por ultimo convertimos el valor almacenado de la operacion anterior a string para poder
            desplegarlo en el contenedor
             */
            val redondeado = String.format("%.2f",numP)
            val editTextNumber8: TextView = findViewById(R.id.editTextNumber8)
            editTextNumber8.text=redondeado
            val mensaje = Toast.makeText(this,"se hizo la conversion de dolares a pesos",Toast.LENGTH_LONG)
            mensaje.show()
        }

        var MisPies : EditText = findViewById(R.id.editTextPies)
        //Este boton realiza una conversion de dolares a pesos

        var button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener(){
            var miCadena : Boolean = true
            //colocamos el valor del editText convertido en String en una variable para poder manipularlo
            var pie = MisPies.text.toString()
            /*Posteriomente se realiza la conversion, se convierte la variable de string a double y porteriomente
            se multiplica por el valor definido en lam equivalencia, donde el resultado se almacena en una variable
            del tipo double
             */
            val  numP:Double = pie.toDouble()*0.3048
            /*
            Por ultimo convertimos el valor almacenado de la operacion anterior a string para poder
            desplegarlo en el contenedor
             */
            val redondeado = String.format("%.2f",numP)
            val editTextNumber10: TextView = findViewById(R.id.editTextNumber10)
            editTextNumber10.text=redondeado
            val mensaje = Toast.makeText(this,"se hizo la conversion de Pies a Metros",Toast.LENGTH_LONG)
            mensaje.show()
        }
        var MisLibras : EditText = findViewById(R.id.editTextLibras)
        //Este boton realiza una conversion de dolares a pesos

        var button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener(){
            var miCadena : Boolean = true
            //colocamos el valor del editText convertido en String en una variable para poder manipularlo
            var libra = MisLibras.text.toString()
            /*Posteriomente se realiza la conversion, se convierte la variable de string a double y porteriomente
            se multiplica por el valor definido en lam equivalencia, donde el resultado se almacena en una variable
            del tipo double
             */
            val  numP:Double = libra.toDouble()*0.453592
            /*
            Por ultimo convertimos el valor almacenado de la operacion anterior a string para poder
            desplegarlo en el contenedor
             */
            val redondeado = String.format("%.2f",numP)
            val editTextNumber12: TextView = findViewById(R.id.editTextNumber12)
            editTextNumber12.text=redondeado
            val mensaje = Toast.makeText(this,"se hizo la conversion de Libras a Kilos",Toast.LENGTH_LONG)
            mensaje.show()
        }
        //Boton que llama a la actividad que si se voltea
        val otrav : Button = findViewById(R.id.button4)
        otrav.setOnClickListener(){
            //creamos la intencion para desplegar la actividad
            val intent = Intent(this,volteable::class.java)
            //llamamos la actividad a la que se refiere el intent para que se desplegue
            startActivity(intent)
        }
    }
}