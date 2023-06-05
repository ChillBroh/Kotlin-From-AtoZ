package com.example.kotlin_room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.kotlin_room.database.AppDatabase
import com.example.kotlin_room.database.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var first : EditText
    private lateinit var last :EditText
    private lateinit var id :EditText
    private lateinit var search : EditText
    private lateinit var btnAdd : Button
    private lateinit var btnRead : Button
    private lateinit var btnDel : Button
    private lateinit var db : AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        first = findViewById(R.id.fname)
        last = findViewById(R.id.lname)
        search = findViewById(R.id.searchTxt)
        btnAdd = findViewById(R.id.btnAdd)
        btnRead = findViewById(R.id.readbtn)
        btnDel = findViewById(R.id.delbtn)

        btnAdd.setOnClickListener {
            addData()
        }

        btnDel.setOnClickListener {

        }

        btnRead.setOnClickListener {
            readData()
        }
    }

    private fun addData(){

        val firstName = first.text.toString()
        val lastName = last.text.toString()
        if(firstName.isNotEmpty() && lastName.isNotEmpty()){
            val user = User(
                null,firstName, lastName
            )
            GlobalScope.launch(Dispatchers.IO){
                db.userDao().insertAll(user)
            }

            first.text.clear()
            last.text.clear()

            Toast.makeText(this@MainActivity, "Successfully inserted", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this@MainActivity,"Error in data inserting", Toast.LENGTH_SHORT).show()
        }

     
    }
    private fun readData(){

    }
}