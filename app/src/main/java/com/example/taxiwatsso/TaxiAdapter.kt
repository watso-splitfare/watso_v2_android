package com.example.taxiwatsso

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class TaxiAdapter (val context: Context, val Taxilist: ArrayList<Taxi>) : BaseAdapter() {
    override fun getCount(): Int {
        return Taxilist.size
    }

    override fun getItem(position: Int): Any {
        return Taxilist[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.list_taxi, null)

        val time = view.findViewById<TextView>(R.id.tv_time)
        val dep = view.findViewById<TextView>(R.id.tv_dep)
        val arv = view.findViewById<TextView>(R.id.tv_arv)
        val count = view.findViewById<TextView>(R.id.tv_count)
        val state = view.findViewById<ImageView>(R.id.iv_state)

        val taxi = Taxilist[position]

        time.text = taxi.time
        dep.text = taxi.dep
        arv.text = taxi.arv
        count.text = taxi.count
        state.setImageResource(taxi.state)

        return view
    }
}