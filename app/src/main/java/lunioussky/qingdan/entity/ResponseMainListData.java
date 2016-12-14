package lunioussky.qingdan.entity;

import java.util.List;

/**
 * Created by 11645 on 2016/12/15.
 */

public class ResponseMainListData {

    /**
     * code : 0
     * message : Success
     * data : {"articles":[{"id":838,"title":"应对秋冬皮肤干燥，分区护理才是正道","subtitle":"","featuredImageUrl":"http://img01.eqingdan.com/a292fbfc-955e-11e6-99ee-00163e004c5e.jpeg?imageView2/1/w/640/h/360/q/75","excerpt":"对付秋冬皮肤干燥,分区护理才是正道","isLiked":false,"thingCount":7,"likeCount":30,"hitCount":1766,"commentCount":2,"categories":[{"name":"个护","slug":"nursing"}],"publishedAt":"2016-10-19 18:13:37","publishedAtDiffForHumans":"3天前","links":{"self":"http://api.eqingdan.com/v1/articles/838","html":"http://www.eqingdan.com/app/articles/838","share":"http://www.eqingdan.com/mobile/articles/838","like":"http://api.eqingdan.com/v1/article/838/actions/like","cancelLike":"http://api.eqingdan.com/v1/article/838/actions/cancel-like"},"author":{"id":5402,"username":"Lily大掌柜","nickname":"Lily大掌柜","tagline":"浴室完美主义者","avatarUrl":"http://img01.eqingdan.com/7e53ab18-9a48-11e5-8da7-00163e002745.png?imageView2/1/w/120/h/120/q/75","backgroundImageUrl":null,"weibo":{"uid":"5650663510","name":"Bathfeeling浴见轻松"},"wechat":{"unionId":"oRUdus3PNJo2z_gDYxo4cfEr8Opw","openId":"o5_jnskLlGG_PW1nTY7exuWRe1CQ","nickname":"【Bathfeeling】李励Lily"}}}],"collections":[{"_id":69,"id":69,"hash":"kr5y72237381","title":"好衣服更得好好打理 | 衣物护理合辑","subtitle":"看清洗标说明，选对护理工具。","featuredImageUrl":"http://img01.eqingdan.com/1ec4c6ba-11d9-11e6-aae8-00163e002745.jpeg?imageView2/1/w/640/h/360/q/75","excerpt":"教你挑干衣机、衣架，还有各类衣物护理方法。","isLiked":false,"likeCount":0,"articleCount":7,"publishedAt":"2016-05-04 17:30:23","publishedAtDiffForHumans":"5月前","links":{"self":"http://api.eqingdan.com/v1/collections/kr5y72237381","share":"http://www.eqingdan.com/mobile/collections/kr5y72237381"}}],"nodes":[{"_id":800,"target_type":1,"target_id":839,"target_hash":"","title":"扒大牌 | 山寨 Chanel ？才不是，做彩妆妙巴黎更在行！","subtitle":"对不起，Bourjois，我们小看了你","featuredImageUrl":"http://img01.eqingdan.com/393e76aa-95d5-11e6-810f-00163e002745.jpeg?imageView2/1/w/640/h/360/q/75","categories":[{"name":"彩妆","slug":"cai-zhuang"}],"isLiked":false,"likeCount":13,"commentCount":1,"hitCount":727,"publishedAt":"2016-10-22 18:30:00","publishedAtDiffForHumans":"20小时前"}],"meta":{"pagination":{"total":174,"count":10,"per_page":10,"current_page":1,"total_pages":18,"links":{"next":"http://api.eqingdan.com/v1/categories/nursing/articles?page=2"}}}}
     */

