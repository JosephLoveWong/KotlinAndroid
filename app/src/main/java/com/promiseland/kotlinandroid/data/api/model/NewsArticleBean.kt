package com.will.weiyuekotlin.bean

import com.google.gson.annotations.SerializedName

import java.io.Serializable

class NewsArticleBean : Serializable {
    var meta: MetaBean? = null
    var body: BodyBean? = null
    var disclaimer: String? = null
    override fun toString(): String {
        return "NewsArticleBean{" +
                "meta=" + meta +
                ", body=" + body +
                ", disclaimer='" + disclaimer + '\'' +
                '}'
    }

    class MetaBean {
        var id: String? = null
        var type: String? = null
        var documentId: String? = null
        @SerializedName("class")
        var classX: String? = null
        var o: Int = 0
    }

    class BodyBean {
        var aid: String? = null
        var staticId: String? = null
        var id: String? = null
        var documentId: String? = null
        var title: String? = null
        var author: String? = null
        var editorcode: String? = null
        var source: String? = null
        var thumbnail: String? = null
        var editTime: String? = null
        var updateTime: String? = null
        var cTime: String? = null
        var uTime: String? = null
        var wwwurl: String? = null
        var shareurl: String? = null
        var commentsUrl: String? = null
        var text: String? = null
        var commentCount: Int = 0
        var commentType: String? = null
        var allowComment: String? = null
        var subscribe: SubscribeBean? = null
        var slides: List<SlidesBean>? = null
        var praise: String? = null
        var hasEditor: String? = null
        var hasVideo: String? = null
        var img: List<ImgBean>? = null
        var relateDocs: List<RelateDocsBean>? = null

        override fun toString(): String {
            return "BodyBean{" +
                    "aid='" + aid + '\'' +
                    ", staticId='" + staticId + '\'' +
                    ", id='" + id + '\'' +
                    ", documentId='" + documentId + '\'' +
                    ", title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", source='" + source + '\'' +
                    ", thumbnail='" + thumbnail + '\'' +
                    ", editTime='" + editTime + '\'' +
                    ", updateTime='" + updateTime + '\'' +
                    ", cTime='" + cTime + '\'' +
                    ", uTime='" + uTime + '\'' +
                    ", wwwurl='" + wwwurl + '\'' +
                    ", shareurl='" + shareurl + '\'' +
                    ", commentsUrl='" + commentsUrl + '\'' +
                    ", text='" + text + '\'' +
                    ", commentCount=" + commentCount +
                    ", commentType='" + commentType + '\'' +
                    ", allowComment='" + allowComment + '\'' +
                    ", subscribe=" + subscribe +
                    ", slides=" + slides +
                    ", praise='" + praise + '\'' +
                    ", hasEditor='" + hasEditor + '\'' +
                    ", hasVideo='" + hasVideo + '\'' +
                    ", img=" + img +
                    ", relateDocs=" + relateDocs +
                    '}'
        }

        class SlidesBean : Serializable {

            var image: String? = null
            var title: String? = null
            var description: String? = null
            override fun toString(): String {
                return "SlidesBean{" +
                        "image='" + image + '\'' +
                        ", title='" + title + '\'' +
                        ", description='" + description + '\'' +
                        '}'
            }
        }

        class SubscribeBean {

            var type: String? = null
            var cateSource: String? = null
            var parentid: String? = null
            var parentname: String? = null
            var cateid: String? = null
            var catename: String? = null
            var logo: String? = null
            var description: String? = null
            var api: String? = null
            var show_link: Int = 0
            var share_url: String? = null
            var status: Int = 0
        }

        class ImgBean {

            var url: String? = null
            var size: SizeBean? = null

            class SizeBean {
                var width: String? = null
                var height: String? = null
            }
        }

        class RelateDocsBean {

            var thumbnail: String? = null
            var title: String? = null
            var id: String? = null
            var source: String? = null
            var documentId: String? = null
            var staticId: String? = null
            var createTime: String? = null
            var updateTime: String? = null
            var commentsUrl: String? = null
            var type: String? = null
            var link: LinkBean? = null
            var subscribe: SubscribeBeanX? = null
            var comments: String? = null
            var commentsall: String? = null
            var style: StyleBean? = null
            var phvideo: PhvideoBean? = null

            class LinkBean {

                var type: String? = null
                var url: String? = null
            }

            class SubscribeBeanX {

                var cateid: String? = null
                var type: String? = null
                var catename: String? = null
                var logo: String? = null
                var description: String? = null
                var cateSource: String? = null
                var api: String? = null
            }

            class StyleBean {

                var view: String? = null
                var backreason: List<String>? = null
            }

            class PhvideoBean {

                var channelName: String? = null
                var length: Int = 0
            }
        }
    }
}
