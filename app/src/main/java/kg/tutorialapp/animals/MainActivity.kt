package kg.tutorialapp.animals

import android.os.Bundle
import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
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
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_bar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.first_button -> Toast.makeText(this, "You clicked on First button", Toast.LENGTH_SHORT).show()
            R.id.second_button -> Toast.makeText(this, "You clicked on Second button", Toast.LENGTH_SHORT).show()
            R.id.third_button-> Toast.makeText(this, "You clicked on Third button", Toast.LENGTH_SHORT).show()
            R.id.fourth_button -> Toast.makeText(this, "You clicked on Fourth button", Toast.LENGTH_SHORT).show()
        }
        return true
    }
}