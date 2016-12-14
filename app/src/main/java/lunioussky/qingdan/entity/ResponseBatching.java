package lunioussky.qingdan.entity;

import java.util.List;

/**
 * Created by Administrator on 2016/12/1.
 */

public class ResponseBatching {

    /**
     * code : 0
     * message : Success
     * data : {"channels":{"body":{"code":0,"message":"Success","data":{"channels":[{"title":"个护","type":"articles_belong_to_category","weight":140,"extra":{"category_id":"6","category_slug":"nursing"}},{"title":"视频","type":"articles_belong_to_collection","weight":130,"extra":{"collection_id":"108","collection_hash":"ryldnpjdn450"}},{"title":"家居","type":"articles_belong_to_category","weight":120,"extra":{"category_id":"2","category_slug":"housing"}},{"title":"彩妆","type":"articles_belong_to_category","weight":110,"extra":{"category_id":"751","category_slug":"cai-zhuang"}},{"title":"运动","type":"articles_belong_to_category","weight":100,"extra":{"category_id":"3","category_slug":"sports"}},{"title":"办公","type":"articles_belong_to_category","weight":90,"extra":{"category_id":"88","category_slug":"ban-gong"}},{"title":"厨房","type":"articles_belong_to_category","weight":80,"extra":{"category_id":"1","category_slug":"kitchen"}},{"title":"出行","type":"articles_belong_to_category","weight":70,"extra":{"category_id":"7","category_slug":"journey"}},{"title":"母婴","type":"articles_belong_to_category","weight":60,"extra":{"category_id":"8","category_slug":"mothercare"}},{"title":"数码","type":"articles_belong_to_category","weight":50,"extra":{"category_id":"5","category_slug":"digital"}},{"title":"餐酒","type":"articles_belong_to_category","weight":40,"extra":{"category_id":"4","category_slug":"food-baverage"}},{"title":"专题","type":"collections","weight":30},{"title":"宠物","type":"articles_belong_to_category","weight":20,"extra":{"category_id":"318","category_slug":"chong-wu"}},{"title":"礼物","type":"articles_belong_to_collection","weight":10,"extra":{"collection_id":"1","collection_hash":"9w3xq32nyd8r"}}]}}},"slides":{"body":{"code":0,"message":"Success","data":{"slides":[{"featuredImageUrl":"http://img01.eqingdan.com/61fdc22a-94ff-11e6-a2d0-00163e004c5e.jpeg","title":"资生堂","excerpt":"","type":1,"target":"816","hash":"","links":{"target":"http://api.eqingdan.com/v1/articles/816","html":"http://www.eqingdan.com/articles/816"}},{"featuredImageUrl":"http://img01.eqingdan.com/d6ef9628-91ba-11e6-8c75-00163e004c5e.png","title":"挂烫机","excerpt":"","type":1,"target":"774","hash":"","links":{"target":"http://api.eqingdan.com/v1/articles/774","html":"http://www.eqingdan.com/articles/774"}},{"featuredImageUrl":"http://img01.eqingdan.com/ca1871a2-8fcd-11e6-9c30-00163e004c5e.jpeg","title":"魔术擦","excerpt":"","type":1,"target":"808","hash":"","links":{"target":"http://api.eqingdan.com/v1/articles/808","html":"http://www.eqingdan.com/articles/808"}},{"featuredImageUrl":"http://img01.eqingdan.com/c414f8ce-8eac-11e6-b128-00163e002745.jpeg","title":"油烟机","excerpt":"","type":1,"target":"787","hash":"","links":{"target":"http://api.eqingdan.com/v1/articles/787","html":"http://www.eqingdan.com/articles/787"}},{"featuredImageUrl":"http://img01.eqingdan.com/73b96b7c-8d25-11e6-9d26-00163e004c5e.jpeg","title":"编辑之选","excerpt":"","type":1,"target":"801","hash":"","links":{"target":"http://api.eqingdan.com/v1/articles/801","html":"http://www.eqingdan.com/articles/801"}}]}}}}
     */

