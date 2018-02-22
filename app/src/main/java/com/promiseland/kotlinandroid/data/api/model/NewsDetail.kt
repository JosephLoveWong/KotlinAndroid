package com.will.weiyuekotlin.bean

import java.io.Serializable

class NewsDetail : Serializable {

    var listId: String? = null
    var type: String? = null
    var expiredTime: Int = 0
    var currentPage: Int = 0
    var totalPage: Int = 0
    var topsize: Int = 0
    var item: ArrayList<ItemBean>? = null

    override fun toString(): String {
        return "NewsDetail{" +
                "listId='" + listId + '\'' +
                ", type='" + type + '\'' +
                ", expiredTime=" + expiredTime +
                ", currentPage=" + currentPage +
                ", totalPage=" + totalPage +
                ", topsize=" + topsize +
                ", item=" + item +
                '}'
    }

    class ItemBean : Serializable {

        var viewType: Int = 0
        var type: String? = null
        var thumbnail: String? = null
        var online: String? = null
        var title: String? = null
        var showType: String? = null
        var source: String? = null
        var subscribe: SubscribeBean? = null
        var updateTime: String? = null
        var id: String? = null
        var documentId: String? = null
        var staticId: String? = null
        var style: StyleBean? = null
        var commentsUrl: String? = null
        var comments: String? = null
        var commentsall: String? = null
        var link: LinkBean? = null
        var simId: String? = null
        var reftype: String? = null
        var recomToken: String? = null
        var isHasSlide: Boolean = false


        override fun toString(): String {
            return "ItemBean{" +
                    "type='" + type + '\'' +
                    ", thumbnail='" + thumbnail + '\'' +
                    ", online='" + online + '\'' +
                    ", title='" + title + '\'' +
                    ", showType='" + showType + '\'' +
                    ", source='" + source + '\'' +
                    ", subscribe=" + subscribe +
                    ", updateTime='" + updateTime + '\'' +
                    ", id='" + id + '\'' +
                    ", documentId='" + documentId + '\'' +
                    ", staticId='" + staticId + '\'' +
                    ", style=" + style +
                    ", commentsUrl='" + commentsUrl + '\'' +
                    ", comments='" + comments + '\'' +
                    ", commentsall='" + commentsall + '\'' +
                    ", link=" + link +
                    ", simId='" + simId + '\'' +
                    ", reftype='" + reftype + '\'' +
                    ", recomToken='" + recomToken + '\'' +
                    ", hasSlide=" + isHasSlide +
                    '}'
        }

        class SubscribeBean {

            var cateid: String? = null
            var type: String? = null
            var catename: String? = null
            var description: String? = null
            override fun toString(): String {
                return "SubscribeBean{" +
                        "cateid='" + cateid + '\'' +
                        ", type='" + type + '\'' +
                        ", catename='" + catename + '\'' +
                        ", description='" + description + '\'' +
                        '}'
            }
        }

        class StyleBean {

            var view: String? = null
            var backreason: ArrayList<String>? = null
            var images: ArrayList<String>? = null
            override fun toString(): String {
                return "StyleBean{" +
                        "view='" + view + '\'' +
                        ", backreason=" + backreason +
                        ", images=" + images +
                        '}'
            }
        }

        class LinkBean {

            var type: String? = null
            var url: String? = null
            var weburl: String? = null

            override fun toString(): String {
                return "LinkBean{" +
                        "type='" + type + '\'' +
                        ", url='" + url + '\'' +
                        ", weburl='" + weburl + '\'' +
                        '}'
            }
        }

        companion object {
            //广告类型
            val TYPE_ADVERT_TITLEIMG = 1

            val TYPE_ADVERT_SLIDEIMG = 2

            val TYPE_ADVERT_LONGIMG = 3
            //图片类型
            val TYPE_SLIDE = 4
            //视频类型
            val TYPE_PHVIDEO = 5

            //显示形式单图
            val TYPE_DOC_TITLEIMG = 6
            //显示形式多图
            val TYPE_DOC_SLIDEIMG = 7
        }
    }
}
