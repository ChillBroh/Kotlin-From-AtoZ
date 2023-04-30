package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.calculator.models.Calculator

class MainActivity : AppCompatActivity() {
    lateinit var edtNumber1: EditText
    lateinit var edtNumber2:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var edtNumber1:EditText
        lateinit var edtNumber2:EditText
    }

    fun buttonClick(v: View) {
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
        println(ans)

    }
}