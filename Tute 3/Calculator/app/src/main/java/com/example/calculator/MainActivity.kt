package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.calculator.models.Calculator

class MainActivity : AppCompatActivity() {
    private lateinit var edtNumber1: EditText
    private lateinit var edtNumber2:EditText
    private lateinit var plus: Button
    private lateinit var minus: Button
    private lateinit var mul: Button
    private lateinit var div: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtNumber1 = findViewById(R.id.editNumber1)
        edtNumber2 = findViewById(R.id.editNumber2)

        plus = findViewById(R.id.btnPlus)
        minus = findViewById(R.id.btnMinus)
        mul = findViewById(R.id.btnMultiply)
        div = findViewById(R.id.btnDivide)

        plus.setOnClickListener { view->
            buttonClick(view)
        }
        minus.setOnClickListener {  view->
            buttonClick(view)
        }
        mul.setOnClickListener {  view->
            buttonClick(view)
        }
        div.setOnClickListener {  view->
            buttonClick(view)
        }
    }

    private fun buttonClick(v: View) {
        var ans = 0.0
        val calculator = Calculator(
            edtNumber1.text.toString().toDouble(),
            edtNumber2.text.toString().toDouble()
        )
        when (v.id) {
            R.id.btnPlus -> ans = calculator.add()
            R.id.btnMinus -> ans = calculator.sub()
            R.id.btnMultiply -> ans = calculator.mul()
            R.id.btnDivide -> ans = calculator.divide()
        }
        Log.d("ans", ans.toString())

        val intent = Intent(this, DisplayActivity::class.java)
        intent.putExtra("answer", ans)
        startActivity(intent)
        finish()

    }
   


}