package com.example.eplintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_sub.*

class TOTActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_t_o_t)
        val profileList = arrayListOf(
            Profiles(1, R.drawable.fr, "GK", "위고 요리스"),
            Profiles(3, R.drawable.sp, "DF", "세르히오 레길론"),
            Profiles(4, R.drawable.be, "DF", "토비 알데르베이럴트"),
            Profiles(7, R.drawable.ko, "FW", "손흥민"),
            Profiles(8, R.drawable.en, "MF", "해리 윙크스"),
            Profiles(9, R.drawable.we, "FW", "가레스 베일"),
            Profiles(10, R.drawable.en, "FW", "해리 케인"),
            Profiles(11, R.drawable.ar, "MF", "에릭 라멜라"),
            Profiles(12, R.drawable.en, "GK", "조 하트"),
            Profiles(15, R.drawable.en, "DF", "에릭 다이어"),
            Profiles(17, R.drawable.fr, "MF", "무사 시소코"),
            Profiles(18, R.drawable.ar, "MF", "지오바니 로셀소"),
            Profiles(20, R.drawable.en, "MF", "델리 알리"),
            Profiles(23, R.drawable.ne, "FW", "스티븐 베르흐베인"),
            Profiles(24, R.drawable.kot, "DF", "세르주 오리에"),
            Profiles(25, R.drawable.en, "DF", "자펫 탕강가"),
            Profiles(27, R.drawable.br, "MF", "루카스 모우라"),
            Profiles(28, R.drawable.fr, "MF", "탕기 은돔벨레"),
            Profiles(33, R.drawable.we, "DF", "벤 데이비스")


        )

        recycler_view.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycler_view.setHasFixedSize(true)

        recycler_view.adapter = ProfileAdapter(profileList)
    }
}