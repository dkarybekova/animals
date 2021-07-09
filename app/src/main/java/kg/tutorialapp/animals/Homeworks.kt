package kg.tutorialapp.animals

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.homeworks.*

class HomeworkActivities : AppCompatActivity() {

    lateinit var textview: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homeworks)

        val actionBar = supportActionBar
        actionBar!!.title = "Main"
        actionBar.setDisplayHomeAsUpEnabled(true)

        getText()
        simpleViewActivity()
        animalsActivity()
        calcActivity()
        colorActivity()
        calculatorActivity()
        chronoActivity()
        gesturesActivity()
        movieActivity()
        fragmentArgActivity()
        fragmentsActivity()
        fragmentsNavDrawerActivity()
        recyclerEditTextActivity()
        preferencesActivity()
        receiverActivity()
        serviceActivity()
    }
    private fun getText(){
        textview = findViewById(R.id.textMain) as TextView
        textview.text = getString((R.string.homeworks))
    }
    private fun simpleViewActivity() {
        btn_simpleview.setOnClickListener {
            val simpleViewIntent = Intent(this, SimpleViewActivity::class.java)
            startActivity(simpleViewIntent)
        }
    }
    private fun animalsActivity() {
        btn_animals.setOnClickListener {
            val animalIntent = Intent(this, AnimalActivity::class.java)
            startActivity(animalIntent)
        }
    }
    private fun calcActivity() {
        btn_calc.setOnClickListener {
            val calcIntent = Intent(this, CalcActivity::class.java)
            startActivity(calcIntent)
        }
    }
    private fun chronoActivity() {
        btn_chrono.setOnClickListener {
            val chronometerIntent = Intent(this, ChronometerActivity::class.java)
            startActivity(chronometerIntent)
        }
    }
    private fun colorActivity() {
        btn_color.setOnClickListener {
            val colorIntent = Intent(this, ColorActivity::class.java)
            startActivity(colorIntent)
        }
    }
    private fun calculatorActivity() {
        btn_calculator.setOnClickListener {
            val calculatorIntent = Intent(this, CalculatorActivity::class.java)
            startActivity(calculatorIntent)
        }
    }
    private fun gesturesActivity() {
        btn_gestures.setOnClickListener {
            val gesturesIntent = Intent(this, GesturesActivity::class.java)
            startActivity(gesturesIntent)
        }
    }
    private fun movieActivity() {
        btn_movie.setOnClickListener {
            val movieIntent = Intent(this, MoviePosterActivity::class.java)
            startActivity(movieIntent)
        }
    }
    private fun fragmentsActivity() {
        btn_fragments.setOnClickListener {
            val fragmentsIntent = Intent(this, FragmentsActivity::class.java)
            startActivity(fragmentsIntent)
        }
    }
    private fun fragmentArgActivity() {
        btn_fragment_arg.setOnClickListener {
            val fragmentArgIntent = Intent(this, FragmentArgInputActivity::class.java)
            startActivity(fragmentArgIntent)
        }
    }
    private fun fragmentsNavDrawerActivity() {
        btn_fragments_navdrawer.setOnClickListener {
            val fragmentsNavdrawerIntent = Intent(this, FragmentsOnNavDrawer::class.java)
            startActivity(fragmentsNavdrawerIntent)
        }
    }
    private fun recyclerEditTextActivity() {
        btn_recycler_edit.setOnClickListener {
            val recyclerEditIntent = Intent(this, RecyclerEditText::class.java)
            startActivity(recyclerEditIntent)
        }
    }
    private fun preferencesActivity() {
        btn_preferences.setOnClickListener {
            val preferencesIntent = Intent(this, SharedPreferences::class.java)
            startActivity(preferencesIntent)
        }
    }

    private fun receiverActivity (){
        btn_receiver.setOnClickListener {
            val receiverIntent = Intent(this, ReceiverActivity::class.java)
            startActivity(receiverIntent)
        }
    }

    private fun serviceActivity (){
        btn_service.setOnClickListener {
            val serviceIntent = Intent(this, ServiceActivity()::class.java)
            startActivity(serviceIntent)
        }
    }
}