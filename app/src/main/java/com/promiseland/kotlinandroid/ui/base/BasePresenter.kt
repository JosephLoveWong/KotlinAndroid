package com.promiseland.kotlinandroid.ui.base

/**
 * Created by joseph on 2018/2/18.
 */
abstract class BasePresenter<T : BaseContract.BaseView> : BaseContract.BasePresenter {
    protected var mView: T? = null
    /**
     * 绑定View
     */
    override fun attachView(view: BaseContract.BaseView) {
        mView = view as T
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