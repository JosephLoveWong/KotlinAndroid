package com.promiseland.kotlinandroid.ui.mvp.news.contract

import com.promiseland.kotlinandroid.data.api.model.Channel
import com.promiseland.kotlinandroid.ui.base.BaseContract

/**
 * Created by joseph on 2018/2/19.
 */
interface NewsContract {
    interface View : BaseContract.BaseView {
        /**
         * 初始化频道
         */
        fun loadData(channels: List<Channel>)
    }

    interface Presenter : BaseContract.BasePresenter {
        /**
         * 获取频道列表
         */
        fun getChannel()
    }
}