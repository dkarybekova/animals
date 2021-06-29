package kg.tutorialapp.animals

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_myviewholder.view.*

class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    fun bind(item: Item){
        itemView.run{
            icon.setImageResource(item.icon)
            text_viewholder.text = item.name
        }
    }

    companion object{
        fun create(parent: ViewGroup): MyViewHolder{
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_myviewholder,parent,false)
            return MyViewHolder(view)
        }
    }
}