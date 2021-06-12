package com.example.fibonnacci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger



class MainActivity : AppCompatActivity() {
    lateinit var rvnumbers:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvnumbers=findViewById(R.id.rvnumbers)
        rvnumbers.layoutManager=LinearLayoutManager(baseContext)
        var numsAdapter=NumbersRecyclerViewsAdapter(fibonacci(100))
        rvnumbers.adapter=numsAdapter
    }
    fun fibonacci(nums:Int):List<BigInteger>{
        var numbers= MutableList<BigInteger>(nums,{BigInteger.ZERO})
        var num1=BigInteger.ZERO
        var num2=BigInteger.ONE

        numbers[0]=num1
        numbers[1]=num2
        for(i in 1..nums){
            var answer=num1+num2
            num1=num2
            num2=answer
            numbers [i -1 ]=num1
        }
        return numbers
    }

}

