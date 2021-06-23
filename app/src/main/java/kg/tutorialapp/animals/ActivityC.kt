package kg.tutorialapp.animals

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityC : AppCompatActivity() {
    lateinit var btnC: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
        btnC = findViewById(R.id.btn_c)
        btnC.setOnClickListener {ActivityD.start(this) }
    }
    companion object{
        fun start(context: Context){
            val intent = Intent(context, ActivityC::class.java)
            context.startActivity(intent)
        }
    }
}