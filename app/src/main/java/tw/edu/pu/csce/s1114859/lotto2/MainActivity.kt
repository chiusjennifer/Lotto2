package tw.edu.pu.csce.s1114859.lotto2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var txv: TextView =findViewById(R.id.txv)
        txv.text="0"
    }

    fun happy(v: View){
        var txv:TextView=findViewById(R.id.txv)
        txv.text=(1..100).random().toString()
    }
}