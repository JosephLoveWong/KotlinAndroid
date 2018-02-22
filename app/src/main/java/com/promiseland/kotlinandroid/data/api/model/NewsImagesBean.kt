package com.will.weiyuekotlin.bean

import java.io.Serializable

class NewsImagesBean {

    var meta: MetaBean? = null
    var body: BodyBean? = null

    class MetaBean {

        var id: String? = null
        var type: String? = null
        var o: String? = null
        var documentId: String? = null
    }

    class BodyBean {

        var newStatus: String? = null
        var wwwurl: String? = null
        var commentsUrl: String? = null
        var documentId: String? = null
        var staticId: String? = null
        var showclient: String? = null
        var shareurl: String? = null
        var author: String? = null
        var editorcode: String? = null
        var source: String? = null
        var title: String? = null
        var editTime: String? = null
        var updateTime: String? = null
        var subscribe: SubscribeBean? = null
        var praise: String? = null
        var showAdvert: Int = 0
        var adData: AdDataBean? = null
        var slides: List<SlidesBean>? = null
        var recommend: List<RecommendBean>? = null

        class SubscribeBean {

            var cateid: String? = null
            var type: String? = null
            var catename: String? = null
            var logo: String? = null
            var description: String? = null
            var cateSource: String? = null
            var backgroud: String? = null
            var api: String? = null
        }

        class AdDataBean {

            var articleAdData: ArticleAdDataBean? = null
            var commentsAdData: CommentsAdDataBean? = null

            class ArticleAdDataBean {

                var type: String? = null
                var pid: String? = null
                var adError: Int = 0
                var errorText: String? = null
            }

            class CommentsAdDataBean {

                var thumbnail: String? = null
                var title: String? = null
                var appSource: String? = null
                var adId: String? = null
                var adPositionId: String? = null
                var pid: String? = null
                var type: String? = null
                var style: StyleBean? = null
                var icon: IconBean? = null
                var imageWidth: String? = null
                var imageHeight: String? = null
                var link: LinkBean? = null

                class StyleBean {

                    var attribute: String? = null
                    var view: String? = null
                    var backreason: List<String>? = null
                }

                class IconBean {

                    var showIcon: Int = 0
                    var text: String? = null
                }

                class LinkBean {

                    var type: String? = null
                    var weburl: String? = null
                    var url: String? = null
                    var pvurl: List<String>? = null
                    var async_click: List<String>? = null
                }
            }
        }

        class SlidesBean : Serializable {

            var image: String? = null
            var title: String? = null
            var description: String? = null
        }

        class RecommendBean {

            var title: String? = null
            var id: String? = null
            var staticId: String? = null
            var type: String? = null
            var source: String? = null
            var createTime: String? = null
            var commentsUrl: String? = null
            var links: String? = null
            var thumbnail: String? = null
            var commentsall: String? = null
            var comments: String? = null
            var reftype: String? = null
        }
    }
}
