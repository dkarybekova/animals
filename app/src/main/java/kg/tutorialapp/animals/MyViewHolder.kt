package kg.tutorialapp.animals

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.item_myviewholder.view.*

class MyViewHolder(itemView: View): BaseViewHolder<Any>(itemView) {
    override fun bind(item: Any){
        item as Item
        itemView.run{
            icon_image.setImageResource(item.icon)
            text_viewholder.text = item.name
        }
    }

    companion object{
        fun create(parent: ViewGroup, listener: MyAdapter.OnClickListener): BaseViewHolder<Any>{
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_myviewholder,parent,false)
            val holder =  MyViewHolder(view)

            holder.itemView.setOnClickListener {
                listener.onItemClick(holder.adapterPosition)
            }

            holder.itemView.btn_holder.setOnClickListener {
                listener.onButtonClick(holder.adapterPosition)
            }

            return holder
        }
    }
}