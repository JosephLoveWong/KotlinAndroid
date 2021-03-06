package com.promiseland.kotlinandroid.ui.base

import android.os.Bundle
import android.view.View
import com.promiseland.kotlinandroid.AppComponent

/**
 * Created by joseph on 2018/2/18.
 */
interface IBase {
    /**
     * 获取页面布局 id
     */
    fun getContentLayout(): Int

    /**
     * Dagger2 注入
     */
    fun setupComponent(appComponent: AppComponent)

    /**
     * 初始化布局
     */
    fun bindView(view: View, savedInstanceState: Bundle?)

    /**
     * 加载数据
     */
    fun initData()
}