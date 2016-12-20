package lunioussky.qingdan.mvp.view;

import java.util.List;

import lunioussky.qingdan.entity.ResponseArticleComments;
import lunioussky.qingdan.entity.ResponseArticleTitle;
import lunioussky.qingdan.entity.ResponseRelatedArticles;

/**
 * Created by Administrator on 2016/12/19.
 */

public interface ArticleDetailView {
    //显示文章标题区域
    void showArticleTitle(ResponseArticleTitle articleTitle);
    //显示文章详情
    void showArticleDetail(String url);
    //显示文章评论
    void showArticleComments(List<ResponseArticleComments.DataBean.CommentsBean> comments);
    //显示相关文章
    void showRelatedArticle(List<ResponseRelatedArticles.DataBean.ArticlesBean> articles);

    void showLookUpGoods();
    void showLikedCount(int likedCount);
    void showCommentsCount(int commentsCount);
    void showNoComments();

    void showMoreCommentsView();
}