    private int code;
    private String message;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * articles : [{"id":838,"title":"应对秋冬皮肤干燥，分区护理才是正道","subtitle":"","featuredImageUrl":"http://img01.eqingdan.com/a292fbfc-955e-11e6-99ee-00163e004c5e.jpeg?imageView2/1/w/640/h/360/q/75","excerpt":"对付秋冬皮肤干燥,分区护理才是正道","isLiked":false,"thingCount":7,"likeCount":30,"hitCount":1766,"commentCount":2,"categories":[{"name":"个护","slug":"nursing"}],"publishedAt":"2016-10-19 18:13:37","publishedAtDiffForHumans":"3天前","links":{"self":"http://api.eqingdan.com/v1/articles/838","html":"http://www.eqingdan.com/app/articles/838","share":"http://www.eqingdan.com/mobile/articles/838","like":"http://api.eqingdan.com/v1/article/838/actions/like","cancelLike":"http://api.eqingdan.com/v1/article/838/actions/cancel-like"},"author":{"id":5402,"username":"Lily大掌柜","nickname":"Lily大掌柜","tagline":"浴室完美主义者","avatarUrl":"http://img01.eqingdan.com/7e53ab18-9a48-11e5-8da7-00163e002745.png?imageView2/1/w/120/h/120/q/75","backgroundImageUrl":null,"weibo":{"uid":"5650663510","name":"Bathfeeling浴见轻松"},"wechat":{"unionId":"oRUdus3PNJo2z_gDYxo4cfEr8Opw","openId":"o5_jnskLlGG_PW1nTY7exuWRe1CQ","nickname":"【Bathfeeling】李励Lily"}}}]
         * collections : [{"_id":69,"id":69,"hash":"kr5y72237381","title":"好衣服更得好好打理 | 衣物护理合辑","subtitle":"看清洗标说明，选对护理工具。","featuredImageUrl":"http://img01.eqingdan.com/1ec4c6ba-11d9-11e6-aae8-00163e002745.jpeg?imageView2/1/w/640/h/360/q/75","excerpt":"教你挑干衣机、衣架，还有各类衣物护理方法。","isLiked":false,"likeCount":0,"articleCount":7,"publishedAt":"2016-05-04 17:30:23","publishedAtDiffForHumans":"5月前","links":{"self":"http://api.eqingdan.com/v1/collections/kr5y72237381","share":"http://www.eqingdan.com/mobile/collections/kr5y72237381"}}]
         * nodes : [{"_id":800,"target_type":1,"target_id":839,"target_hash":"","title":"扒大牌 | 山寨 Chanel ？才不是，做彩妆妙巴黎更在行！","subtitle":"对不起，Bourjois，我们小看了你","featuredImageUrl":"http://img01.eqingdan.com/393e76aa-95d5-11e6-810f-00163e002745.jpeg?imageView2/1/w/640/h/360/q/75","categories":[{"name":"彩妆","slug":"cai-zhuang"}],"isLiked":false,"likeCount":13,"commentCount":1,"hitCount":727,"publishedAt":"2016-10-22 18:30:00","publishedAtDiffForHumans":"20小时前"}]
         * meta : {"pagination":{"total":174,"count":10,"per_page":10,"current_page":1,"total_pages":18,"links":{"next":"http://api.eqingdan.com/v1/categories/nursing/articles?page=2"}}}
         */

        private MetaBean meta;
        private List<ArticlesBean> articles;
        private List<CollectionsBean> collections;
        private List<NodesBean> nodes;

        public MetaBean getMeta() {
            return meta;
        }

        public void setMeta(MetaBean meta) {
            this.meta = meta;
        }

        public List<ArticlesBean> getArticles() {
            return articles;
        }

        public void setArticles(List<ArticlesBean> articles) {
            this.articles = articles;
        }

        public List<CollectionsBean> getCollections() {
            return collections;
        }

        public void setCollections(List<CollectionsBean> collections) {
            this.collections = collections;
        }

        public List<NodesBean> getNodes() {
            return nodes;
        }

        public void setNodes(List<NodesBean> nodes) {
            this.nodes = nodes;
        }

        public static class MetaBean {
            /**
             * pagination : {"total":174,"count":10,"per_page":10,"current_page":1,"total_pages":18,"links":{"next":"http://api.eqingdan.com/v1/categories/nursing/articles?page=2"}}
             */

            private PaginationBean pagination;

            public PaginationBean getPagination() {
                return pagination;
            }

            public void setPagination(PaginationBean pagination) {
                this.pagination = pagination;
            }

