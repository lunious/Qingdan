package lunioussky.qingdan.test;

import android.util.Log;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import lunioussky.qingdan.entity.ResponseArticleComments;
import lunioussky.qingdan.entity.ResponseArticleTitle;
import lunioussky.qingdan.entity.ResponseRelatedArticles;
import lunioussky.qingdan.mvp.presenter.ArticleDetailPresenter;
import lunioussky.qingdan.mvp.presenter.impl.ArticleDetailPresenterImpl;
import lunioussky.qingdan.mvp.view.ArticleDetailView;

/**
 * Created by Administrator on 2016/12/19.
 */
public class ArticleDetailPresenterImplTest implements ArticleDetailView {
    private ArticleDetailPresenter presenter;
    @Before
    public void setUp() throws Exception {
        presenter = new ArticleDetailPresenterImpl(this);
    }

    @Test
    public void loadDatas() throws Exception {
        presenter.loadDatas(806);
    }

    @Override
    public void showArticleTitle(ResponseArticleTitle articleTitle) {
        Log.d("ArticleDetailPresenterI", articleTitle.getData().getTitle());
    }

    @Override
    public void showArticleDetail(String url) {
        Log.d("ArticleDetailPresenterI", url);
    }

    @Override
    public void showArticleComments(List<ResponseArticleComments.DataBean.CommentsBean> comments) {
        Log.d("ArticleDetailPresenterI", "comments.size():" + comments.size());
    }

    @Override
    public void showRelatedArticle(List<ResponseRelatedArticles.DataBean.ArticlesBean> articles) {
        Log.d("ArticleDetailPresenterI", "articles.size():" + articles.size());
    }

    @Override
    public void showLookUpGoods() {
        Log.d("ArticleDetailPresenterI", "showLookUpGoods");
    }

    @Override
    public void showLikedCount(int likedCount) {
        Log.d("ArticleDetailPresenterI", "likedCount:" + likedCount);
        Assert.assertEquals(30,likedCount);
    }

    @Override
    public void showCommentsCount(int commentsCount) {
        Log.d("ArticleDetailPresenterI", "commentsCount:" + commentsCount);
    }
}