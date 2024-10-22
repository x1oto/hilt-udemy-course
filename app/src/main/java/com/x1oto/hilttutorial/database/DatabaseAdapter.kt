package com.x1oto.hilttutorial.database

import android.os.Message
import android.util.Log
import com.x1oto.hilttutorial.TAG
import javax.inject.Inject

class DatabaseAdapter @Inject constructor(var databaseService: DatabaseService) {
    fun log(message: String) {
        Log.d(TAG, "Database Adapter: $message")
        databaseService.log(message)
    }
}