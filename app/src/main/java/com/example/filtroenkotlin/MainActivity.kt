package com.example.filtroenkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonOne.setOnClickListener { texto1.text=numbersList.toString() }
        button2.setOnClickListener { texto1.text= instanceList.toString() }
        buttonTree.setOnClickListener { texto1.text=numbersMap.toString() }
    }

    private val numbersList = listOf("one", "five", "two", "three", "four")
    private val instanceList = listOf(null, 1, "two", 3.0, "four")
    private val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
   // private val unsortedList = listOf(7, 8, 5, 3, 2, 4)

    fun filterNumberList(mnumberList : List<String>) {
    mnumberList.filter { it.startsWith("t") }
    return
    }
}

