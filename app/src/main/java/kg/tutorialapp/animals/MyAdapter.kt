package kg.tutorialapp.animals

import android.util.Log
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kg.tutorialapp.animals.MyAdapter.Type.Ad
import kg.tutorialapp.animals.MyAdapter.Type.ITEM

class MyAdapter(private val listener: FragmentItems): RecyclerView.Adapter<BaseViewHolder<Any>>() {
    private val items = arrayListOf<Any>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Any> {
        Log.i(MyAdapter.tag, "onCretaeViewHolder()")

        return when(viewType){
            ITEM -> MyViewHolder.create(parent, listener)
            else -> AdViewHolder.create(parent, listener)
        }
    }

    override fun onBindViewHolder(holder: BaseViewHolder<Any>, position: Int) {
        Log.i(MyAdapter.tag, "onBindViewHolder()")
        holder.bind(items[position])
    }

    override fun getItemViewType(position: Int): Int {
        return when(items[position]){
            is String -> Ad
            is Item -> ITEM
            else -> -1
        }
    }

    override fun getItemCount() = items.count()

    fun setNewItems(newItems: List<Any>){
        items.clear()
        items.addAll(newItems)
        notifyDataSetChanged()
    }
    object Type{
        const val ITEM = 0
        const val Ad = 1
    }
    companion object{
        const val tag ="ADAPTER"
    }
    interface OnClickListener{
        fun onItemClick(position: Int)
        fun onAdClick(position: Int)
        fun onButtonClick(position: Int)
    }
}