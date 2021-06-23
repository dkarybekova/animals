package kg.tutorialapp.animals

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class ActivityA : AppCompatActivity() {
    lateinit var btnA: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

        btnA = findViewById(R.id.btn_A)
        btnA.setOnClickListener {ActivityB.start(this) }
    }
    companion object{
        fun start(context:Context){
            val intent = Intent(context, ActivityA::class.java)
            context.startActivity(intent)
        }
    }
}