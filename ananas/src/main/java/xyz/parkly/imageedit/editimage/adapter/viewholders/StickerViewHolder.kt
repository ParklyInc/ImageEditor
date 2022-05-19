package xyz.parkly.imageedit.editimage.adapter.viewholders

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import parkly.github.io.ananas.R

class StickerViewHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
    @JvmField
    var image: ImageView = itemView.findViewById(R.id.img)
}