package apps.softtek.com.turisteando.recycler

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import apps.softtek.com.turisteando.R
import apps.softtek.com.turisteando.models.Destination

/*
class PlaceAdapter (var context: Context,
                          var places: List<Place>) : RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.place_item, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(places[position])
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return places.size
    }

    //the class is hodling the list view
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(destination: Destination) {

        }

    }
}
*/