    private int code;
    private String message;
    /**
     * channels : {"body":{"code":0,"message":"Success","data":{"channels":[{"title":"个护","type":"articles_belong_to_category","weight":140,"extra":{"category_id":"6","category_slug":"nursing"}},{"title":"视频","type":"articles_belong_to_collection","weight":130,"extra":{"collection_id":"108","collection_hash":"ryldnpjdn450"}},{"title":"家居","type":"articles_belong_to_category","weight":120,"extra":{"category_id":"2","category_slug":"housing"}},{"title":"彩妆","type":"articles_belong_to_category","weight":110,"extra":{"category_id":"751","category_slug":"cai-zhuang"}},{"title":"运动","type":"articles_belong_to_category","weight":100,"extra":{"category_id":"3","category_slug":"sports"}},{"title":"办公","type":"articles_belong_to_category","weight":90,"extra":{"category_id":"88","category_slug":"ban-gong"}},{"title":"厨房","type":"articles_belong_to_category","weight":80,"extra":{"category_id":"1","category_slug":"kitchen"}},{"title":"出行","type":"articles_belong_to_category","weight":70,"extra":{"category_id":"7","category_slug":"journey"}},{"title":"母婴","type":"articles_belong_to_category","weight":60,"extra":{"category_id":"8","category_slug":"mothercare"}},{"title":"数码","type":"articles_belong_to_category","weight":50,"extra":{"category_id":"5","category_slug":"digital"}},{"title":"餐酒","type":"articles_belong_to_category","weight":40,"extra":{"category_id":"4","category_slug":"food-baverage"}},{"title":"专题","type":"collections","weight":30},{"title":"宠物","type":"articles_belong_to_category","weight":20,"extra":{"category_id":"318","category_slug":"chong-wu"}},{"title":"礼物","type":"articles_belong_to_collection","weight":10,"extra":{"collection_id":"1","collection_hash":"9w3xq32nyd8r"}}]}}}
     * slides : {"body":{"code":0,"message":"Success","data":{"slides":[{"featuredImageUrl":"http://img01.eqingdan.com/61fdc22a-94ff-11e6-a2d0-00163e004c5e.jpeg","title":"资生堂","excerpt":"","type":1,"target":"816","hash":"","links":{"target":"http://api.eqingdan.com/v1/articles/816","html":"http://www.eqingdan.com/articles/816"}},{"featuredImageUrl":"http://img01.eqingdan.com/d6ef9628-91ba-11e6-8c75-00163e004c5e.png","title":"挂烫机","excerpt":"","type":1,"target":"774","hash":"","links":{"target":"http://api.eqingdan.com/v1/articles/774","html":"http://www.eqingdan.com/articles/774"}},{"featuredImageUrl":"http://img01.eqingdan.com/ca1871a2-8fcd-11e6-9c30-00163e004c5e.jpeg","title":"魔术擦","excerpt":"","type":1,"target":"808","hash":"","links":{"target":"http://api.eqingdan.com/v1/articles/808","html":"http://www.eqingdan.com/articles/808"}},{"featuredImageUrl":"http://img01.eqingdan.com/c414f8ce-8eac-11e6-b128-00163e002745.jpeg","title":"油烟机","excerpt":"","type":1,"target":"787","hash":"","links":{"target":"http://api.eqingdan.com/v1/articles/787","html":"http://www.eqingdan.com/articles/787"}},{"featuredImageUrl":"http://img01.eqingdan.com/73b96b7c-8d25-11e6-9d26-00163e004c5e.jpeg","title":"编辑之选","excerpt":"","type":1,"target":"801","hash":"","links":{"target":"http://api.eqingdan.com/v1/articles/801","html":"http://www.eqingdan.com/articles/801"}}]}}}
     */

    private DataBean1 data;

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

    public DataBean1 getData() {
        return data;
    }

    public void setData(DataBean1 data) {
        this.data = data;
    }

