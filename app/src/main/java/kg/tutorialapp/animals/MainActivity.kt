package kg.tutorialapp.animals

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var textview: TextView
    lateinit var btnHomeworks: Button
    lateinit var btnLessons: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var actionBar = supportActionBar
        actionBar!!.title = "Main"
        actionBar.setDisplayHomeAsUpEnabled(true)


        btnHomeworks = findViewById(R.id.btn_homeworks)
        btnHomeworks.setOnClickListener {
            val homeworksIntent = Intent(this, HomeworkActivities::class.java)
            startActivity(homeworksIntent)
        }
        btnLessons = findViewById(R.id.btn_lessons)
        btnLessons.setOnClickListener {
            val lessonsIntent = Intent(this, LessonActivities::class.java)
            startActivity(lessonsIntent)
        }
    }
}