            public static class PaginationBean {
                /**
                 * total : 174
                 * count : 10
                 * per_page : 10
                 * current_page : 1
                 * total_pages : 18
                 * links : {"next":"http://api.eqingdan.com/v1/categories/nursing/articles?page=2"}
                 */

                private int total;
                private int count;
                private int per_page;
                private int current_page;
                private int total_pages;
                private LinksBean links;

                public int getTotal() {
                    return total;
                }

                public void setTotal(int total) {
                    this.total = total;
                }

                public int getCount() {
                    return count;
                }

                public void setCount(int count) {
                    this.count = count;
                }

                public int getPer_page() {
                    return per_page;
                }

                public void setPer_page(int per_page) {
                    this.per_page = per_page;
                }

                public int getCurrent_page() {
                    return current_page;
                }

                public void setCurrent_page(int current_page) {
                    this.current_page = current_page;
                }

                public int getTotal_pages() {
                    return total_pages;
                }

                public void setTotal_pages(int total_pages) {
                    this.total_pages = total_pages;
                }

                public LinksBean getLinks() {
                    return links;
                }

                public void setLinks(LinksBean links) {
                    this.links = links;
                }

                public static class LinksBean {
                    /**
                     * next : http://api.eqingdan.com/v1/categories/nursing/articles?page=2
                     */

                    private String next;

                    public String getNext() {
                        return next;
                    }

                    public void setNext(String next) {
                        this.next = next;
                    }
                }
            }
        }

        public static class ArticlesBean {
            /**
             * id : 838
             * title : 应对秋冬皮肤干燥，分区护理才是正道
             * subtitle :
             * featuredImageUrl : http://img01.eqingdan.com/a292fbfc-955e-11e6-99ee-00163e004c5e.jpeg?imageView2/1/w/640/h/360/q/75
             * excerpt : 对付秋冬皮肤干燥,分区护理才是正道
             * isLiked : false
             * thingCount : 7
             * likeCount : 30
             * hitCount : 1766
             * commentCount : 2
             * categories : [{"name":"个护","slug":"nursing"}]
             * publishedAt : 2016-10-19 18:13:37
             * publishedAtDiffForHumans : 3天前
             * links : {"self":"http://api.eqingdan.com/v1/articles/838","html":"http://www.eqingdan.com/app/articles/838","share":"http://www.eqingdan.com/mobile/articles/838","like":"http://api.eqingdan.com/v1/article/838/actions/like","cancelLike":"http://api.eqingdan.com/v1/article/838/actions/cancel-like"}
             * author : {"id":5402,"username":"Lily大掌柜","nickname":"Lily大掌柜","tagline":"浴室完美主义者","avatarUrl":"http://img01.eqingdan.com/7e53ab18-9a48-11e5-8da7-00163e002745.png?imageView2/1/w/120/h/120/q/75","backgroundImageUrl":null,"weibo":{"uid":"5650663510","name":"Bathfeeling浴见轻松"},"wechat":{"unionId":"oRUdus3PNJo2z_gDYxo4cfEr8Opw","openId":"o5_jnskLlGG_PW1nTY7exuWRe1CQ","nickname":"【Bathfeeling】李励Lily"}}
             */

            private int id;
            private String title;
            private String subtitle;
            private String featuredImageUrl;
            private String excerpt;
            private boolean isLiked;
            private int thingCount;
            private int likeCount;
            private int hitCount;
            private int commentCount;
            private String publishedAt;
            private String publishedAtDiffForHumans;
            private LinksBeanX links;
            private AuthorBean author;
            private List<CategoriesBean> categories;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getSubtitle() {
                return subtitle;
            }

            public void setSubtitle(String subtitle) {
                this.subtitle = subtitle;
            }

            public String getFeaturedImageUrl() {
                return featuredImageUrl;
            }

            public void setFeaturedImageUrl(String featuredImageUrl) {
                this.featuredImageUrl = featuredImageUrl;
            }

            public String getExcerpt() {
                return excerpt;
            }

            public void setExcerpt(String excerpt) {
                this.excerpt = excerpt;
            }

            public boolean isIsLiked() {
                return isLiked;
            }

