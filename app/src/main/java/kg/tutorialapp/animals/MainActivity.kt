package kg.tutorialapp.animals

import android.content.Context
import android.os.Bundle
import android.content.Intent
import android.os.Build
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import android.app.NotificationChannel
import android.app.NotificationManager
import androidx.core.app.NotificationManagerCompat

class MainActivity : AppCompatActivity() {

    lateinit var textview: TextView
    lateinit var btnHomeworks: Button
    lateinit var btnLessons: Button

    private val NotificationID = 103
    private val CHANNEL_ID = "channel_id_01"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var actionBar = supportActionBar
        actionBar!!.title = "Main"
        actionBar.setDisplayHomeAsUpEnabled(true)

        homeworkActivities()
        lessonActivities()
        createNotificationsChannel()

        val button = findViewById<Button>(R.id.btn_note)
        button.setOnClickListener{
            sendNotifications()
        }
    }

    private fun homeworkActivities() {
        btnHomeworks = findViewById(R.id.btn_homeworks)
        btnHomeworks.setOnClickListener {
            val homeworksIntent = Intent(this, HomeworkActivities::class.java)
            startActivity(homeworksIntent)
        }
    }

    private fun lessonActivities() {
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

    private fun createNotificationsChannel(){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val title = "Note Title"
            val note_description = "Note Description"
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(CHANNEL_ID, title, importance). apply {
                description = note_description
            }
            val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }

    private fun sendNotifications() {
        val builder = NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_baseline_coronavirus_24)
            .setContentTitle("Notification")
            .setContentText("Ready")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)

        with(NotificationManagerCompat.from(this)){
            notify(NotificationID, builder.build())
        }
    }

}