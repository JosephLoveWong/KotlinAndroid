package com.promiseland.kotlinandroid.ui.mvp.news.presenter

import com.promiseland.kotlinandroid.ui.base.BasePresenter
import com.promiseland.kotlinandroid.ui.mvp.news.NewsDetailFragment
import com.promiseland.kotlinandroid.ui.mvp.news.contract.NewsDetailContract
import javax.inject.Inject

/**
 * Created by Administrator on 2018/2/22.
 */
class NewsDetailPresenter @Inject
constructor() : BasePresenter<NewsDetailFragment>(), NewsDetailContract.Presenter {
}