package com.promiseland.kotlinandroid.ui.base

import android.os.Bundle
import android.support.annotation.Nullable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.promiseland.kotlinandroid.WeiYueApp
import javax.inject.Inject

/**
 * Created by joseph on 2018/2/19.
 */
abstract class BaseFragment<T : BaseContract.BasePresenter> : SupportFragment(), IBase, BaseContract.BaseView {
    private var mRootView: View? = null

    @Nullable
    @Inject
    @JvmField
    var mPresenter: T? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        if (mRootView != null) {
            val parent = mRootView!!.parent as ViewGroup
            parent.removeView(mRootView)
        } else {
            mRootView = inflater?.inflate(getContentLayout(), container, false)
        }
        return mRootView
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupComponent(WeiYueApp.mApplicationComponent)
        attachView()
        initData()
    }

    private fun attachView() {
        mPresenter?.attachView(this)
    }

    override fun onDestroy() {
        mPresenter?.detachView()
        super.onDestroy()
    }

    /**
     * 显示加载页面
     */
    override fun showLoading() {

    }


    /**
     * 显示内容页面
     */
    override fun showSuccess() {

    }

    /**
     * 显示错误页面
     */
    override fun showError() {

    }

    /**
     * 显示无网络页面
     */
    override fun showNoNet() {

    }

    /**
     * 加载失败重试
     */
    override fun onRetry() {

    }
}