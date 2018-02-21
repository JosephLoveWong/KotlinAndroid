package com.promiseland.kotlinandroid.ui.mvp.news

import android.os.Bundle
import android.view.View
import com.promiseland.kotlinandroid.AppComponent
import com.promiseland.kotlinandroid.R
import com.promiseland.kotlinandroid.ui.base.BaseFragment
import com.promiseland.kotlinandroid.ui.mvp.news.contract.NewsContract
import com.promiseland.kotlinandroid.ui.mvp.news.di.NewsModule
import com.promiseland.kotlinandroid.ui.mvp.news.presenter.NewsPresenter

/**
 * Created by joseph on 2018/2/19.
 */
class NewsFragment : BaseFragment<NewsPresenter>(), NewsContract.View {
    /**
     * 获取页面布局 id
     */
    override fun getContentLayout(): Int = R.layout.fragment_news

    /**
     * Dagger2 注入
     */
    override fun setupComponent(appComponent: AppComponent) {
        appComponent.plus(NewsModule()).inject(this)
    }

    /**
     * 初始化布局
     */
    override fun bindView(view: View, savedInstanceState: Bundle?) {

    }

    /**
     * 加载数据
     */
    override fun initData() {
    }
}