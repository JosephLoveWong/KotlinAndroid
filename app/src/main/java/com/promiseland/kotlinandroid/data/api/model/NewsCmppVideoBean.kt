package com.will.weiyuekotlin.bean

class NewsCmppVideoBean {

    var singleVideoInfo: List<SingleVideoInfoBean>? = null

    class SingleVideoInfoBean {

        var videoURLLow: String? = null
        var videoURLMid: String? = null
        var videoSizeLow: Int = 0
        var videoSizeMid: Int = 0
        var videoURLHigh: String? = null
        var videoSizeHigh: Int = 0
        var audioURL: String? = null
        var guid: String? = null
        var praise: String? = null
        var tread: String? = null
        var playTime: String? = null
        var imgURL: String? = null
        var smallImgURL: String? = null
        var largeImgURL: String? = null
        var richText: String? = null
        var videoPublishTime: String? = null
        var shareURL: String? = null
        var commentsUrl: String? = null
        var type: String? = null
        var id: String? = null
        var statisticID: String? = null
        var title: String? = null
        var videoLength: String? = null
        var longTitle: String? = null
        var columnName: String? = null
        var cp: String? = null
        var collect: String? = null
        var lastPlayedTime: String? = null
        var status: Int = 0
        var columnId: String? = null
        var weMedia: WeMediaBean? = null
        var newStatus: String? = null

        class WeMediaBean {

            var headPic: String? = null
            var name: String? = null
            var desc: String? = null
            var id: String? = null
            var type: String? = null
        }
    }
}
