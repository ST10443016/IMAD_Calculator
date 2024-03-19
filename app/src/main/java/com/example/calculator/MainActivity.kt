package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var etNumber1: EditText? = findViewById<EditText>(R.id.etNum1)
    private var etNumber2: EditText? = findViewById<EditText>(R.id.etNum2)
    private var tvDisplay: TextView? = findViewById<TextView>(R.id.tvDisp)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        btnAdd.setOnClickListener{add()}
        val btnSub = findViewById<Button>(R.id.btnSub)
        btnSub.setOnClickListener{sub()}
        val btnMul = findViewById<Button>(R.id.btnMul)
        btnMul.setOnClickListener {mul()}
        val btnDiv = findViewById<Button>(R.id.btnDiv)
        btnDiv.setOnClickListener {div()}
    }
    private fun add(){
        var answer = etNumber1.toString().toInt() + etNumber2.toString().toInt()
        tvDisplay?.setText(answer.toString())
    }
    private fun sub(){
        var answer = etNumber1.toString().toInt() - etNumber2.toString().toInt()
        tvDisplay?.setText(answer.toString())
    }
    private fun mul(){
        var answer = etNumber1.toString().toInt() * etNumber2.toString().toInt()
        tvDisplay?.setText(answer.toString())
    }
    private fun div(){
        var answer = etNumber1.toString().toInt() / etNumber2.toString().toInt()
        tvDisplay?.setText(answer.toString())
    }
}


