package com.example.taxiwatsso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.taxiwatsso.databinding.ActivityHomeBinding
import com.example.taxiwatsso.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var mBinding: ActivityMainBinding? = null
    // 매번 null 체크를 할 필요 없이 편의성을 위해 바인딩 변수 재 선언
    private val binding get() = mBinding!!

    //택시 리스트
    val TaxiList = arrayListOf<Taxi>(
        Taxi("11:30", "터미널", "캠퍼스", "1/4", R.drawable.state_open),
        Taxi("14:00", "터미널", "캠퍼스", "2/4", R.drawable.state_open),
        Taxi("19:00", "터미널", "캠퍼스", "1/4", R.drawable.state_open)
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMainBinding.inflate(layoutInflater)

        // getRoot 메서드로 레이아웃 내부의 최상위 위치 뷰의
        // 인스턴스를 활용하여 생성된 뷰를 액티비티에 표시 합니다.
        setContentView(binding.root)



        //리스트뷰
        val Adapter = TaxiAdapter(this, TaxiList)
        binding.listView.adapter = Adapter
        //클릭
        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "화면이 전환되었습니다.", Toast.LENGTH_SHORT).show()
        }



    }
}