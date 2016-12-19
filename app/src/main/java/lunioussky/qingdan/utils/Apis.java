package lunioussky.qingdan.utils;

/**
 * Created by 11645 on 2016/12/18.
 */

public interface Apis {
    //主页 口碑对应接口
    String URL_REPUTATION = "http://api.eqingdan.com/v1/rankings/front";
    //文章详情对于接口
    String URL_ARTICLE_TITLE = "http://api.eqingdan.com/v1/articles/{0}";
    String URL_ARTICLE_DETAIL = "http://www.eqingdan.com/app/articles/{0}";
    String URL_ARTICLE_COMMENTS = "http://api.eqingdan.com/v1/comments/hot?target_type=article&target_id={0}&page=1&per_page=4";
    String URL_RELATED_ARTICLE = "http://api.eqingdan.com/v1/articles/{0}/related-articles";
}
