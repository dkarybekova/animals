package kg.tutorialapp.animals

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeworkActivities : AppCompatActivity() {

    lateinit var textview: TextView
    lateinit var btnCalc: Button
    lateinit var btnAnimal: Button
    lateinit var btnChronometer: Button
    lateinit var btnColor: Button
    lateinit var btnCalculator: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homeworks)

        var actionBar = supportActionBar
        actionBar!!.title = "Main"
        actionBar.setDisplayHomeAsUpEnabled(true)

        textview = findViewById(R.id.textMain) as TextView
        textview.text = getString((R.string.homeworks))

        btnAnimal = findViewById(R.id.btn_animals)
        btnAnimal.setOnClickListener {
            val animalIntent = Intent(this, AnimalActivity::class.java)
            startActivity(animalIntent)
        }
        btnCalc = findViewById(R.id.btn_calc)
        btnCalc.setOnClickListener {
            val calcIntent = Intent(this, CalcActivity::class.java)
            startActivity(calcIntent)
        }
        btnChronometer = findViewById(R.id.btn_chrono)
        btnChronometer.setOnClickListener{
            val chronometerIntent = Intent(this, ChronometerActivity::class.java)
            startActivity(chronometerIntent)
        }
        btnColor = findViewById(R.id.btn_color)
        btnColor.setOnClickListener{
            val ColorIntent = Intent(this, ColorActivity::class.java)
            startActivity(ColorIntent)
        }
        btnCalculator = findViewById(R.id.btn_calculator)
        btnCalculator.setOnClickListener{
            val CalculatorIntent = Intent(this, CalculatorActivity::class.java)
            startActivity(CalculatorIntent)
        }
    }
}