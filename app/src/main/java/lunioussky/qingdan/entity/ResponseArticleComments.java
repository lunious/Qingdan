package lunioussky.qingdan.entity;

import java.util.List;

/**
 * Created by Administrator on 2016/12/19.
 */

public class ResponseArticleComments {

    /**
     * code : 0
     * message : Success
     * data : {"comments":[{"id":3197,"target_type":1,"target_id":852,"body":"是这样的嘛？！吓得我虎躯一震啊。。。","rootId":3191,"parentId":3195,"level":3,"replyCount":0,"isUpvoted":false,"upvoteCount":0,"createdAt":"2016-10-30 08:40:30","createdAtDiffForHumans":"18小时前","user":{"id":26255,"username":"duo-rou-zhi-wu-xiao-","nickname":"GRE蜜豆哩ENY","tagline":"植物系的小青蛙一枚。收集控，喜欢所有与艺术、设计、绿色有关的东西。本科视觉传达毕业，设计学硕士在读，偶尔自己也画画小玩意。","avatarUrl":"http://img01.eqingdan.com/dc52a3b6-49bd-11e6-8d72-00163e002745.jpeg?imageView2/1/w/120/h/120/q/75"},"replyToUser":{"id":31218,"username":"tai-tai-gao","nickname":"抬抬高","tagline":"永远年轻，永远热泪盈眶","avatarUrl":"http://img01.eqingdan.com/84687604-6eb0-11e6-9487-00163e002745.jpeg?imageView2/1/w/120/h/120/q/75"}},{"id":3195,"target_type":1,"target_id":852,"body":"正常不会出血，需要洗牙啦。","rootId":3191,"parentId":3191,"level":2,"replyCount":0,"isUpvoted":false,"upvoteCount":0,"createdAt":"2016-10-29 20:38:37","createdAtDiffForHumans":"1天前","user":{"id":31218,"username":"tai-tai-gao","nickname":"抬抬高","tagline":"永远年轻，永远热泪盈眶","avatarUrl":"http://img01.eqingdan.com/84687604-6eb0-11e6-9487-00163e002745.jpeg?imageView2/1/w/120/h/120/q/75"},"replyToUser":{"id":26255,"username":"duo-rou-zhi-wu-xiao-","nickname":"GRE蜜豆哩ENY","tagline":"植物系的小青蛙一枚。收集控，喜欢所有与艺术、设计、绿色有关的东西。本科视觉传达毕业，设计学硕士在读，偶尔自己也画画小玩意。","avatarUrl":"http://img01.eqingdan.com/dc52a3b6-49bd-11e6-8d72-00163e002745.jpeg?imageView2/1/w/120/h/120/q/75"}},{"id":3191,"target_type":1,"target_id":852,"body":"自从入了声波牙刷我的智齿都不疼啦～但是牙线还是手残星人的克星啊，逢尝试必见血:-(","rootId":0,"parentId":0,"level":1,"replyCount":2,"isUpvoted":false,"upvoteCount":0,"createdAt":"2016-10-29 18:05:03","createdAtDiffForHumans":"1天前","user":{"id":26255,"username":"duo-rou-zhi-wu-xiao-","nickname":"GRE蜜豆哩ENY","tagline":"植物系的小青蛙一枚。收集控，喜欢所有与艺术、设计、绿色有关的东西。本科视觉传达毕业，设计学硕士在读，偶尔自己也画画小玩意。","avatarUrl":"http://img01.eqingdan.com/dc52a3b6-49bd-11e6-8d72-00163e002745.jpeg?imageView2/1/w/120/h/120/q/75"}}],"meta":{"pagination":{"total":3,"count":3,"per_page":4,"current_page":1,"total_pages":1,"links":{}}}}
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
         * comments : [{"id":3197,"target_type":1,"target_id":852,"body":"是这样的嘛？！吓得我虎躯一震啊。。。","rootId":3191,"parentId":3195,"level":3,"replyCount":0,"isUpvoted":false,"upvoteCount":0,"createdAt":"2016-10-30 08:40:30","createdAtDiffForHumans":"18小时前","user":{"id":26255,"username":"duo-rou-zhi-wu-xiao-","nickname":"GRE蜜豆哩ENY","tagline":"植物系的小青蛙一枚。收集控，喜欢所有与艺术、设计、绿色有关的东西。本科视觉传达毕业，设计学硕士在读，偶尔自己也画画小玩意。","avatarUrl":"http://img01.eqingdan.com/dc52a3b6-49bd-11e6-8d72-00163e002745.jpeg?imageView2/1/w/120/h/120/q/75"},"replyToUser":{"id":31218,"username":"tai-tai-gao","nickname":"抬抬高","tagline":"永远年轻，永远热泪盈眶","avatarUrl":"http://img01.eqingdan.com/84687604-6eb0-11e6-9487-00163e002745.jpeg?imageView2/1/w/120/h/120/q/75"}},{"id":3195,"target_type":1,"target_id":852,"body":"正常不会出血，需要洗牙啦。","rootId":3191,"parentId":3191,"level":2,"replyCount":0,"isUpvoted":false,"upvoteCount":0,"createdAt":"2016-10-29 20:38:37","createdAtDiffForHumans":"1天前","user":{"id":31218,"username":"tai-tai-gao","nickname":"抬抬高","tagline":"永远年轻，永远热泪盈眶","avatarUrl":"http://img01.eqingdan.com/84687604-6eb0-11e6-9487-00163e002745.jpeg?imageView2/1/w/120/h/120/q/75"},"replyToUser":{"id":26255,"username":"duo-rou-zhi-wu-xiao-","nickname":"GRE蜜豆哩ENY","tagline":"植物系的小青蛙一枚。收集控，喜欢所有与艺术、设计、绿色有关的东西。本科视觉传达毕业，设计学硕士在读，偶尔自己也画画小玩意。","avatarUrl":"http://img01.eqingdan.com/dc52a3b6-49bd-11e6-8d72-00163e002745.jpeg?imageView2/1/w/120/h/120/q/75"}},{"id":3191,"target_type":1,"target_id":852,"body":"自从入了声波牙刷我的智齿都不疼啦～但是牙线还是手残星人的克星啊，逢尝试必见血:-(","rootId":0,"parentId":0,"level":1,"replyCount":2,"isUpvoted":false,"upvoteCount":0,"createdAt":"2016-10-29 18:05:03","createdAtDiffForHumans":"1天前","user":{"id":26255,"username":"duo-rou-zhi-wu-xiao-","nickname":"GRE蜜豆哩ENY","tagline":"植物系的小青蛙一枚。收集控，喜欢所有与艺术、设计、绿色有关的东西。本科视觉传达毕业，设计学硕士在读，偶尔自己也画画小玩意。","avatarUrl":"http://img01.eqingdan.com/dc52a3b6-49bd-11e6-8d72-00163e002745.jpeg?imageView2/1/w/120/h/120/q/75"}}]
         * meta : {"pagination":{"total":3,"count":3,"per_page":4,"current_page":1,"total_pages":1,"links":{}}}
         */

