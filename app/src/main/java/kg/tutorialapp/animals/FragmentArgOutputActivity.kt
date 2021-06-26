package kg.tutorialapp.animals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class FragmentArgOutputActivity : AppCompatActivity(), FragmentArgListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arg_output)

        setFragment()
    }

    private fun setFragment() {
        val textFromMainActivty:String = (intent?.getStringExtra("Key")?:showToast())

        val fragment = FragmentArg()
        val message = Bundle()
        message.putString("Key2", textFromMainActivty)
        fragment.arguments = message

        supportFragmentManager
            .beginTransaction()
            .add(R.id.container_arg, fragment, FragmentArg.TAG)
            .commit()
    }
    override fun showToast(): String {
        val text = Toast.makeText(this, "Edit Text is empty", Toast.LENGTH_LONG).show()
        return text.toString()
    }
}