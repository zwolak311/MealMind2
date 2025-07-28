package com.mealmind

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform