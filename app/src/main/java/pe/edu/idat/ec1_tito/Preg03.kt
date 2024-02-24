package pe.edu.idat.ec1_tito

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import pe.edu.idat.ec1_tito.databinding.ActivityPreg03Binding
import android.widget.RadioButton

class Preg03 : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityPreg03Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPreg03Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnVenta.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        val resultado = preciomotocondescunetoseleccionado(
            marca = binding.twmoto.text.toString(),
            precioMoto = binding.twcostoM.text.toString().toDouble(),
            seleccionradiobuton = getSelectedDay()
        )
        binding.result3.text = resultado
    }

    fun getSelectedDay(): String {
        val radioGroup = binding.radioGroup
        val selectedRadioButtonId = radioGroup.checkedRadioButtonId
        val radioButton = findViewById<RadioButton>(selectedRadioButtonId)
        return radioButton.text.toString()
    }

    fun preciomotocondescunetoseleccionado(marca: String, precioMoto: Double, seleccionradiobuton: String): String {
        val descuento = when (seleccionradiobuton) {
            "Martes" -> 0.12
            "Sábado" -> 0.18
            "Feriado" -> 0.25
            else -> 0.0
        }
        val precioConDescuento = precioMoto * (1 - descuento)
        return "por hacer la conpra un tiene un $seleccionradiobuton precio de venta con descuento de la moto $marca es: $$precioConDescuento"
    }

}
