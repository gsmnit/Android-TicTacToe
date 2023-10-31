package com.example.myapplication

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        val list = findViewById<ListView>(R.id.list)
        val arrayList: ArrayList<SubjectData> = ArrayList<SubjectData>()
        arrayList.add(
            SubjectData(
                "JAVA",
                "https://www.tutorialspoint.com/java/",
                "https://www.tutorialspoint.com/java/images/java-mini-logo.jpg"
            )
        )
        arrayList.add(
            SubjectData(
                "Python",
                "https://www.tutorialspoint.com/python/",
                "https://www.tutorialspoint.com/python/images/python-mini.jpg"
            )
        )
        arrayList.add(
            SubjectData(
                "Javascript",
                "https://www.tutorialspoint.com/javascript/",
                "https://www.tutorialspoint.com/javascript/images/javascript-mini-logo.jpg"
            )
        )
        arrayList.add(
            SubjectData(
                "Cprogramming",
                "https://www.tutorialspoint.com/cprogramming/",
                "https://www.tutorialspoint.com/cprogramming/images/c-mini-logo.jpg"
            )
        )
        arrayList.add(
            SubjectData(
                "Cplusplus",
                "https://www.tutorialspoint.com/cplusplus/",
                "https://www.tutorialspoint.com/cplusplus/images/cpp-mini-logo.jpg"
            )
        )
        arrayList.add(
            SubjectData(
                "Android",
                "https://www.tutorialspoint.com/android/",
                "https://www.tutorialspoint.com/android/images/android-mini-logo.jpg"
            )
        )
        val customAdapter = CustomAdapter(this, arrayList)
        list.adapter = customAdapter
    }
}