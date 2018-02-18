package com.promiseland.kotlinandroid

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by joseph on 2018/2/18.
 */
@Module
class AppModule(private val context: Context) {
    @Singleton
    @Provides
    fun provideContext(): Context {
        return context
    }
}