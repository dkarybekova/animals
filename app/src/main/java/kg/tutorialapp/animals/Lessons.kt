package kg.tutorialapp.animals

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LessonActivities : AppCompatActivity() {

    lateinit var textview: TextView
    lateinit var btn29: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lessons)

        var actionBar = supportActionBar
        actionBar!!.title = "Main"
        actionBar.setDisplayHomeAsUpEnabled(true)

        textview = findViewById(R.id.textMain) as TextView
        textview.text = getString((R.string.lessons))

        btn29 = findViewById(R.id.btn_29)
        btn29.setOnClickListener {
            val lesson29Intent = Intent(this, RelativeLayoutActivity::class.java)
            startActivity(lesson29Intent)
        }
    }
}