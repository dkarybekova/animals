package kg.tutorialapp.animals

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.recycler.*

class RecyclerViewActivity: AppCompatActivity() {
    lateinit var myAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycler)

        var actionBar = supportActionBar
        actionBar!!.title = "Main"
        actionBar.setDisplayHomeAsUpEnabled(true)

        setup()
    }

    private fun setup() {
        myAdapter = MyAdapter()
//        recycler = findViewById(R.id.recyclerView)
        recyclerView.adapter = myAdapter
        myAdapter.setItems(Data.getLongListOfItems())
    }
}