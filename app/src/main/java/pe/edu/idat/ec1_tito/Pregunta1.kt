package pe.edu.idat.ec1_tito


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import pe.edu.idat.ec1_tito.databinding.ActivityPregunta1Binding


class Pregunta1 : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding:ActivityPregunta1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPregunta1Binding.inflate(layoutInflater);
        setContentView(binding.root)
        binding.btnCalcular.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
      val resultado = calcularsueldo(
          binding.valueNomb.text.toString(),
          binding.ValueAppel.text.toString(),
          binding.IDhrsTrab.text.toString().toDouble()
      )
        binding.twResultado.setText(resultado)
    }

    fun calcularsueldo(vaNombre: String, vaApellido: String, horasTrabajadas: Double): String {
        val salarioSemanal: Double
        val salarioHoraNormal = 16.0
        val salarioHoraExtra = 20.0

        if (horasTrabajadas <= 40) {
            salarioSemanal = horasTrabajadas * salarioHoraNormal
        } else {
            val horasNormales = 40.0
            val horasExtra = horasTrabajadas - horasNormales
            salarioSemanal = horasNormales * salarioHoraNormal + horasExtra * salarioHoraExtra
        }

        return "El salario semanal de $vaNombre $vaApellido es: S/. $salarioSemanal"
    }

}