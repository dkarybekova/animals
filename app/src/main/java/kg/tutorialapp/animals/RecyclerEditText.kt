package kg.tutorialapp.animals

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerEditText : AppCompatActivity() {

    lateinit var dataText: EditText
    lateinit var btn_submit: Button
    lateinit var recyclerView: RecyclerView
    lateinit var myAdapter: MyAdapter2

    var myList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycler_edittext)

        dataText = findViewById(R.id.recycler_edit)
        btn_submit = findViewById(R.id.btn_recycler)
        recyclerView = findViewById(R.id.recyclerView)

        myAdapter = MyAdapter2(this, myList)

        btn_submit.setOnClickListener {
            if (dataText.text.toString().isEmpty()){
                myList.remove(dataText.text.toString())
            }else {
                myList.add(dataText.text.toString())
                myAdapter.notifyDataSetChanged()
            }
        }
        recyclerView.adapter = myAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}