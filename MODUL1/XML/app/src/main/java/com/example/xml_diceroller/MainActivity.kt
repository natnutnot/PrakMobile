package com.example.xml_diceroller

import android.os.Bundle
import android.widget.Toast.LENGTH_LONG
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.xml_diceroller.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            NgerollDadu()
        }
    }
    fun NgerollDadu() {
        val dadu = dadu(6)
        val sisi = dadu.NgerollDadu()
        val sisi2 = dadu.NgerollDadu()
        val NgerollDadu1 = when (sisi) {
            1 -> R.drawable.dadu1
            2 -> R.drawable.dadu2
            3 -> R.drawable.dadu3
            4 -> R.drawable.dadu4
            5 -> R.drawable.dadu5
            else -> R.drawable.dadu6
        }
        val NgerollDadu2 = when (sisi2) {
            1 -> R.drawable.dadu1
            2 -> R.drawable.dadu2
            3 -> R.drawable.dadu3
            4 -> R.drawable.dadu4
            5 -> R.drawable.dadu5
            else -> R.drawable.dadu6
        }

        binding.sisi.setImageResource(NgerollDadu1)
        binding.sisi2.setImageResource(NgerollDadu2)

        val pesan = if (sisi == sisi2) {
            "Selamat, anda mendapatkan dadu double"
        } else {
            "Anda belum beruntung"
        }
        Snackbar.make(binding.button, pesan, LENGTH_LONG).show()
    }
}

class dadu(private val numSisi : Int)
{
    fun NgerollDadu() : Int
    {
        return(1..numSisi).random()
    }
}