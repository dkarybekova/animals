package kg.tutorialapp.animals

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SharedPreferences : AppCompatActivity() {

    private lateinit var settings: SharedPreferences
    private lateinit var editPref: EditText
    private lateinit var textPref: TextView
    private lateinit var btnSave: Button
    private lateinit var btnDelete: Button

    companion object{
        const val APP_PREFERENCES = "mySettings"
        const val APP_PREFERENCES_TEXT = "Text"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.preferences)

        settings = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE)
        editPref = findViewById(R.id.edit_pref)
        textPref = findViewById(R.id.text_pref)
        btnSave = findViewById(R.id.btn_save)
        btnDelete = findViewById(R.id.btn_delete)

        if (settings.contains(APP_PREFERENCES_TEXT)) {
            textPref.setText(settings.getString(APP_PREFERENCES_TEXT, ""))
        }

        setup()
    }

    private fun setup() {
        btnSave.setOnClickListener {
            val text = editPref.text.toString()
            val editor: SharedPreferences.Editor = settings.edit()
            editor.putString(APP_PREFERENCES_TEXT, text)
            editor.apply()
            textPref.setText(settings.getString(APP_PREFERENCES_TEXT, ""))
        }

        btnDelete.setOnClickListener {
            val editor: SharedPreferences.Editor = settings.edit()
            editor.remove(APP_PREFERENCES_TEXT)
            editor.clear()
            editor.apply()
        }
    }
}