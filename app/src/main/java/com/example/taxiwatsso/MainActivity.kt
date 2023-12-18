package com.example.taxiwatsso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.taxiwatsso.databinding.ActivityHomeBinding
import com.example.taxiwatsso.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {
    // 뷰 바인딩
    private var mBinding: ActivityMainBinding? = null
    private val binding get() = mBinding!!

    // 택시 리스트
    val TaxiList = arrayListOf<Taxi>(
        Taxi("11:30", "터미널", "캠퍼스", "1/4", R.drawable.state_open),
        Taxi("14:00", "터미널", "캠퍼스", "2/4", R.drawable.state_open),
        Taxi("19:00", "터미널", "캠퍼스", "1/4", R.drawable.state_open)
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 뷰바인딩
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 리스트뷰
        val Adapter = TaxiAdapter(this, TaxiList)
        binding.listView.adapter = Adapter

        // 새로고침 시


        // 클릭 시
        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "화면이 전환되었습니다.", Toast.LENGTH_SHORT).show()
        }

        //initList()
    }
//    private fun initList() {
//        val call = RetrofitBuilder.api.getData()
//        call.enqueue(object: Callback<List<Taxi>> {
//            override fun onResponse(call: Call<List<Taxi>>, response: Response<List<Taxi>>) {
//                Toast.makeText(applicationContext, "Call Success", Toast.LENGTH_SHORT).show()
//                if(response.isSuccessful) {
//                    coinList = response.body() ?: listOf()
//                    listAdapter.setList(coinList)
//                }
//            }
//
//            override fun onFailure(call: Call<List<Taxi>>, t: Throwable) {
//                Toast.makeText(applicationContext, "Call Failed", Toast.LENGTH_SHORT).show()
//            }
//        })
//    }
}