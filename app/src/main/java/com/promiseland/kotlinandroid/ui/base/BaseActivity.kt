package com.promiseland.kotlinandroid.ui.base

import android.os.Bundle
import android.support.annotation.Nullable
import android.view.View
import com.promiseland.kotlinandroid.WeiYueApp
import javax.inject.Inject

/**
 * Created by joseph on 2018/2/18.
 */
abstract class BaseActivity<T : BaseContract.BasePresenter> : SupportActivity(), IBase, BaseContract.BaseView {
    private lateinit var mRootView :View

    @Nullable
    @Inject
    @JvmField
    var mPresenter: T? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mRootView = layoutInflater.inflate(getContentLayout(), null)
        setContentView(mRootView)
        bindView(mRootView, savedInstanceState)
        setupComponent(WeiYueApp.mApplicationComponent)

        attachView()
        initData()
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter?.detachView()
    }

    /**
     * 绑定 Presenter
     */
    private fun attachView() {
        mPresenter?.attachView(this)
    }

    override fun bindView(view: View, savedInstanceState: Bundle?) {

    }

    /**
     * 显示加载页面
     */
    override fun showLoading(){

    }

    /**
     * 显示内容页面
     */
    override fun showSuccess(){

    }

    /**
     * 显示错误页面
     */
    override fun showError(){

    }

    /**
     * 显示无网络页面
     */
    override fun showNoNet(){

    }
    /**
     * 加载失败重试
     */
    override fun onRetry(){

    }
}