package com.example.hilttutorial

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import org.jetbrains.annotations.NotNull
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
object AppModule {


    //@Singleton
    @Provides
    @Named("String1")
    fun provideTestString1() = "This is dummy string we will inject"

    //@NotNull
    //@Singleton
    @Provides
    @Named("String2")
    fun provideTestString2() = "This is dummy string we will inject as well"

}