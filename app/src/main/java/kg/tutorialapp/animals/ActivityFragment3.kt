package kg.tutorialapp.animals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityFragment3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment3)

        setUp()
    }

    private fun setUp() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.container_3, Fragment3())
            .commit()
    }
}