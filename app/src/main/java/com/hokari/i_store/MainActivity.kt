package com.hokari.i_store

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.getAllProduct()


        viewModel.allProductResponse.observe(this) { response ->

            Log.d("TAG", "onCreate: ${response.products} ")


        }


    }
}