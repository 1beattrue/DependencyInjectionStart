package com.example.dependencyinjectionstart.example2.di

import android.content.Context
import com.example.dependencyinjectionstart.example2.presentation.MainActivity
import com.example.dependencyinjectionstart.example2.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun activityComponentFactory(): ActivityComponent.Factory

//    @Component.Builder
//    interface ApplicationComponentBuilder {
//        @BindsInstance
//        fun time(time: Long): ApplicationComponentBuilder
//        @BindsInstance
//        fun context(context: Context): ApplicationComponentBuilder
//        fun build(): ApplicationComponent
//    }

    @Component.Factory
    interface ApplicationComponentFactory { // способ круче
        fun create(
            @BindsInstance time: Long,
            @BindsInstance context: Context
        ): ApplicationComponent
    }
}
