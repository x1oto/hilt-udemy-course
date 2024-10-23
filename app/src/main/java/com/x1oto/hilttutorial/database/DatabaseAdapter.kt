package com.x1oto.hilttutorial.database

import android.content.Context
import android.os.Message
import android.util.Log
import com.x1oto.hilttutorial.TAG
import dagger.hilt.android.qualifiers.ActivityContext
import javax.inject.Inject

class DatabaseAdapter @Inject constructor(@ActivityContext private val context: Context, var databaseService: DatabaseService) {
    fun log(message: String) {
        Log.d(TAG, "Database Adapter: $message")
        databaseService.log(message)
        Log.d(TAG, "Context available: $context")
    }
}