    public static class DataBean1 {
        /**
         * body : {"code":0,"message":"Success","data":{"channels":[{"title":"个护","type":"articles_belong_to_category","weight":140,"extra":{"category_id":"6","category_slug":"nursing"}},{"title":"视频","type":"articles_belong_to_collection","weight":130,"extra":{"collection_id":"108","collection_hash":"ryldnpjdn450"}},{"title":"家居","type":"articles_belong_to_category","weight":120,"extra":{"category_id":"2","category_slug":"housing"}},{"title":"彩妆","type":"articles_belong_to_category","weight":110,"extra":{"category_id":"751","category_slug":"cai-zhuang"}},{"title":"运动","type":"articles_belong_to_category","weight":100,"extra":{"category_id":"3","category_slug":"sports"}},{"title":"办公","type":"articles_belong_to_category","weight":90,"extra":{"category_id":"88","category_slug":"ban-gong"}},{"title":"厨房","type":"articles_belong_to_category","weight":80,"extra":{"category_id":"1","category_slug":"kitchen"}},{"title":"出行","type":"articles_belong_to_category","weight":70,"extra":{"category_id":"7","category_slug":"journey"}},{"title":"母婴","type":"articles_belong_to_category","weight":60,"extra":{"category_id":"8","category_slug":"mothercare"}},{"title":"数码","type":"articles_belong_to_category","weight":50,"extra":{"category_id":"5","category_slug":"digital"}},{"title":"餐酒","type":"articles_belong_to_category","weight":40,"extra":{"category_id":"4","category_slug":"food-baverage"}},{"title":"专题","type":"collections","weight":30},{"title":"宠物","type":"articles_belong_to_category","weight":20,"extra":{"category_id":"318","category_slug":"chong-wu"}},{"title":"礼物","type":"articles_belong_to_collection","weight":10,"extra":{"collection_id":"1","collection_hash":"9w3xq32nyd8r"}}]}}
         */

        private ChannelsBean1 channels;
        /**
         * body : {"code":0,"message":"Success","data":{"slides":[{"featuredImageUrl":"http://img01.eqingdan.com/61fdc22a-94ff-11e6-a2d0-00163e004c5e.jpeg","title":"资生堂","excerpt":"","type":1,"target":"816","hash":"","links":{"target":"http://api.eqingdan.com/v1/articles/816","html":"http://www.eqingdan.com/articles/816"}},{"featuredImageUrl":"http://img01.eqingdan.com/d6ef9628-91ba-11e6-8c75-00163e004c5e.png","title":"挂烫机","excerpt":"","type":1,"target":"774","hash":"","links":{"target":"http://api.eqingdan.com/v1/articles/774","html":"http://www.eqingdan.com/articles/774"}},{"featuredImageUrl":"http://img01.eqingdan.com/ca1871a2-8fcd-11e6-9c30-00163e004c5e.jpeg","title":"魔术擦","excerpt":"","type":1,"target":"808","hash":"","links":{"target":"http://api.eqingdan.com/v1/articles/808","html":"http://www.eqingdan.com/articles/808"}},{"featuredImageUrl":"http://img01.eqingdan.com/c414f8ce-8eac-11e6-b128-00163e002745.jpeg","title":"油烟机","excerpt":"","type":1,"target":"787","hash":"","links":{"target":"http://api.eqingdan.com/v1/articles/787","html":"http://www.eqingdan.com/articles/787"}},{"featuredImageUrl":"http://img01.eqingdan.com/73b96b7c-8d25-11e6-9d26-00163e004c5e.jpeg","title":"编辑之选","excerpt":"","type":1,"target":"801","hash":"","links":{"target":"http://api.eqingdan.com/v1/articles/801","html":"http://www.eqingdan.com/articles/801"}}]}}
         */

        private SlidesBean1 slides;

        public ChannelsBean1 getChannels() {
            return channels;
        }

        public void setChannels(ChannelsBean1 channels) {
            this.channels = channels;
        }

        public SlidesBean1 getSlides() {
            return slides;
        }

        public void setSlides(SlidesBean1 slides) {
            this.slides = slides;
        }

