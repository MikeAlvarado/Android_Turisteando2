package apps.softtek.com.turisteando.recycler

import android.content.Context
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import apps.softtek.com.turisteando.R
import apps.softtek.com.turisteando.models.Place
import java.net.URL
import android.graphics.BitmapFactory
import android.widget.ImageView
import kotlinx.android.synthetic.main.place_item.view.*


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
    public class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(place: Place) {
            val placeName = itemView.findViewById<TextView>(R.id.place_name)
            val placeDescription = itemView.findViewById<TextView>(R.id.place_description)
            /*val placePhoto = itemView.findViewById<ImageView>(R.id.place_image)
            val url = URL(place.PlacePhoto)
            val bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream())
            placePhoto.setImageBitmap(bmp)
            */

            placeName.text = place.PlaceName
            placeDescription.text = place.PlaceDescription

        }
    }

}
