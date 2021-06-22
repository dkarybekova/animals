package kg.tutorialapp.animals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActivityOutput : AppCompatActivity() {
    lateinit var outputText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lesson33_textoutput)

        outputText = findViewById(R.id.textFromOtherActivity)
        val textFromIntent = intent.getStringExtra("String")
        outputText.text = textFromIntent
    }
}