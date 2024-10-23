package com.x1oto.hilttutorial.network

import android.util.Log
import com.x1oto.hilttutorial.TAG
import javax.inject.Inject

class ResponseInterceptorImpl @Inject constructor(): Interceptor {
    override fun log(message: String) {
        Log.d(TAG, "This is a response interceptor: $message")
    }
}