package com.example.eplintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_sub.*

class LPActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_l_p)

        val profileList = arrayListOf(
            Profiles(1, R.drawable.br, "GK", "알리송 베케르"),
            Profiles(3, R.drawable.br, "MF", "파비뉴"),
            Profiles(4, R.drawable.ne, "DF", "버질 판데이크"),
            Profiles(5, R.drawable.ne, "MF", "조르지니오 바이날둠"),
            Profiles(6, R.drawable.sp, "MF", "티아고 알칸타라"),
            Profiles(7, R.drawable.en, "MF", "제임스 밀너"),
            Profiles(9, R.drawable.br, "FW", "호베르투 피르미누"),
            Profiles(11, R.drawable.iz, "FW", "모하메드 살라"),
            Profiles(14, R.drawable.en, "MW", "조던 헨더슨"),
            Profiles(15, R.drawable.en, "MF", "알렉스 옥슬레이드체임벌린"),
            Profiles(17,R.drawable.en,"MF","커티스 존스"),
            Profiles(20, R.drawable.po, "FF", "디아고 조타"),
            Profiles(66, R.drawable.en, "DF", "트렌트 알렉산더아놀드")

        )

        recycler_view.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycler_view.setHasFixedSize(true)

        recycler_view.adapter = ProfileAdapter(profileList)
    }
}