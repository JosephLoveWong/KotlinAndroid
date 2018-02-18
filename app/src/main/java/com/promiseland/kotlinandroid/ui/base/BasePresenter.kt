package com.promiseland.kotlinandroid.ui.base

/**
 * Created by joseph on 2018/2/18.
 */
abstract class BasePresenter : BaseContract.BasePresenter {
    protected var mView: BaseContract.BaseView? = null
    /**
     * 绑定View
     */
    override fun attachView(view: BaseContract.BaseView) {
        mView = view
    }

    /**
     * 解除绑定
     */
    override fun detachView() {
        mView?.let {
            mView = null
        }
    }
}