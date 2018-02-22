package com.promiseland.kotlinandroid

import android.app.Application
import android.content.Context
import com.promiseland.kotlinandroid.data.api.HttpModule
import kotlin.properties.Delegates

/**
 * Created by joseph on 2018/2/18.
 */
class WeiYueApp : Application() {

    companion object {
        var context:Context by Delegates.notNull()
        var mApplicationComponent : AppComponent by Delegates.notNull()
    }

    override fun onCreate() {
        super.onCreate()
        context = this
        mApplicationComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .httpModule(HttpModule())
                .build()
    }
}