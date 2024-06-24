package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding
import java.math.BigInteger


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val numbers = fibonacci(100)
        binding.rvNumbers.layoutManager = LinearLayoutManager(this)

        val numberAdapter = NumbersRecyclerViewAdapter(numbers)
        binding.rvNumbers.adapter = numberAdapter


    }

    fun fibonacci(n: Int): MutableList<BigInteger> {
        val numbers = mutableListOf(BigInteger.ZERO, BigInteger.ONE)
        while (numbers.size < n) {
            numbers.add(numbers[numbers.lastIndex] + numbers[numbers.lastIndex - 1])
        }
        return numbers
    }
}