        private MetaBean meta;
        private List<CommentsBean> comments;

        public MetaBean getMeta() {
            return meta;
        }

        public void setMeta(MetaBean meta) {
            this.meta = meta;
        }

        public List<CommentsBean> getComments() {
            return comments;
        }

        public void setComments(List<CommentsBean> comments) {
            this.comments = comments;
        }

        public static class MetaBean {
            /**
             * pagination : {"total":3,"count":3,"per_page":4,"current_page":1,"total_pages":1,"links":{}}
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
                 * total : 3
                 * count : 3
                 * per_page : 4
                 * current_page : 1
                 * total_pages : 1
                 * links : {}
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
                }
            }
        }

        public static class CommentsBean {
            /**
             * id : 3197
             * target_type : 1
             * target_id : 852
             * body : 是这样的嘛？！吓得我虎躯一震啊。。。
             * rootId : 3191
             * parentId : 3195
             * level : 3
             * replyCount : 0
             * isUpvoted : false
             * upvoteCount : 0
             * createdAt : 2016-10-30 08:40:30
             * createdAtDiffForHumans : 18小时前
             * user : {"id":26255,"username":"duo-rou-zhi-wu-xiao-","nickname":"GRE蜜豆哩ENY","tagline":"植物系的小青蛙一枚。收集控，喜欢所有与艺术、设计、绿色有关的东西。本科视觉传达毕业，设计学硕士在读，偶尔自己也画画小玩意。","avatarUrl":"http://img01.eqingdan.com/dc52a3b6-49bd-11e6-8d72-00163e002745.jpeg?imageView2/1/w/120/h/120/q/75"}
             * replyToUser : {"id":31218,"username":"tai-tai-gao","nickname":"抬抬高","tagline":"永远年轻，永远热泪盈眶","avatarUrl":"http://img01.eqingdan.com/84687604-6eb0-11e6-9487-00163e002745.jpeg?imageView2/1/w/120/h/120/q/75"}
             */

