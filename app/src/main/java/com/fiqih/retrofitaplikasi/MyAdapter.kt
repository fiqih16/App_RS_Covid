package com.fiqih.retrofitaplikasi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*

class MyAdapter (val context: Context,var dataList: ArrayList<CEOModel>?): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val linlay = view.Linlay
        val tvId = view.tvId
        val tvNama = view.Tv_Nama
        val tvAddress = view.Tv_address
        val tvRegion = view.Tv_Region
        val tvPhone = view.Tv_Phone
        val tvProvinsi = view.Tv_Provinsi
    }

    // method untuk membuat view holder
    // inflate = memunculkan data
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_row, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return dataList!!.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = dataList?.get(position)

        holder.tvId.text = (position + 1).toString()
        holder.tvNama.text = item?.name.toString()
        holder.tvAddress.text = item?.address.toString()
        holder.tvRegion.text = item?.region.toString()
        holder.tvPhone.text = item?.phone.toString()
        holder.tvProvinsi.text = item?.province.toString()

        if (position % 2 == 0) {
            holder.linlay.setBackgroundColor(ContextCompat.getColor(context, R.color.ijo))
        } else {
            holder.linlay.setBackgroundColor(ContextCompat.getColor(context, R.color.Abuabu))
        }


    }

}