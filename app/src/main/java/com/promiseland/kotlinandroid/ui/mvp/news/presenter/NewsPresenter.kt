package com.promiseland.kotlinandroid.ui.mvp.news.presenter

import com.promiseland.kotlinandroid.R
import com.promiseland.kotlinandroid.WeiYueApp
import com.promiseland.kotlinandroid.data.api.NewsApiManager
import com.promiseland.kotlinandroid.data.api.model.Channel
import com.promiseland.kotlinandroid.ui.base.BasePresenter
import com.promiseland.kotlinandroid.ui.mvp.news.NewsFragment
import com.promiseland.kotlinandroid.ui.mvp.news.contract.NewsContract
import java.util.*
import javax.inject.Inject

/**
 * Created by joseph on 2018/2/19.
 */
class NewsPresenter @Inject
constructor(private val newsApiManager: NewsApiManager) : BasePresenter<NewsFragment>(), NewsContract.Presenter {

    /**
     * 获取频道列表
     */
    override fun getChannel() {
        val channelName = WeiYueApp.context.resources.getStringArray(R.array.news_channel)
        val channelId = WeiYueApp.context.resources.getStringArray(R.array.news_channel_id)
        val channels = ArrayList<Channel>()

        for (i in channelName.indices) {
            val channel = Channel()
            channel.channelId = channelId[i].toString()
            channel.channelName = channelName[i].toString()
            channels.add(channel)
        }

        mView?.loadData(channels)
    }
}