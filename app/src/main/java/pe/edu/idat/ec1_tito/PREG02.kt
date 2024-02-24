package pe.edu.idat.ec1_tito

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import pe.edu.idat.ec1_tito.databinding.ActivityPreg02Binding


class PREG02 : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityPreg02Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPreg02Binding.inflate(layoutInflater);
        setContentView(binding.root)
        binding.btnConvertirr.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val numeroIngresado = binding.ValNUmero.text.toString().toIntOrNull()
        if (numeroIngresado != null && numeroIngresado in 1..10) {
            val resultado = convertirANumeroRomano(numeroIngresado)
            binding.resuldado02.text = "el numero convertido a romano es: $resultado"
        } else {
            binding.resuldado02.text = "Ingrese un número entero válido del 1 al 10"
        }
    }

    fun convertirANumeroRomano(numero: Int): String {
        return when (numero) {
            1 -> "I"
            2 -> "II"
            3 -> "III"
            4 -> "IV"
            5 -> "V"
            6 -> "VI"
            7 -> "VII"
            8 -> "VIII"
            9 -> "IX"
            10 -> "X"
            else -> "Número Mayor a 10"
        }
    }
}