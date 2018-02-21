package com.promiseland.kotlinandroid.ui.mvp.news.presenter

import com.promiseland.kotlinandroid.ui.base.BasePresenter
import com.promiseland.kotlinandroid.ui.mvp.news.NewsFragment
import com.promiseland.kotlinandroid.ui.mvp.news.contract.NewsContract
import javax.inject.Inject

/**
 * Created by joseph on 2018/2/19.
 */
class NewsPresenter @Inject
constructor() : BasePresenter<NewsFragment>(), NewsContract.Presenter {

    /**
     * 获取频道列表
     */
    override fun getChannel() {
        //todo
    }
}