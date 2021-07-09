package kg.tutorialapp.animals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.service.*

class ServiceActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.service)

        btn_startservice.setOnClickListener {
            val intent = Intent(this, SimpleService::class.java)
            startService(intent)
        }
    }
}