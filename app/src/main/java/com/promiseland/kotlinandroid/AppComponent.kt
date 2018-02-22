package com.promiseland.kotlinandroid

import com.promiseland.kotlinandroid.data.api.HttpModule
import com.promiseland.kotlinandroid.ui.mvp.news.di.NewsComponent
import com.promiseland.kotlinandroid.ui.mvp.news.di.NewsModule
import dagger.Component

/**
 * Created by joseph on 2018/2/18.
 */
@Component(modules = [
(AppModule::class),
(HttpModule::class)
])
interface AppComponent {
    fun plus(newsModule: NewsModule): NewsComponent
}