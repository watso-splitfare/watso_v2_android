package com.example.taxiwatsso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.taxiwatsso.databinding.ActivityHomeBinding
import com.example.taxiwatsso.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var mBinding: ActivityMainBinding? = null
    // 매번 null 체크를 할 필요 없이 편의성을 위해 바인딩 변수 재 선언
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMainBinding.inflate(layoutInflater)

        // getRoot 메서드로 레이아웃 내부의 최상위 위치 뷰의
        // 인스턴스를 활용하여 생성된 뷰를 액티비티에 표시 합니다.
        setContentView(binding.root)



        //리스트뷰
        val item = arrayOf("테스트", "시험", "확인중")
        binding.listview


    }
}