            public void setIsLiked(boolean isLiked) {
                this.isLiked = isLiked;
            }

            public int getThingCount() {
                return thingCount;
            }

            public void setThingCount(int thingCount) {
                this.thingCount = thingCount;
            }

            public int getLikeCount() {
                return likeCount;
            }

            public void setLikeCount(int likeCount) {
                this.likeCount = likeCount;
            }

            public int getHitCount() {
                return hitCount;
            }

            public void setHitCount(int hitCount) {
                this.hitCount = hitCount;
            }

            public int getCommentCount() {
                return commentCount;
            }

            public void setCommentCount(int commentCount) {
                this.commentCount = commentCount;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public String getPublishedAtDiffForHumans() {
                return publishedAtDiffForHumans;
            }

            public void setPublishedAtDiffForHumans(String publishedAtDiffForHumans) {
                this.publishedAtDiffForHumans = publishedAtDiffForHumans;
            }

            public LinksBeanX getLinks() {
                return links;
            }

            public void setLinks(LinksBeanX links) {
                this.links = links;
            }

            public AuthorBean getAuthor() {
                return author;
            }

            public void setAuthor(AuthorBean author) {
                this.author = author;
            }

            public List<CategoriesBean> getCategories() {
                return categories;
            }

            public void setCategories(List<CategoriesBean> categories) {
                this.categories = categories;
            }

            public static class LinksBeanX {
                /**
                 * self : http://api.eqingdan.com/v1/articles/838
                 * html : http://www.eqingdan.com/app/articles/838
                 * share : http://www.eqingdan.com/mobile/articles/838
                 * like : http://api.eqingdan.com/v1/article/838/actions/like
                 * cancelLike : http://api.eqingdan.com/v1/article/838/actions/cancel-like
                 */

                private String self;
                private String html;
                private String share;
                private String like;
                private String cancelLike;

                public String getSelf() {
                    return self;
                }

                public void setSelf(String self) {
                    this.self = self;
                }

                public String getHtml() {
                    return html;
                }

                public void setHtml(String html) {
                    this.html = html;
                }

                public String getShare() {
                    return share;
                }

                public void setShare(String share) {
                    this.share = share;
                }

                public String getLike() {
                    return like;
                }

                public void setLike(String like) {
                    this.like = like;
                }

                public String getCancelLike() {
                    return cancelLike;
                }

                public void setCancelLike(String cancelLike) {
                    this.cancelLike = cancelLike;
                }
            }

            public static class AuthorBean {
                /**
                 * id : 5402
                 * username : Lily大掌柜
                 * nickname : Lily大掌柜
                 * tagline : 浴室完美主义者
                 * avatarUrl : http://img01.eqingdan.com/7e53ab18-9a48-11e5-8da7-00163e002745.png?imageView2/1/w/120/h/120/q/75
                 * backgroundImageUrl : null
                 * weibo : {"uid":"5650663510","name":"Bathfeeling浴见轻松"}
                 * wechat : {"unionId":"oRUdus3PNJo2z_gDYxo4cfEr8Opw","openId":"o5_jnskLlGG_PW1nTY7exuWRe1CQ","nickname":"【Bathfeeling】李励Lily"}
                 */

                private int id;
                private String username;
                private String nickname;
                private String tagline;
                private String avatarUrl;
                private Object backgroundImageUrl;
                private WeiboBean weibo;
                private WechatBean wechat;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getUsername() {
                    return username;
                }

                public void setUsername(String username) {
                    this.username = username;
                }

                public String getNickname() {
                    return nickname;
                }

                public void setNickname(String nickname) {
                    this.nickname = nickname;
                }

                public String getTagline() {
                    return tagline;
                }

                public void setTagline(String tagline) {
                    this.tagline = tagline;
                }

                public String getAvatarUrl() {
                    return avatarUrl;
                }

                public void setAvatarUrl(String avatarUrl) {
                    this.avatarUrl = avatarUrl;
                }

                public Object getBackgroundImageUrl() {
                    return backgroundImageUrl;
                }

                public void setBackgroundImageUrl(Object backgroundImageUrl) {
                    this.backgroundImageUrl = backgroundImageUrl;
                }

                public WeiboBean getWeibo() {
                    return weibo;
                }

                public void setWeibo(WeiboBean weibo) {
                    this.weibo = weibo;
                }

                public WechatBean getWechat() {
                    return wechat;
                }

                public void setWechat(WechatBean wechat) {
                    this.wechat = wechat;
                }

                public static class WeiboBean {
                    /**
                     * uid : 5650663510
                     * name : Bathfeeling浴见轻松
                     */

                    private String uid;
                    private String name;

                    public String getUid() {
                        return uid;
                    }

                    public void setUid(String uid) {
                        this.uid = uid;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }
                }

                public static class WechatBean {
                    /**
                     * unionId : oRUdus3PNJo2z_gDYxo4cfEr8Opw
                     * openId : o5_jnskLlGG_PW1nTY7exuWRe1CQ
                     * nickname : 【Bathfeeling】李励Lily
                     */

                    private String unionId;
                    private String openId;
                    private String nickname;

                    public String getUnionId() {
                        return unionId;
                    }

                    public void setUnionId(String unionId) {
                        this.unionId = unionId;
                    }

                    public String getOpenId() {
                        return openId;
                    }

                    public void setOpenId(String openId) {
                        this.openId = openId;
                    }

                    public String getNickname() {
                        return nickname;
                    }

                    public void setNickname(String nickname) {
                        this.nickname = nickname;
                    }
                }
            }

            public static class CategoriesBean {
                /**
                 * name : 个护
                 * slug : nursing
                 */

                private String name;
                private String slug;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getSlug() {
                    return slug;
                }

                public void setSlug(String slug) {
                    this.slug = slug;
                }
            }
        }

