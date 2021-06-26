package kg.tutorialapp.animals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityFragment2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment2)

        setUp()
    }

    private fun setUp() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.container_2, Fragment2())
            .commit()
    }
}