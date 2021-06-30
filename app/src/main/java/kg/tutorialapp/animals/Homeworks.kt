package kg.tutorialapp.animals

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeworkActivities : AppCompatActivity() {

    lateinit var textview: TextView
    lateinit var btnView: Button
    lateinit var btnCalc: Button
    lateinit var btnAnimal: Button
    lateinit var btnChronometer: Button
    lateinit var btnColor: Button
    lateinit var btnCalculator: Button
    lateinit var btnGestures: Button
    lateinit var btnMovie: Button
    lateinit var btnFragments: Button
    lateinit var btnFragmentArg: Button
    lateinit var btnFragmentsNavDrawer: Button
    lateinit var btnRecyclerEdit: Button

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
    }
    private fun getText(){
        textview = findViewById(R.id.textMain) as TextView
        textview.text = getString((R.string.homeworks))
    }
    private fun simpleViewActivity() {
        btnView = findViewById(R.id.btn_simpleview)
        btnView.setOnClickListener {
            val simpleViewIntent = Intent(this, SimpleViewActivity::class.java)
            startActivity(simpleViewIntent)
        }
    }
    private fun animalsActivity() {
        btnAnimal = findViewById(R.id.btn_animals)
        btnAnimal.setOnClickListener {
            val animalIntent = Intent(this, AnimalActivity::class.java)
            startActivity(animalIntent)
        }
    }
    private fun calcActivity() {
        btnCalc = findViewById(R.id.btn_calc)
        btnCalc.setOnClickListener {
            val calcIntent = Intent(this, CalcActivity::class.java)
            startActivity(calcIntent)
        }
    }
    private fun chronoActivity() {
        btnChronometer = findViewById(R.id.btn_chrono)
        btnChronometer.setOnClickListener {
            val chronometerIntent = Intent(this, ChronometerActivity::class.java)
            startActivity(chronometerIntent)
        }
    }
    private fun colorActivity() {
        btnColor = findViewById(R.id.btn_color)
        btnColor.setOnClickListener {
            val colorIntent = Intent(this, ColorActivity::class.java)
            startActivity(colorIntent)
        }
    }
    private fun calculatorActivity() {
        btnCalculator = findViewById(R.id.btn_calculator)
        btnCalculator.setOnClickListener {
            val calculatorIntent = Intent(this, CalculatorActivity::class.java)
            startActivity(calculatorIntent)
        }
    }
    private fun gesturesActivity() {
        btnGestures = findViewById(R.id.btn_gestures)
        btnGestures.setOnClickListener {
            val gesturesIntent = Intent(this, GesturesActivity::class.java)
            startActivity(gesturesIntent)
        }
    }
    private fun movieActivity() {
        btnMovie = findViewById(R.id.btn_movie)
        btnMovie.setOnClickListener {
            val movieIntent = Intent(this, MoviePosterActivity::class.java)
            startActivity(movieIntent)
        }
    }
    private fun fragmentsActivity() {
        btnFragments = findViewById(R.id.btn_fragments)
        btnFragments.setOnClickListener {
            val fragmentsIntent = Intent(this, FragmentsActivity::class.java)
            startActivity(fragmentsIntent)
        }
    }
    private fun fragmentArgActivity() {
        btnFragmentArg = findViewById(R.id.btn_fragment_arg)
        btnFragmentArg.setOnClickListener {
            val fragmentArgIntent = Intent(this, FragmentArgInputActivity::class.java)
            startActivity(fragmentArgIntent)
        }
    }
    private fun fragmentsNavDrawerActivity() {
        btnFragmentsNavDrawer = findViewById(R.id.btn_fragments_navdrawer)
        btnFragmentsNavDrawer.setOnClickListener {
            val fragmentsNavdrawerIntent = Intent(this, FragmentsOnNavDrawer::class.java)
            startActivity(fragmentsNavdrawerIntent)
        }
    }
    private fun recyclerEditTextActivity() {
        btnRecyclerEdit = findViewById(R.id.btn_recycler_edit)
        btnRecyclerEdit.setOnClickListener {
            val recyclerEditIntent = Intent(this, RecyclerEditText::class.java)
            startActivity(recyclerEditIntent)
        }
    }
}