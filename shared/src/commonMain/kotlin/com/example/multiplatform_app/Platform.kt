package com.example.multiplatform_app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform