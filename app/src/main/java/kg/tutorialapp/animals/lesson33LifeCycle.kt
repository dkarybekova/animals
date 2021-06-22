package kg.tutorialapp.animals

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText

class LifecycleActivity : AppCompatActivity() {

    val TAG = "LIFECYCLE"
    lateinit var btn33_output: Button
    lateinit var enderData: EditText
    lateinit var submitData: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lesson33)
        setupView()
        Log.d(TAG, "LifecycleActivity onCreate()")


    }
    private fun setupView(){
        enderData = findViewById(R.id.enter_data)
        submitData = findViewById(R.id.btn33_output)
        submitData.setOnClickListener {
            val text = enderData.text.toString()
            val lesson33OutputIntent = Intent( this,ActivityOutput::class.java)
            lesson33OutputIntent.putExtra ("String",text)
            startActivity(lesson33OutputIntent)
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "LifecycleActivity onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "LifecycleActivity onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "LifecycleActivity onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "LifecycleActivity onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "LifecycleActivity onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "LifecycleActivity onDestroy()")
    }
}

