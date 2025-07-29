package com.mealmind.di

import com.mealmind.core.di.platformModule
import org.koin.core.KoinApplication
import org.koin.core.context.startKoin
import org.koin.core.module.Module

val sharedModules: List<Module> = listOf(
    platformModule
)

fun commonKoinInitialization(
    platformSpecificInit: KoinApplication.() -> KoinApplication = { this }
) {
    startKoin {
        platformSpecificInit()
        modules(sharedModules)
    }
}
