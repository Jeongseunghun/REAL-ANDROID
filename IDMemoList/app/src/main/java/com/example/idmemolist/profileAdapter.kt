package com.example.idmemolist

import android.renderscript.ScriptGroup
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class profileAdapter(val profileList: ArrayList<Profiles>) : RecyclerView.Adapter<profileAdapter.CustomViewHolder>()
{


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): profileAdapter.CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recylcerview_id_add,parent,false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: profileAdapter.CustomViewHolder, position: Int) {
        holder.site.text= profileList.get(position).site
        holder.ID.text= profileList.get(position).ID
        holder.PW.text=profileList.get(position).PW
    }

    override fun getItemCount(): Int {
        return profileList.size
    }


    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val site = itemView.findViewById<TextView>(R.id.urlname)
        val ID = itemView.findViewById<TextView>(R.id.useriddata)
        val PW = itemView.findViewById<TextView>(R.id.userpwdata)
    }
}