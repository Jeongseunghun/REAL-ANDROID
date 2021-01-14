package com.example.eplintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_sub.*

class CHActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c_h)
        val profileList = arrayListOf(
            Profiles(1, R.drawable.sp, "GK", "케파 아리사발라가"),
            Profiles(2, R.drawable.ge, "DF", "안토니오 뤼디거"),
            Profiles(3, R.drawable.sp, "DF", "마르코스 알론소"),
            Profiles(5, R.drawable.it, "MF", "조르지뉴"),
            Profiles(6, R.drawable.br, "DF", "치아구 시우바"),
            Profiles(7, R.drawable.fr, "MF", "은골로 캉테"),
            Profiles(11, R.drawable.ge, "FW", "티모 베르너"),
            Profiles(18, R.drawable.fr, "FW", "올리비에 지루"),
            Profiles(19, R.drawable.en, "MF", "메이슨 마운트"),
            Profiles(20, R.drawable.en, "FW", "캘럼 허드슨오도이"),
            Profiles(21, R.drawable.en, "DF", "벤 칠웰"),
            Profiles(28, R.drawable.sp, "DF", "세사르 아스필리쿠에타"),
            Profiles(29, R.drawable.ge, "MF", "카이 하베르츠")


        )

        recycler_view.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycler_view.setHasFixedSize(true)

        recycler_view.adapter = ProfileAdapter(profileList)
    }
}