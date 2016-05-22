package com.malkomich.kotlinsample.ui.adapters

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView
import com.malkomich.kotlinsample.domain.model.KotlinForecastList

/**
 * Created by malkomich on 21/05/2016.
 */
class KotlinForecastAdapter(val items: KotlinForecastList) :
        RecyclerView.Adapter<KotlinForecastAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent.context))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(items[position]) {
            holder.textView.text = "$date - $description - $high/$low"
        }
    }

    override fun getItemCount(): Int = items.size()

    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
}