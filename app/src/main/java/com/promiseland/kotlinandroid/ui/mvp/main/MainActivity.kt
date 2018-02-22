package com.promiseland.kotlinandroid.ui.mvp.main

import android.os.Bundle
import android.view.View
import com.promiseland.kotlinandroid.AppComponent
import com.promiseland.kotlinandroid.R
import com.promiseland.kotlinandroid.R.id.action_news
import com.promiseland.kotlinandroid.R.id.action_video
import com.promiseland.kotlinandroid.ui.base.BaseActivity
import com.promiseland.kotlinandroid.ui.base.BaseContract
import com.promiseland.kotlinandroid.ui.base.SupportFragment
import com.promiseland.kotlinandroid.ui.mvp.news.NewsFragment
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by joseph on 2018/2/18.
 */
class MainActivity : BaseActivity<BaseContract.BasePresenter>() {
    private var mFragments = arrayOfNulls<SupportFragment>(3)

    /**
     * 获取页面布局 id
     */
    override fun getContentLayout(): Int = R.layout.activity_main

    /**
     * Dagger2 注入
     */
    override fun setupComponent(appComponent: AppComponent) {

    }

    override fun bindView(view: View, savedInstanceState: Bundle?) {
        super.bindView(view, savedInstanceState)
        if(savedInstanceState == null) {
            mFragments[0] = NewsFragment.newInstance()
            mFragments[1] = NewsFragment.newInstance()
            mFragments[2] = NewsFragment.newInstance()

            supportDelegate.loadMultipleRootFragment(R.id.container, 0,
                    mFragments[0],
                    mFragments[1],
                    mFragments[2])
        } else {
            mFragments[0] = findFragment(NewsFragment::class.java)
            mFragments[1] = findFragment(NewsFragment::class.java)
            mFragments[2] = findFragment(NewsFragment::class.java)
        }
    }

    /**
     * 加载数据
     */
    override fun initData() {
        navigation.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                action_news -> {
                    supportDelegate.showHideFragment(mFragments[0])
                    true
                }
                action_video -> {
                    supportDelegate.showHideFragment(mFragments[1])
                    true
                }
                else -> {
                    supportDelegate.showHideFragment(mFragments[2])
                    true
                }
            }
        }
    }
}