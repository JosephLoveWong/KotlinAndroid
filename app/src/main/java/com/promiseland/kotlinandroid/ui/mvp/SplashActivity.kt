package com.promiseland.kotlinandroid.ui.mvp

import android.content.Intent
import com.promiseland.kotlinandroid.AppComponent
import com.promiseland.kotlinandroid.R
import com.promiseland.kotlinandroid.ui.base.BaseActivity
import com.promiseland.kotlinandroid.ui.base.BaseContract
import com.promiseland.kotlinandroid.ui.mvp.main.MainActivity
import com.promiseland.kotlinandroid.util.ImageLoaderUtil
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableObserver
import kotlinx.android.synthetic.main.activity_splash.*
import java.util.concurrent.TimeUnit

/**
 * Created by joseph on 2018/2/18.
 */
class SplashActivity : BaseActivity<BaseContract.BasePresenter>() {
    //必应每日壁纸 来源于 https://www.dujin.org/fenxiang/jiaocheng/3618.html.
    private val picUrl = "http://api.dujin.org/bing/1920.php"
    private var mCompositeDisposable: CompositeDisposable? = CompositeDisposable()

    /**
     * 获取页面布局 id
     */
    override fun getContentLayout(): Int = R.layout.activity_splash

    /**
     * Dagger2 注入
     */
    override fun setupComponent(appComponent: AppComponent) {

    }

    /**
     * 加载数据
     */
    override fun initData() {
        ImageLoaderUtil.LoadImage(this, picUrl, iv_ad)

        mCompositeDisposable?.add(countDown(4)
//                .doOnSubscribe { tv_skip.text = "跳过 4" }
                .subscribeWith(object : DisposableObserver<Int>() {
                    override fun onNext(t: Int) {
                        tv_skip.text = "跳过 ${t}"
                    }

                    override fun onError(e: Throwable) {

                    }

                    override fun onComplete() {
                        toMain()
                    }
                }))

        fl_ad.setOnClickListener({ toMain() })
    }

    fun countDown(time: Int): Observable<Int> {
        return Observable.interval(0, 1, TimeUnit.SECONDS)
                .observeOn(AndroidSchedulers.mainThread())
                .map { time - it.toInt() }
                .take(time.toLong())
    }

    private fun toMain() {
        mCompositeDisposable?.dispose()

        val intent = Intent()
        intent.setClass(this@SplashActivity, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun onDestroy() {
        mCompositeDisposable?.dispose()
        super.onDestroy()

    }
}