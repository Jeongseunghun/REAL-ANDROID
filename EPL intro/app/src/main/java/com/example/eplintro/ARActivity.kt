package com.example.eplintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_sub.*

class ARActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a_r)
        val profileList = arrayListOf(
            Profiles(1, R.drawable.ge, "GK", "베른트 레노"),
            Profiles(2, R.drawable.sp, "DF", "엑토르 베예린"),
            Profiles(4, R.drawable.fr, "DF", "윌리엄 살리바"),
            Profiles(6, R.drawable.br, "DF", "가브리에우 마갈량이스"),
            Profiles(7, R.drawable.en, "FW", "부카요 사카"),
            Profiles(8, R.drawable.sp, "MF", "다니 세바요스"),
            Profiles(9, R.drawable.fr, "FW", "알렉상드르 라카제트"),
            Profiles(10, R.drawable.ge, "MF", "메수트 외질"),
            Profiles(12, R.drawable.br, "FW", "윌리안"),
            Profiles(16, R.drawable.en, "DF", "롭 홀딩"),
            Profiles(23, R.drawable.br, "DF", "다비드 루이스"),
            Profiles(32, R.drawable.en, "MF", "에밀 스미스로우"),
            Profiles(35, R.drawable.br, "FW", "가브리엘 마르티넬리")


        )

        recycler_view.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycler_view.setHasFixedSize(true)

        recycler_view.adapter = ProfileAdapter(profileList)
    }
}