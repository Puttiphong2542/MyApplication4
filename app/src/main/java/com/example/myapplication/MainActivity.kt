package com.example.gpa_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            var ko1 = editTextNumberDecimal.text.toString()
            var ko2 = editTextNumberDecimal2.text.toString()
            var ko3 = editTextNumberDecimal3.text.toString()
            var ko4 = editTextNumberDecimal4.text.toString()
            var ko5 = editTextNumberDecimal5.text.toString()
            var kc1 = editTextNumber.text.toString()
            var kc2 = editTextNumber2.text.toString()
            var kc3 = editTextNumber3.text.toString()
            var kc4 = editTextNumber4.text.toString()
            var kc5 = editTextNumber5.text.toString()

            if (kc1.isEmpty() || kc2.isEmpty() || kc3.isEmpty() || kc4.isEmpty() || kc5.isEmpty())
                return@setOnClickListener Toast.makeText(this@MainActivity, "Please Input All Text Box Before Press OK !!!", Toast.LENGTH_SHORT).show()

            if (ko1.isEmpty() || ko2.isEmpty() || ko3.isEmpty() || ko4.isEmpty() || ko5.isEmpty())
                return@setOnClickListener Toast.makeText(this@MainActivity, "Please Input All Text Box Before Press OK !!!", Toast.LENGTH_SHORT).show()

            if (tab1.text.isEmpty() || tab2.text.isEmpty() || tab3.text.isEmpty() || tab4.text.isEmpty() || tab5.text.isEmpty())
                return@setOnClickListener Toast.makeText(this@MainActivity, "Please Input All Text Box Before Press OK !!!", Toast.LENGTH_SHORT).show()

            var total = kc1.toInt() + kc2.toInt() + kc3.toInt() + kc4.toInt() + kc5.toInt()
            textView13.text = total.toString()

            var sum = 0.0
            sum += (kc1.toDouble() * ko1.toDouble())
            sum += (kc2.toDouble() * ko2.toDouble())
            sum += (kc3.toDouble() * ko3.toDouble())
            sum += (kc4.toDouble() * ko4.toDouble())
            sum += (kc5.toDouble() * ko5.toDouble())
            textView14.text = String.format("%.2f", sum / total)
        }
        button2.setOnClickListener {
            editTextNumber.text.clear()
            editTextNumber2.text.clear()
            editTextNumber3.text.clear()
            editTextNumber4.text.clear()
            editTextNumber5.text.clear()
            editTextNumberDecimal.text.clear()
            editTextNumberDecimal2.text.clear()
            editTextNumberDecimal3.text.clear()
            editTextNumberDecimal4.text.clear()
            editTextNumberDecimal5.text.clear()
            tab1.text.clear()
            tab2.text.clear()
            tab3.text.clear()
            tab4.text.clear()
            tab5.text.clear()
            textView13.text = ""
            textView14.text = ""
        }
    }

}