package com.example.eplintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val profileList = arrayListOf(
            Profiles(1, R.drawable.sp, "GK", "다비드 데헤아"),
            Profiles(2, R.drawable.sw, "DF", "빅토르 린델뢰프"),
            Profiles(3, R.drawable.kot, "DF", "에리크 바이"),
            Profiles(4, R.drawable.en, "DF", "필 존스"),
            Profiles(5, R.drawable.en, "DF", "해리 메과이어"),
            Profiles(6, R.drawable.fr, "MF", "폴 포그바"),
            Profiles(7, R.drawable.wu, "FW", "에딘손 카바니"),
            Profiles(8, R.drawable.sp, "MF", "후안 마타"),
            Profiles(9, R.drawable.fr, "FW", "앙토니 마르시알"),
            Profiles(10, R.drawable.en, "FW", "마커스 레시포드"),
            Profiles(11, R.drawable.en, "FW", "메이슨 그린우드"),
            Profiles(14, R.drawable.en, "MF", "제시 린가드"),
            Profiles(18, R.drawable.po, "MF", "브루노 페르난데스"),
            Profiles(21, R.drawable.we, "MF", "대니얼 제임스"),
            Profiles(23, R.drawable.en, "DF", "루크 쇼"),
            Profiles(24, R.drawable.ne, "DF", "티모시 포수멘사"),
            Profiles(25, R.drawable.na, "FW", "오디온 이갈로"),
            Profiles(29, R.drawable.en, "DF", "아론 완비사카"),
            Profiles(33, R.drawable.en, "FW", "브랜든 윌리엄스"),
            Profiles(34, R.drawable.ne, "FW", "도니 판더베이크"),
            Profiles(38, R.drawable.en, "FW", "악셀 튀앙제브"),
            Profiles(39, R.drawable.sk, "FW", "스콧 맥토미니")


        )

        recycler_view.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycler_view.setHasFixedSize(true)

        recycler_view.adapter = ProfileAdapter(profileList)
    }
}