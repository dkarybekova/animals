package kg.tutorialapp.animals

import android.os.Bundle
import android.content.Intent
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class LessonActivities : AppCompatActivity() {

    lateinit var textview: TextView
    lateinit var btn29: Button
    lateinit var btn31: Button
    lateinit var btn33: Button
    lateinit var btn34: Button
    lateinit var btn42: Button
    lateinit var toggle: ActionBarDrawerToggle
    lateinit var drawerLayout: DrawerLayout
    lateinit var navigationView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lessons)

        val actionBar = supportActionBar
        actionBar!!.title = "Main"
        actionBar.setDisplayHomeAsUpEnabled(true)

        getText()
        lesson29()
        lesson31()
        lesson33()
        lesson34()
        lesson41_42()
        navigationDrawer()
    }

    private fun getText(){
        textview = findViewById(R.id.textMain) as TextView
        textview.text = getString((R.string.lessons))
    }

    private fun lesson29() {
        btn29 = findViewById(R.id.btn_29)
        btn29.setOnClickListener {
            val lesson29Intent = Intent(this, RelativeLayoutActivity::class.java)
            startActivity(lesson29Intent)
        }
    }

    private fun lesson31() {
        btn31 = findViewById(R.id.btn_31)
        btn31.setOnClickListener {
            val lesson31Intent = Intent(this, ConstraintLayoutActivity::class.java)
            startActivity(lesson31Intent)
        }
    }

    private fun lesson33() {
        btn33 = findViewById(R.id.btn_33)
        btn33.setOnClickListener {
            val lesson33Intent = Intent(this, LifecycleActivity::class.java)
            startActivity(lesson33Intent)
        }
    }

    private fun lesson34(){
        btn34 = findViewById(R.id.btn_34)
        btn34.setOnClickListener {
            val lesson34Intent = Intent(this, ActivityA::class.java)
            startActivity(lesson34Intent)
        }
    }
    private fun lesson41_42(){
        btn42 = findViewById(R.id.btn_41_42)
        btn42.setOnClickListener {
            val lesson42Intent = Intent(this, RecyclerViewActivity::class.java)
            startActivity(lesson42Intent)
        }
    }

    private fun navigationDrawer(){
        drawerLayout = findViewById(R.id.drawer_layout)
        navigationView = findViewById(R.id.navigation_view)

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.drawer_open, R.string.drawer_close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navigationView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.first_item -> Toast.makeText(applicationContext,
                    "First item", Toast.LENGTH_LONG).show()
                R.id.second_item -> Toast.makeText(applicationContext,
                    "Second item", Toast.LENGTH_LONG).show()
                R.id.third_item -> Toast.makeText(applicationContext,
                    "Third item", Toast.LENGTH_LONG).show()
                R.id.fourth_item -> Toast.makeText(applicationContext,
                    "Fourth item", Toast.LENGTH_LONG).show()
                R.id.fifth_item -> Toast.makeText(applicationContext,
                    "Fifth item", Toast.LENGTH_LONG).show()
            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}