        public static class ChannelsBean1 {
            /**
             * code : 0
             * message : Success
             * data : {"channels":[{"title":"个护","type":"articles_belong_to_category","weight":140,"extra":{"category_id":"6","category_slug":"nursing"}},{"title":"视频","type":"articles_belong_to_collection","weight":130,"extra":{"collection_id":"108","collection_hash":"ryldnpjdn450"}},{"title":"家居","type":"articles_belong_to_category","weight":120,"extra":{"category_id":"2","category_slug":"housing"}},{"title":"彩妆","type":"articles_belong_to_category","weight":110,"extra":{"category_id":"751","category_slug":"cai-zhuang"}},{"title":"运动","type":"articles_belong_to_category","weight":100,"extra":{"category_id":"3","category_slug":"sports"}},{"title":"办公","type":"articles_belong_to_category","weight":90,"extra":{"category_id":"88","category_slug":"ban-gong"}},{"title":"厨房","type":"articles_belong_to_category","weight":80,"extra":{"category_id":"1","category_slug":"kitchen"}},{"title":"出行","type":"articles_belong_to_category","weight":70,"extra":{"category_id":"7","category_slug":"journey"}},{"title":"母婴","type":"articles_belong_to_category","weight":60,"extra":{"category_id":"8","category_slug":"mothercare"}},{"title":"数码","type":"articles_belong_to_category","weight":50,"extra":{"category_id":"5","category_slug":"digital"}},{"title":"餐酒","type":"articles_belong_to_category","weight":40,"extra":{"category_id":"4","category_slug":"food-baverage"}},{"title":"专题","type":"collections","weight":30},{"title":"宠物","type":"articles_belong_to_category","weight":20,"extra":{"category_id":"318","category_slug":"chong-wu"}},{"title":"礼物","type":"articles_belong_to_collection","weight":10,"extra":{"collection_id":"1","collection_hash":"9w3xq32nyd8r"}}]}
             */

            private BodyBean body;

            public BodyBean getBody() {
                return body;
            }

            public void setBody(BodyBean body) {
                this.body = body;
            }

            public static class BodyBean {
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
                     * title : 个护
                     * type : articles_belong_to_category
                     * weight : 140
                     * extra : {"category_id":"6","category_slug":"nursing"}
                     */

                    private List<ChannelsBean> channels;

                    public List<ChannelsBean> getChannels() {
                        return channels;
                    }

                    public void setChannels(List<ChannelsBean> channels) {
                        this.channels = channels;
                    }

                    public static class ChannelsBean {
                        private String title;
                        private String type;
                        private int weight;
                        /**
                         * category_id : 6
                         * category_slug : nursing
                         */

                        private ExtraBean extra;

                        public String getTitle() {
                            return title;
                        }

                        public void setTitle(String title) {
                            this.title = title;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public int getWeight() {
                            return weight;
                        }

                        public void setWeight(int weight) {
                            this.weight = weight;
                        }

                        public ExtraBean getExtra() {
                            return extra;
                        }

                        public void setExtra(ExtraBean extra) {
                            this.extra = extra;
                        }

                        public static class ExtraBean {
                            private String category_id;
                            private String category_slug;
                            private String collection_id;
                            private String collection_hash;

                            public String getCollection_id() {
                                return collection_id;
                            }

                            public void setCollection_id(String collection_id) {
                                this.collection_id = collection_id;
                            }

                            public String getCollection_hash() {
                                return collection_hash;
                            }

                            public void setCollection_hash(String collection_hash) {
                                this.collection_hash = collection_hash;
                            }

                            public String getCategory_id() {
                                return category_id;
                            }

                            public void setCategory_id(String category_id) {
                                this.category_id = category_id;
                            }

                            public String getCategory_slug() {
                                return category_slug;
                            }

                            public void setCategory_slug(String category_slug) {
                                this.category_slug = category_slug;
                            }
                        }
                    }
                }
            }
        }

