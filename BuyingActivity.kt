package com.example.coinfake

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.coinfake.dataModel.CurrentPriceResult

class BuyingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buying )
        intent = intent
        var coinInfo : CurrentPriceResult = intent.getSerializableExtra("item") as CurrentPriceResult

        findViewById<TextView>(R.id.)
    }
}