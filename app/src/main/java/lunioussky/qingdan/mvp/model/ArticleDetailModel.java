package lunioussky.qingdan.mvp.model;

import java.util.List;

import lunioussky.qingdan.entity.ResponseArticleComments;
import lunioussky.qingdan.entity.ResponseArticleTitle;
import lunioussky.qingdan.entity.ResponseRelatedArticles;

/**
 * Created by Administrator on 2016/12/19.
 */

public interface ArticleDetailModel {
    void loadDatas(int articleId,CallBack callBack);
    void loadArticleTitle();
    void loadArticleDetail();
    void loadComments();
    void loadRelatedArticles();
    public interface CallBack{
        void loadArticleTitleSuccess(ResponseArticleTitle articleTitle);
        void loadArticleDetailSuccess(String url);
        void loadCommentsSuccess(ResponseArticleComments responseArticleComments);
        void loadRelatedArticlesSuccess(List<ResponseRelatedArticles.DataBean.ArticlesBean> relatedArticles);

        void loadFailed();
    }
}
