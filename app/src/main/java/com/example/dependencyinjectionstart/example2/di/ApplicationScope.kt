package com.example.dependencyinjectionstart.example2.di

import javax.inject.Scope

@Scope
@Retention(AnnotationRetention.RUNTIME) // волшебная мантра
annotation class ApplicationScope // кстати у @Singleton примерно такая же реализация