        public static class SlidesBean1 {
            /**
             * code : 0
             * message : Success
             * data : {"slides":[{"featuredImageUrl":"http://img01.eqingdan.com/61fdc22a-94ff-11e6-a2d0-00163e004c5e.jpeg","title":"资生堂","excerpt":"","type":1,"target":"816","hash":"","links":{"target":"http://api.eqingdan.com/v1/articles/816","html":"http://www.eqingdan.com/articles/816"}},{"featuredImageUrl":"http://img01.eqingdan.com/d6ef9628-91ba-11e6-8c75-00163e004c5e.png","title":"挂烫机","excerpt":"","type":1,"target":"774","hash":"","links":{"target":"http://api.eqingdan.com/v1/articles/774","html":"http://www.eqingdan.com/articles/774"}},{"featuredImageUrl":"http://img01.eqingdan.com/ca1871a2-8fcd-11e6-9c30-00163e004c5e.jpeg","title":"魔术擦","excerpt":"","type":1,"target":"808","hash":"","links":{"target":"http://api.eqingdan.com/v1/articles/808","html":"http://www.eqingdan.com/articles/808"}},{"featuredImageUrl":"http://img01.eqingdan.com/c414f8ce-8eac-11e6-b128-00163e002745.jpeg","title":"油烟机","excerpt":"","type":1,"target":"787","hash":"","links":{"target":"http://api.eqingdan.com/v1/articles/787","html":"http://www.eqingdan.com/articles/787"}},{"featuredImageUrl":"http://img01.eqingdan.com/73b96b7c-8d25-11e6-9d26-00163e004c5e.jpeg","title":"编辑之选","excerpt":"","type":1,"target":"801","hash":"","links":{"target":"http://api.eqingdan.com/v1/articles/801","html":"http://www.eqingdan.com/articles/801"}}]}
             */

            private BodyBean body;

            public BodyBean getBody() {
                return body;
            }

            public void setBody(BodyBean body) {
                this.body = body;
            }

            public static class BodyBean {
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
                     * featuredImageUrl : http://img01.eqingdan.com/61fdc22a-94ff-11e6-a2d0-00163e004c5e.jpeg
                     * title : 资生堂
                     * excerpt :
                     * type : 1
                     * target : 816
                     * hash :
                     * links : {"target":"http://api.eqingdan.com/v1/articles/816","html":"http://www.eqingdan.com/articles/816"}
                     */

                    private List<SlidesBean> slides;

                    public List<SlidesBean> getSlides() {
                        return slides;
                    }

                    public void setSlides(List<SlidesBean> slides) {
                        this.slides = slides;
                    }

                    public static class SlidesBean {
                        private String featuredImageUrl;
                        private String title;
                        private String excerpt;
                        private int type;
                        private String target;
                        private String hash;
                        /**
                         * target : http://api.eqingdan.com/v1/articles/816
                         * html : http://www.eqingdan.com/articles/816
                         */

                        private LinksBean links;

                        public String getFeaturedImageUrl() {
                            return featuredImageUrl;
                        }

                        public void setFeaturedImageUrl(String featuredImageUrl) {
                            this.featuredImageUrl = featuredImageUrl;
                        }

                        public String getTitle() {
                            return title;
                        }

                        public void setTitle(String title) {
                            this.title = title;
                        }

                        public String getExcerpt() {
                            return excerpt;
                        }

                        public void setExcerpt(String excerpt) {
                            this.excerpt = excerpt;
                        }

                        public int getType() {
                            return type;
                        }

                        public void setType(int type) {
                            this.type = type;
                        }

                        public String getTarget() {
                            return target;
                        }

                        public void setTarget(String target) {
                            this.target = target;
                        }

                        public String getHash() {
                            return hash;
                        }

                        public void setHash(String hash) {
                            this.hash = hash;
                        }

                        public LinksBean getLinks() {
                            return links;
                        }

                        public void setLinks(LinksBean links) {
                            this.links = links;
                        }

                        public static class LinksBean {
                            private String target;
                            private String html;

                            public String getTarget() {
                                return target;
                            }

                            public void setTarget(String target) {
                                this.target = target;
                            }

                            public String getHtml() {
                                return html;
                            }

                            public void setHtml(String html) {
                                this.html = html;
                            }
                        }
                    }
                }
            }
        }
    }
}
