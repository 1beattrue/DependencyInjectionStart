package com.example.dependencyinjectionstart.example2

import android.app.Application
import com.example.dependencyinjectionstart.example2.di.DaggerApplicationComponent

class ExampleApplication : Application() {
    val component by lazy {
        DaggerApplicationComponent.factory().create(
            time = System.currentTimeMillis(),
            context = this
        )
    }
}