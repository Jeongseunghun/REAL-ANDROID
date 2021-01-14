package com.example.eplintro

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ProfileAdapter(val profileList: ArrayList<Profiles>) : RecyclerView.Adapter<ProfileAdapter.CustonViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileAdapter.CustonViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.mu_player,parent,false)
        return CustonViewHolder(view).apply {
            itemView.setOnClickListener{
                val curPos : Int = adapterPosition
                val profile: Profiles = profileList.get(curPos)
                Toast.makeText(parent.context, "등번호 : ${profile.num} \n포지션 : ${profile.pos} \n이름 : ${profile.name}",Toast.LENGTH_SHORT).show()
            }

        }
    }

    override fun onBindViewHolder(holder: ProfileAdapter.CustonViewHolder, position: Int) {
        holder.num.text = profileList.get(position).num.toString()
        holder.country.setImageResource(profileList.get(position).country)
        holder.pos.text = profileList.get(position).pos
        holder.name.text = profileList.get(position).name
    }

    override fun getItemCount(): Int {
        return profileList.size
    }

    class CustonViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {
        val num = itemView.findViewById<TextView>(R.id.num_txt)
        val country = itemView.findViewById<ImageView>(R.id.country_image)
        val pos = itemView.findViewById<TextView>(R.id.position_txt)
        val name = itemView.findViewById<TextView>(R.id.name_txt)

    }
}