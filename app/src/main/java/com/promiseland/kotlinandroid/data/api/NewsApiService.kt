package com.promiseland.kotlinandroid.data.api

import com.will.weiyuekotlin.bean.NewsArticleBean
import com.will.weiyuekotlin.bean.NewsDetail
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

/**
 * Created by Administrator on 2018/2/22.
 */
interface NewsApiService {

    @GET("ClientNews")
    fun getNewsDetail(@Query("id") id: String,
                      @Query("action") action: String,
                      @Query("pullNum") pullNum: Int
    ): Observable<List<NewsDetail>>

    @GET("api_vampire_article_detail")
    fun getNewsArticleWithSub(@Query("aid") aid: String): Observable<NewsArticleBean>

    @GET
    fun getNewsArticleWithCmpp(@Url url: String,
                               @Query("aid") aid: String): Observable<NewsArticleBean>
}