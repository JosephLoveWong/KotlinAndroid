package com.promiseland.kotlinandroid.ui.mvp.news

import android.os.Bundle
import android.view.View
import com.promiseland.kotlinandroid.AppComponent
import com.promiseland.kotlinandroid.R
import com.promiseland.kotlinandroid.ui.base.BaseFragment
import com.promiseland.kotlinandroid.ui.base.IBase
import com.promiseland.kotlinandroid.ui.mvp.news.contract.NewsDetailContract
import com.promiseland.kotlinandroid.ui.mvp.news.presenter.NewsDetailPresenter
import kotlinx.android.synthetic.main.fragment_news_detail.*

/**
 * Created by Administrator on 2018/2/22.
 */
class NewsDetailFragment : BaseFragment<NewsDetailPresenter>(), IBase, NewsDetailContract.View {
    companion object {
        fun newInstance(channelId: String): NewsDetailFragment {
            val args = Bundle()
            args.putString("newsId", channelId)
            val fragment = NewsDetailFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun getContentLayout(): Int = R.layout.fragment_news_detail

    override fun setupComponent(appComponent: AppComponent) {

    }

    override fun bindView(view: View, savedInstanceState: Bundle?) {
    }

    override fun initData() {
        name.text = getNewsId()
    }

    fun getNewsId() = arguments.getString("newsId")
}