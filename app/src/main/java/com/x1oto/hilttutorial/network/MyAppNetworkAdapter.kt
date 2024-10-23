package com.x1oto.hilttutorial.network

import android.util.Log
import com.x1oto.hilttutorial.TAG
import javax.inject.Inject

class MyAppNetworkAdapter @Inject constructor() : NetworkAdapter {
    override fun log(message: String) {
        Log.d(TAG, "MyNetworkAdapter: $message")
    }
}