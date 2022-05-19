package xyz.parkly.imageedit.editimage.adapter.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import parkly.github.io.ananas.R

class ColorViewHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
    @JvmField var colorPanelView: View = itemView.findViewById(R.id.color_panel_view)
}