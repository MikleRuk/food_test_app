package busket

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ListAdapter
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodtestapp.R

class ListAdapter (private val items : MutableList<ListItem>) : RecyclerView.Adapter<busket.ListAdapter.ViewHolder>(){


    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

        val tvLayoutName: TextView = itemView.findViewById(R.id.tvLayoutName)
        val tvQuality: TextView = itemView.findViewById(R.id.tvQuality)
        val increaseButton: Button = itemView.findViewById(R.id.increaseButton)
        val decreaseButton: Button = itemView.findViewById(R.id.decreaseButton)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout, parent, false)
        return ViewHolder(itemView)
    }



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val listItem = items[position]
        val product = listItem.product

        holder.tvLayoutName.text = product?.name
        holder.tvQuality.text = listItem.quantity.toString()

        holder.increaseButton.setOnClickListener {
            listItem.quantity++
            notifyItemChanged(holder.adapterPosition)
        }

        holder.decreaseButton.setOnClickListener {
            if (listItem.quantity > 0) {
                listItem.quantity--
                notifyItemChanged(holder.adapterPosition)
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}





