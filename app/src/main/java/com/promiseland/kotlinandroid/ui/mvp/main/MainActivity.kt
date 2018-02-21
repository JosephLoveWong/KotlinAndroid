package com.promiseland.kotlinandroid.ui.mvp.main

import com.promiseland.kotlinandroid.AppComponent
import com.promiseland.kotlinandroid.R
import com.promiseland.kotlinandroid.ui.base.BaseActivity
import com.promiseland.kotlinandroid.ui.base.BaseContract

/**
 * Created by joseph on 2018/2/18.
 */
class MainActivity : BaseActivity<BaseContract.BasePresenter>() {
    /**
     * 获取页面布局 id
     */
    override fun getContentLayout(): Int = R.layout.activity_main

    /**
     * Dagger2 注入
     */
    override fun setupComponent(appComponent: AppComponent) {

    }

    /**
     * 加载数据
     */
    override fun initData() {
//        navigation.setOnNavigationItemSelectedListener {
//            when (it.itemId) {
//                action_news -> 1
//                action_video -> 2
//                action_my -> 2
//                else -> 4
//            }
//        }
    }
}