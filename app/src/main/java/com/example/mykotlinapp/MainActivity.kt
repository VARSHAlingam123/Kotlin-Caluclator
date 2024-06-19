package com.example.mykotlinapp

// change 1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView



class MainActivity : AppCompatActivity(), View.OnClickListener{
    lateinit var btnadd :Button
    lateinit var btnsub :Button
    lateinit var btndiv :Button
    lateinit var btnmul :Button
    lateinit var etA :EditText
    lateinit var etB :EditText
    lateinit var resultTv:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnadd = findViewById(R.id.btn_add)
        btnsub = findViewById(R.id.btn_sub)
        btndiv = findViewById(R.id.btn_div)
        btnmul = findViewById(R.id.btn_mul)
        etA=findViewById(R.id.et_a)
        etB=findViewById(R.id.et_b)
        resultTv=findViewById(R.id.result_Tv)

        btnadd.setOnClickListener(this)
        btnsub.setOnClickListener(this)
        btnmul.setOnClickListener(this)
        btndiv.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        var a=etA.text.toString().toDouble()
        var b=etB.text.toString().toDouble()
        var result=0.0
        when(v?.id){
            R.id.btn_add->{result = a+b}
            R.id.btn_sub->{result=a-b}
            R.id.btn_mul->{result=a*b}
            R.id.btn_div->{result= a/b}

        }
        resultTv.text= "Result is $result "
    }
}