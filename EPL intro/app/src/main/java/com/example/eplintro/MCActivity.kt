package com.example.eplintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_sub.*

class MCActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_m_c)
        val profileList = arrayListOf(
            Profiles(2, R.drawable.en, "DF", "카일 워커"),
            Profiles(3, R.drawable.po, "DF", "후벵 디아스"),
            Profiles(7, R.drawable.en, "FW", "라힘 스털링"),
            Profiles(8, R.drawable.ge, "MF", "일카이 귄도안"),
            Profiles(9, R.drawable.br, "FW", "가브리에우 제주스"),
            Profiles(10, R.drawable.ar, "FW", "세르히오 아궤로"),
            Profiles(11, R.drawable.wuk, "DF", "올렉산드르 진첸코"),
            Profiles(14, R.drawable.fr, "DF", "에므리크 라포르트"),
            Profiles(17, R.drawable.be, "MF", "케빈 데브라위너"),
            Profiles(22, R.drawable.fr, "DF", "뱅자맹 멘디"),
            Profiles(25, R.drawable.br, "MF", "페르난지뉴"),
            Profiles(31, R.drawable.br, "GK", "에데르송 모아레스"),
            Profiles(47, R.drawable.en, "MF", "필 포든"),
            Profiles(50, R.drawable.sp, "DF", "에리크 가르시아"),



        )

        recycler_view.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycler_view.setHasFixedSize(true)

        recycler_view.adapter = ProfileAdapter(profileList)
    }
}