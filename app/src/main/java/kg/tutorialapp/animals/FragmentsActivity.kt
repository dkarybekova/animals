package kg.tutorialapp.animals

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class FragmentsActivity : AppCompatActivity() {
    lateinit var btnFragment1: Button
    lateinit var btnFragment2: Button
    lateinit var btnFragment3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragments)

        openActivityFragment1()
        openActivityFragment2()
        openActivityFragment3()
    }

    private fun openActivityFragment1() {
        btnFragment1 = findViewById(R.id.btn_fragment1)
        btnFragment1.setOnClickListener{
            val Fragment1Intent = Intent(this, ActivityFragment1::class.java)
            startActivity(Fragment1Intent)
        }
    }
    private fun openActivityFragment2() {
        btnFragment2 = findViewById(R.id.btn_fragment2)
        btnFragment2.setOnClickListener{
            val Fragment2Intent = Intent(this, ActivityFragment2::class.java)
            startActivity(Fragment2Intent)
        }
    }
    private fun openActivityFragment3() {
        btnFragment3 = findViewById(R.id.btn_fragment3)
        btnFragment3.setOnClickListener{
            val Fragment3Intent = Intent(this, ActivityFragment3::class.java)
            startActivity(Fragment3Intent)
        }
    }
}