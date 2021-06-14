package kg.tutorialapp.animals

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var image_1: ImageView
    lateinit var image_2: ImageView
    lateinit var image_3: ImageView
    lateinit var textview: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textview = findViewById(R.id.textView) as TextView
        image_1 = findViewById(R.id.image_1) as ImageView
        image_1.setOnClickListener{
            textview.text = getString((R.string.first))
        }

        image_2 = findViewById(R.id.image_2) as ImageView
        image_2.setOnClickListener{
            textview.text = getString((R.string.second))
        }

        image_3 = findViewById(R.id.image_3) as ImageView
        image_3.setOnClickListener{
            textview.text = getString((R.string.third))
        }
    }
}