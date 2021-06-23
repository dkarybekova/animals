package kg.tutorialapp.animals

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityB : AppCompatActivity() {
    lateinit var btnB:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        btnB = findViewById(R.id.btn_b)
        btnB.setOnClickListener {ActivityC.start(this) }
    }
    companion object{
        fun start(context: Context){
            val intent = Intent(context, ActivityB::class.java)
            context.startActivity(intent)
        }

    }
}