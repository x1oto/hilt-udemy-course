package com.x1oto.hilttutorial

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.x1oto.hilttutorial.database.DatabaseAdapter
import com.x1oto.hilttutorial.database.DatabaseService
import com.x1oto.hilttutorial.hilt.CallInterceptor
import com.x1oto.hilttutorial.hilt.ResponseInterceptor
import com.x1oto.hilttutorial.network.NetworkAdapter
import com.x1oto.hilttutorial.network.NetworkService

import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {


//    @Inject lateinit var databaseAdapter: DatabaseAdapter
//    @Inject lateinit var networkAdapter: NetworkAdapter
    @ResponseInterceptor
    @Inject lateinit var networkService: NetworkService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        Log.d(TAG, "DatabaseAdapter: $databaseAdapter")
//        databaseAdapter.log("Hello Hilt!")
//
//        networkAdapter.log("Interface binding")

        networkService.performNetworkCall()

    }
    @Inject
    fun directToDatabase(databaseService: DatabaseService) {
        databaseService.log("Method injected")
    }
}