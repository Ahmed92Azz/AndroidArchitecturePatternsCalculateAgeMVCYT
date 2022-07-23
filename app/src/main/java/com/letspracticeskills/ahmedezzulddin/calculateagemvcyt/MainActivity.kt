package com.letspracticeskills.ahmedezzulddin.calculateagemvcyt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.letspracticeskills.ahmedezzulddin.calculateagemvcyt.model.Person
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var textViewAge: TextView
    lateinit var editTextName: EditText
    lateinit var editTextAge: EditText
    lateinit var buttonCalculateAge: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewAge = findViewById(R.id.textView_your_age)
        editTextAge = findViewById(R.id.editText_age)
        editTextName = findViewById(R.id.editText_name)
        buttonCalculateAge = findViewById(R.id.button_calculate_age)

        buttonCalculateAge.setOnClickListener {
            getInfo()
        }

    }

    private fun getInfo() {
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val yourAge = currentYear - editTextAge.text.trim().toString().toInt()
        val name = editTextName.text.trim().toString()
        val person = Person(name, yourAge)

        textViewAge.text = "${person.name} your age: ${person.age}"
    }
}