            private int id;
            private int target_type;
            private int target_id;
            private String body;
            private int rootId;
            private int parentId;
            private int level;
            private int replyCount;
            private boolean isUpvoted;
            private int upvoteCount;
            private String createdAt;
            private String createdAtDiffForHumans;
            private UserBean user;
            private ReplyToUserBean replyToUser;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
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

            public String getBody() {
                return body;
            }

            public void setBody(String body) {
                this.body = body;
            }

            public int getRootId() {
                return rootId;
            }

            public void setRootId(int rootId) {
                this.rootId = rootId;
            }

            public int getParentId() {
                return parentId;
            }

            public void setParentId(int parentId) {
                this.parentId = parentId;
            }

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
            }

            public int getReplyCount() {
                return replyCount;
            }

            public void setReplyCount(int replyCount) {
                this.replyCount = replyCount;
            }

            public boolean isIsUpvoted() {
                return isUpvoted;
            }

            public void setIsUpvoted(boolean isUpvoted) {
                this.isUpvoted = isUpvoted;
            }

            public int getUpvoteCount() {
                return upvoteCount;
            }

            public void setUpvoteCount(int upvoteCount) {
                this.upvoteCount = upvoteCount;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public String getCreatedAtDiffForHumans() {
                return createdAtDiffForHumans;
            }

            public void setCreatedAtDiffForHumans(String createdAtDiffForHumans) {
                this.createdAtDiffForHumans = createdAtDiffForHumans;
            }

            public UserBean getUser() {
                return user;
            }

            public void setUser(UserBean user) {
                this.user = user;
            }

            public ReplyToUserBean getReplyToUser() {
                return replyToUser;
            }

            public void setReplyToUser(ReplyToUserBean replyToUser) {
                this.replyToUser = replyToUser;
            }

            public static class UserBean {
                /**
                 * id : 26255
                 * username : duo-rou-zhi-wu-xiao-
                 * nickname : GRE蜜豆哩ENY
                 * tagline : 植物系的小青蛙一枚。收集控，喜欢所有与艺术、设计、绿色有关的东西。本科视觉传达毕业，设计学硕士在读，偶尔自己也画画小玩意。
                 * avatarUrl : http://img01.eqingdan.com/dc52a3b6-49bd-11e6-8d72-00163e002745.jpeg?imageView2/1/w/120/h/120/q/75
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

            public static class ReplyToUserBean {
                /**
                 * id : 31218
                 * username : tai-tai-gao
                 * nickname : 抬抬高
                 * tagline : 永远年轻，永远热泪盈眶
                 * avatarUrl : http://img01.eqingdan.com/84687604-6eb0-11e6-9487-00163e002745.jpeg?imageView2/1/w/120/h/120/q/75
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
        }
    }
}
