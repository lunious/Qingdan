package lunioussky.qingdan.entity;

import java.util.List;

/**
 * Created by LG on 2016/10/27.
 * Tips:
 */

public class ResponseReputation {

    /**
     * code : 0
     * message : Success
     * data : {"rankings":[{"id":35,"title":"美容仪器","slug":"beauty","featuredImageUrl":"http://img01.eqingdan.com/addfa5d2-9685-11e6-83ab-00163e002745.jpeg?imageView2/1/w/640/h/360/q/75","thumbnailImageUrl":"http://img01.eqingdan.com/aef30d7e-9685-11e6-9cc3-00163e002745.jpeg?imageView2/1/w/200/h/150/q/75","body":"","publishedAt":"2016-10-20 17:58:43","publishedAtDiffForHumans":"2天前","thingCount":23,"reviewCount":66,"links":{"self":"http://api.eqingdan.com/v1/rankings/35","share":"http://www.eqingdan.com/mobile/rankings/beauty"}},{"id":34,"title":"定型工具","slug":"hair_styling","featuredImageUrl":"http://img01.eqingdan.com/9900b1d8-9685-11e6-8447-00163e002745.jpeg?imageView2/1/w/640/h/360/q/75","thumbnailImageUrl":"http://img01.eqingdan.com/99e0412c-9685-11e6-9564-00163e002745.jpeg?imageView2/1/w/200/h/150/q/75","body":"","publishedAt":"2016-10-20 17:58:37","publishedAtDiffForHumans":"2天前","thingCount":23,"reviewCount":7,"links":{"self":"http://api.eqingdan.com/v1/rankings/34","share":"http://www.eqingdan.com/mobile/rankings/hair_styling"}},{"id":33,"title":"乳液","slug":"lotion","featuredImageUrl":"http://img01.eqingdan.com/a5767c94-91c2-11e6-92a3-00163e004c5e.jpeg?imageView2/1/w/640/h/360/q/75","thumbnailImageUrl":"http://img01.eqingdan.com/a9108836-91c2-11e6-ae5a-00163e004c5e.jpeg?imageView2/1/w/200/h/150/q/75","body":"","publishedAt":"2016-10-14 18:57:51","publishedAtDiffForHumans":"1周前","thingCount":35,"reviewCount":158,"links":{"self":"http://api.eqingdan.com/v1/rankings/33","share":"http://www.eqingdan.com/mobile/rankings/lotion"}},{"id":32,"title":"防晒霜","slug":"sunscreen","featuredImageUrl":"http://img01.eqingdan.com/aeae9472-905a-11e6-b46a-00163e002745.jpeg?imageView2/1/w/640/h/360/q/75","thumbnailImageUrl":"http://img01.eqingdan.com/b12e55ca-905a-11e6-a196-00163e002745.jpeg?imageView2/1/w/200/h/150/q/75","body":"","publishedAt":"2016-10-12 17:11:04","publishedAtDiffForHumans":"1周前","thingCount":45,"reviewCount":332,"links":{"self":"http://api.eqingdan.com/v1/rankings/32","share":"http://www.eqingdan.com/mobile/rankings/sunscreen"}},{"id":31,"title":"护发精油","slug":"hair_treatment","featuredImageUrl":"http://img01.eqingdan.com/e20becca-8eac-11e6-82db-00163e002745.jpeg?imageView2/1/w/640/h/360/q/75","thumbnailImageUrl":"http://img01.eqingdan.com/e3d228a8-8eac-11e6-a3a8-00163e002745.jpeg?imageView2/1/w/200/h/150/q/75","body":"","publishedAt":"2016-10-11 21:59:59","publishedAtDiffForHumans":"1周前","thingCount":27,"reviewCount":120,"links":{"self":"http://api.eqingdan.com/v1/rankings/31","share":"http://www.eqingdan.com/mobile/rankings/hair_treatment"}}]}
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
         * id : 35
         * title : 美容仪器
         * slug : beauty
         * featuredImageUrl : http://img01.eqingdan.com/addfa5d2-9685-11e6-83ab-00163e002745.jpeg?imageView2/1/w/640/h/360/q/75
         * thumbnailImageUrl : http://img01.eqingdan.com/aef30d7e-9685-11e6-9cc3-00163e002745.jpeg?imageView2/1/w/200/h/150/q/75
         * body :
         * publishedAt : 2016-10-20 17:58:43
         * publishedAtDiffForHumans : 2天前
         * thingCount : 23
         * reviewCount : 66
         * links : {"self":"http://api.eqingdan.com/v1/rankings/35","share":"http://www.eqingdan.com/mobile/rankings/beauty"}
         */

        private List<RankingsBean> rankings;

        public List<RankingsBean> getRankings() {
            return rankings;
        }

        public void setRankings(List<RankingsBean> rankings) {
            this.rankings = rankings;
        }

        public static class RankingsBean {
            private int id;
            private String title;
            private String slug;
            private String featuredImageUrl;
            private String thumbnailImageUrl;
            private String body;
            private String publishedAt;
            private String publishedAtDiffForHumans;
            private int thingCount;
            private int reviewCount;
            /**
             * self : http://api.eqingdan.com/v1/rankings/35
             * share : http://www.eqingdan.com/mobile/rankings/beauty
             */

            private LinksBean links;

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

            public String getSlug() {
                return slug;
            }

            public void setSlug(String slug) {
                this.slug = slug;
            }

            public String getFeaturedImageUrl() {
                return featuredImageUrl;
            }

            public void setFeaturedImageUrl(String featuredImageUrl) {
                this.featuredImageUrl = featuredImageUrl;
            }

            public String getThumbnailImageUrl() {
                return thumbnailImageUrl;
            }

            public void setThumbnailImageUrl(String thumbnailImageUrl) {
                this.thumbnailImageUrl = thumbnailImageUrl;
            }

            public String getBody() {
                return body;
            }

            public void setBody(String body) {
                this.body = body;
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

            public int getThingCount() {
                return thingCount;
            }

            public void setThingCount(int thingCount) {
                this.thingCount = thingCount;
            }

            public int getReviewCount() {
                return reviewCount;
            }

            public void setReviewCount(int reviewCount) {
                this.reviewCount = reviewCount;
            }

            public LinksBean getLinks() {
                return links;
            }

            public void setLinks(LinksBean links) {
                this.links = links;
            }

            public static class LinksBean {
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
    }
}
