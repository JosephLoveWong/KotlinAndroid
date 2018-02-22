package com.promiseland.kotlinandroid.data.api

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by Administrator on 2018/2/22.
 */
@Module
class HttpModule {
    @Provides
    internal fun provideOkHttpClient(): OkHttpClient.Builder {
        return OkHttpClient().newBuilder()
                .retryOnConnectionFailure(true)
                .addInterceptor(RetrofitConfig.sLoggingInterceptor)
                .addInterceptor(RetrofitConfig.sRewriteCacheControlInterceptor)
                .addNetworkInterceptor(RetrofitConfig.sRewriteCacheControlInterceptor)
                .connectTimeout(10, TimeUnit.SECONDS)
    }

    @Provides
    internal fun provideRetrofit(builder: OkHttpClient.Builder): Retrofit.Builder {
        builder.addInterceptor(RetrofitConfig.sQueryParameterInterceptor)

        return Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(builder.build())
    }

    @Provides
    internal fun provideNewsApiService(builder: Retrofit.Builder): NewsApiService {
        return builder
                .baseUrl(ApiConstants.sIFengApi)
                .build()
                .create(NewsApiService::class.java)
    }

    @Provides
    fun provideNewsApiManager(service: NewsApiService): NewsApiManager = NewsApiManager.getInstance(service)
}