package com.promiseland.kotlinandroid.ui.mvp.news.di

import com.promiseland.kotlinandroid.ui.mvp.news.NewsFragment
import dagger.Subcomponent

/**
 * Created by joseph on 2018/2/19.
 */
@Subcomponent(modules = [(NewsModule::class)])
interface NewsComponent {
    fun inject(newsFragment: NewsFragment)
}