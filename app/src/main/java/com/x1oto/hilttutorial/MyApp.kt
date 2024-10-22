package com.x1oto.hilttutorial

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

const val TAG = "HiltTutorialLogTag"

@HiltAndroidApp
class MyApp : Application()