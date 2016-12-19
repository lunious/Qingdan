package lunioussky.qingdan.entity;

import java.util.List;

/**
 * Created by Administrator on 2016/12/19.
 */

public class ResponseArticleTitle {

    /**
     * code : 0
     * message : Success
     * data : {"id":852,"title":"为什么你天天刷牙却还是会蛀牙？| 口腔护理 2+1","subtitle":"","featuredImageUrl":"http://img01.eqingdan.com/47d6d8f4-9c17-11e6-89dd-00163e002745.png?imageView2/1/w/640/h/360/q/75","excerpt":"口腔护理三步骤，你都做到了吗？","isLiked":false,"thingCount":0,"likeCount":36,"hitCount":7313,"commentCount":3,"categories":[{"name":"个护","slug":"nursing"}],"publishedAt":"2016-10-29 15:02:34","publishedAtDiffForHumans":"1天前","links":{"self":"http://api.eqingdan.com/v1/articles/852","html":"http://www.eqingdan.com/app/articles/852","share":"http://www.eqingdan.com/mobile/articles/852","like":"http://api.eqingdan.com/v1/article/852/actions/like","cancelLike":"http://api.eqingdan.com/v1/article/852/actions/cancel-like"},"author":{"id":8,"username":"lina","nickname":"Lina","tagline":"理性派剁手党，刀子嘴豆腐心","avatarUrl":"http://img01.eqingdan.com/f60a149a-0780-11e5-a3af-00163e002745.jpeg?imageView2/1/w/120/h/120/q/75"}}
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
         * id : 852
         * title : 为什么你天天刷牙却还是会蛀牙？| 口腔护理 2+1
         * subtitle :
         * featuredImageUrl : http://img01.eqingdan.com/47d6d8f4-9c17-11e6-89dd-00163e002745.png?imageView2/1/w/640/h/360/q/75
         * excerpt : 口腔护理三步骤，你都做到了吗？
         * isLiked : false
         * thingCount : 0
         * likeCount : 36
         * hitCount : 7313
         * commentCount : 3
         * categories : [{"name":"个护","slug":"nursing"}]
         * publishedAt : 2016-10-29 15:02:34
         * publishedAtDiffForHumans : 1天前
         * links : {"self":"http://api.eqingdan.com/v1/articles/852","html":"http://www.eqingdan.com/app/articles/852","share":"http://www.eqingdan.com/mobile/articles/852","like":"http://api.eqingdan.com/v1/article/852/actions/like","cancelLike":"http://api.eqingdan.com/v1/article/852/actions/cancel-like"}
         * author : {"id":8,"username":"lina","nickname":"Lina","tagline":"理性派剁手党，刀子嘴豆腐心","avatarUrl":"http://img01.eqingdan.com/f60a149a-0780-11e5-a3af-00163e002745.jpeg?imageView2/1/w/120/h/120/q/75"}
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
        private LinksBean links;
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

        public LinksBean getLinks() {
            return links;
        }

        public void setLinks(LinksBean links) {
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

        public static class LinksBean {
            /**
             * self : http://api.eqingdan.com/v1/articles/852
             * html : http://www.eqingdan.com/app/articles/852
             * share : http://www.eqingdan.com/mobile/articles/852
             * like : http://api.eqingdan.com/v1/article/852/actions/like
             * cancelLike : http://api.eqingdan.com/v1/article/852/actions/cancel-like
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
             * id : 8
             * username : lina
             * nickname : Lina
             * tagline : 理性派剁手党，刀子嘴豆腐心
             * avatarUrl : http://img01.eqingdan.com/f60a149a-0780-11e5-a3af-00163e002745.jpeg?imageView2/1/w/120/h/120/q/75
             */

            private int id;
            private String username;
            private String nickname;
            private String tagline;
            private String avatarUrl;

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
}
