package pe.edu.idat.ec1_tito

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import pe.edu.idat.ec1_tito.databinding.ActivityPreg02Binding
import pe.edu.idat.ec1_tito.databinding.ActivityPreg04Binding

class Preg04 : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding:ActivityPreg04Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPreg04Binding.inflate(layoutInflater);
        setContentView(binding.root)
        binding.btnprimos.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val suma = calcularSumaMultiplosde3()
        binding.twresult04.text = "La suma de los múltiplos de 3 es: $suma"
    }
    private fun calcularSumaMultiplosde3(): Int {
        var suma = 0
        for (i in 9..45) {
            if (!estaEnRangoExcluido(i) && esMultiploDeTres(i)) {
                suma += i
            }
        }
        return suma
    }

    private fun estaEnRangoExcluido(numero: Int): Boolean {
        return numero in 21..27
    }

    private fun esMultiploDeTres(numero: Int): Boolean {
        return numero % 3 == 0
    }
}