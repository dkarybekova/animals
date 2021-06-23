package kg.tutorialapp.animals

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityD : AppCompatActivity() {
    lateinit var btnD:Button
    lateinit var btnStartD: Button
    lateinit var btnStartC:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d)
        btnD = findViewById(R.id.btn_D)
        btnD.setOnClickListener {ActivityA.start(this) }
//        передаем контекст
//        открывает сам себя activity D
        btnStartD = findViewById(R.id.btn_start_D)
        btnStartD.setOnClickListener{ActivityD.start(this)}
//        открывает активити С
        btnStartC = findViewById(R.id.btn_start_C)
        btnStartC.setOnClickListener{ActivityC.start(this)}
    }
    companion object{
        fun start(context: Context){
            val intent = Intent(context, ActivityD::class.java)
            context.startActivity(intent)
        }

    }
}