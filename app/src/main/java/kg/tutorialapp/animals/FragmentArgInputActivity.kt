package kg.tutorialapp.animals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class FragmentArgInputActivity : AppCompatActivity() {
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arg_input)

        button = findViewById(R.id.btn_arg)
        setUp()
    }

    private fun setUp() {
        button.setOnClickListener{
            val editText = findViewById<EditText>(R.id.editText)
            val text = editText.text.toString()

            val intent = Intent(this, FragmentArgOutputActivity::class.java)
            intent.putExtra("Key", text)

            startActivity(intent)
        }
    }}