        public static class CollectionsBean {
            /**
             * _id : 69
             * id : 69
             * hash : kr5y72237381
             * title : 好衣服更得好好打理 | 衣物护理合辑
             * subtitle : 看清洗标说明，选对护理工具。
             * featuredImageUrl : http://img01.eqingdan.com/1ec4c6ba-11d9-11e6-aae8-00163e002745.jpeg?imageView2/1/w/640/h/360/q/75
             * excerpt : 教你挑干衣机、衣架，还有各类衣物护理方法。
             * isLiked : false
             * likeCount : 0
             * articleCount : 7
             * publishedAt : 2016-05-04 17:30:23
             * publishedAtDiffForHumans : 5月前
             * links : {"self":"http://api.eqingdan.com/v1/collections/kr5y72237381","share":"http://www.eqingdan.com/mobile/collections/kr5y72237381"}
             */

            private int _id;
            private int id;
            private String hash;
            private String title;
            private String subtitle;
            private String featuredImageUrl;
            private String excerpt;
            private boolean isLiked;
            private int likeCount;
            private int articleCount;
            private String publishedAt;
            private String publishedAtDiffForHumans;
            private LinksBeanXX links;

            public int get_id() {
                return _id;
            }

            public void set_id(int _id) {
                this._id = _id;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getHash() {
                return hash;
            }

            public void setHash(String hash) {
                this.hash = hash;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getSubtitle() {
                return subtitle;
            }

            public void setSubtitle(String subtitle) {
                this.subtitle = subtitle;
            }

            public String getFeaturedImageUrl() {
                return featuredImageUrl;
            }

            public void setFeaturedImageUrl(String featuredImageUrl) {
                this.featuredImageUrl = featuredImageUrl;
            }

            public String getExcerpt() {
                return excerpt;
            }

            public void setExcerpt(String excerpt) {
                this.excerpt = excerpt;
            }

            public boolean isIsLiked() {
                return isLiked;
            }

            public void setIsLiked(boolean isLiked) {
                this.isLiked = isLiked;
            }

            public int getLikeCount() {
                return likeCount;
            }

            public void setLikeCount(int likeCount) {
                this.likeCount = likeCount;
            }

            public int getArticleCount() {
                return articleCount;
            }

            public void setArticleCount(int articleCount) {
                this.articleCount = articleCount;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public String getPublishedAtDiffForHumans() {
                return publishedAtDiffForHumans;
            }

            public void setPublishedAtDiffForHumans(String publishedAtDiffForHumans) {
                this.publishedAtDiffForHumans = publishedAtDiffForHumans;
            }

            public LinksBeanXX getLinks() {
                return links;
            }

            public void setLinks(LinksBeanXX links) {
                this.links = links;
            }

            public static class LinksBeanXX {
                /**
                 * self : http://api.eqingdan.com/v1/collections/kr5y72237381
                 * share : http://www.eqingdan.com/mobile/collections/kr5y72237381
                 */

                private String self;
                private String share;

                public String getSelf() {
                    return self;
                }

                public void setSelf(String self) {
                    this.self = self;
                }

                public String getShare() {
                    return share;
                }

                public void setShare(String share) {
                    this.share = share;
                }
            }
        }

        public static class NodesBean {
            /**
             * _id : 800
             * target_type : 1
             * target_id : 839
             * target_hash :
             * title : 扒大牌 | 山寨 Chanel ？才不是，做彩妆妙巴黎更在行！
             * subtitle : 对不起，Bourjois，我们小看了你
             * featuredImageUrl : http://img01.eqingdan.com/393e76aa-95d5-11e6-810f-00163e002745.jpeg?imageView2/1/w/640/h/360/q/75
             * categories : [{"name":"彩妆","slug":"cai-zhuang"}]
             * isLiked : false
             * likeCount : 13
             * commentCount : 1
             * hitCount : 727
             * publishedAt : 2016-10-22 18:30:00
             * publishedAtDiffForHumans : 20小时前
             */

            private int _id;
            private int target_type;
            private int target_id;
            private String target_hash;
            private String title;
            private String subtitle;
            private String featuredImageUrl;
            private boolean isLiked;
            private int likeCount;
            private int commentCount;
            private int hitCount;
            private String publishedAt;
            private String publishedAtDiffForHumans;
            private List<CategoriesBeanX> categories;

            public int get_id() {
                return _id;
            }

            public void set_id(int _id) {
                this._id = _id;
            }

            public int getTarget_type() {
                return target_type;
            }

            public void setTarget_type(int target_type) {
                this.target_type = target_type;
            }

            public int getTarget_id() {
                return target_id;
            }

            public void setTarget_id(int target_id) {
                this.target_id = target_id;
            }

            public String getTarget_hash() {
                return target_hash;
            }

            public void setTarget_hash(String target_hash) {
                this.target_hash = target_hash;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getSubtitle() {
                return subtitle;
            }

            public void setSubtitle(String subtitle) {
                this.subtitle = subtitle;
            }

            public String getFeaturedImageUrl() {
                return featuredImageUrl;
            }

            public void setFeaturedImageUrl(String featuredImageUrl) {
                this.featuredImageUrl = featuredImageUrl;
            }

            public boolean isIsLiked() {
                return isLiked;
            }

            public void setIsLiked(boolean isLiked) {
                this.isLiked = isLiked;
            }

            public int getLikeCount() {
                return likeCount;
            }

            public void setLikeCount(int likeCount) {
                this.likeCount = likeCount;
            }

            public int getCommentCount() {
                return commentCount;
            }

            public void setCommentCount(int commentCount) {
                this.commentCount = commentCount;
            }

            public int getHitCount() {
                return hitCount;
            }

            public void setHitCount(int hitCount) {
                this.hitCount = hitCount;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public String getPublishedAtDiffForHumans() {
                return publishedAtDiffForHumans;
            }

            public void setPublishedAtDiffForHumans(String publishedAtDiffForHumans) {
                this.publishedAtDiffForHumans = publishedAtDiffForHumans;
            }

            public List<CategoriesBeanX> getCategories() {
                return categories;
            }

            public void setCategories(List<CategoriesBeanX> categories) {
                this.categories = categories;
            }

            public static class CategoriesBeanX {
                /**
                 * name : 彩妆
                 * slug : cai-zhuang
                 */

                private String name;
                private String slug;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getSlug() {
                    return slug;
                }

                public void setSlug(String slug) {
                    this.slug = slug;
                }
            }
        }
    }
}
