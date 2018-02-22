package com.promiseland.kotlinandroid.data.api

import android.support.annotation.StringDef
import com.will.weiyuekotlin.bean.NewsArticleBean
import com.will.weiyuekotlin.bean.NewsDetail
import io.reactivex.Observable
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

/**
 * Created by Administrator on 2018/2/22.
 */
class NewsApiManager(private val mService: NewsApiService) {

    companion object {
        const val ACTION_DEFAULT = "default"
        const val ACTION_DOWN = "down"
        const val ACTION_UP = "up"

        private var sInstance: NewsApiManager? = null

        fun getInstance(newsApiService: NewsApiService): NewsApiManager {
            if (sInstance == null)
                sInstance = NewsApiManager(newsApiService)
            return sInstance as NewsApiManager
        }
    }

    @StringDef(ACTION_DEFAULT, ACTION_DOWN, ACTION_UP)
    @Retention(RetentionPolicy.SOURCE)
    annotation class Actions

    fun getNewsDetail(id: String, @Actions action: String, pullNum: Int): Observable<List<NewsDetail>>
            = mService.getNewsDetail(id, action, pullNum)

    fun getNewsArticleWithSub(aid: String): Observable<NewsArticleBean> = when{
        aid.startsWith("sub") -> mService.getNewsArticleWithSub(aid)
        else -> mService.getNewsArticleWithCmpp(ApiConstants.sGetNewsArticleCmppApi + ApiConstants.sGetNewsArticleDocCmppApi, aid)
    }
}