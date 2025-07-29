package com.mealmind

import android.app.Application
import com.mealmind.di.initKoin

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin(this)
    }

}