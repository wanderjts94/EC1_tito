package pe.edu.idat.ec1_tito

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityJoseph : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_joseph)
    }

    fun push():String{
        return "hola mundo"
    }
}