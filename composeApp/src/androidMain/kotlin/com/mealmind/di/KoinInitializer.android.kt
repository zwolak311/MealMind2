package com.mealmind.di

import android.content.Context
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

fun initKoin(context: Context) {
    commonKoinInitialization(
        platformSpecificInit = {
            androidLogger()
            androidContext(context)
        }
    )
}