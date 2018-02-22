package com.promiseland.kotlinandroid.ui.mvp.news.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.promiseland.kotlinandroid.data.api.model.Channel
import com.promiseland.kotlinandroid.ui.mvp.news.NewsDetailFragment

/**
 * Created by Administrator on 2018/2/22.
 */
class ChannelPagerAdapter(fm: FragmentManager?, private var mChannels: List<Channel>?) : FragmentStatePagerAdapter(fm) {
    fun update(channels: List<Channel>?) {
        mChannels = channels
        notifyDataSetChanged()
    }

    override fun getItem(position: Int): Fragment = NewsDetailFragment.newInstance(mChannels!![position].channelId!!)

    override fun getPageTitle(position: Int): CharSequence? = mChannels!![position].channelName

    override fun getCount(): Int = mChannels?.size ?: 0
}