package com.x1oto.hilttutorial.database

import android.os.Message
import android.util.Log
import com.x1oto.hilttutorial.TAG
import dagger.hilt.InstallIn
import javax.inject.Inject

class DatabaseService @Inject constructor() {
    fun log(message: String) {
        Log.d(TAG, "Database Service message: $message")
    }
}