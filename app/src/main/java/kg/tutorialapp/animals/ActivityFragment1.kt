package kg.tutorialapp.animals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityFragment1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment1)

        setUp()
    }

    private fun setUp() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.container_1, Fragment1())
            .commit()
    }
}


