package lunioussky.qingdan.gui.activity;

import android.util.Log;

import java.util.List;

import lunioussky.qingdan.R;
import lunioussky.qingdan.entity.ResponseArticleComments;
import lunioussky.qingdan.entity.ResponseArticleTitle;
import lunioussky.qingdan.entity.ResponseRelatedArticles;
import lunioussky.qingdan.mvp.presenter.ArticleDetailPresenter;
import lunioussky.qingdan.mvp.presenter.impl.ArticleDetailPresenterImpl;
import lunioussky.qingdan.mvp.view.ArticleDetailView;

/**
 * Created by Administrator on 2016/12/19.
 */

public class ArticleDetailActivity extends BaseActivity implements ArticleDetailView {
    private ArticleDetailPresenter presenter;
    private int articleId;
    @Override
    protected void initDatas() {
        presenter = new ArticleDetailPresenterImpl(this);
        //获取上一个界面传进来的文章id
        articleId = getIntent().getIntExtra("articleId",0);
        //调用ArticleDetailPresenter获取数据的方法
        presenter.loadDatas(articleId);
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected int getContentViewResId() {
        return R.layout.activity_article_detail;
    }

    @Override
    public void showArticleTitle(ResponseArticleTitle articleTitle) {
        Log.d("ArticleDetailActivity", "showArticleTitle:"+articleTitle.getData().getAuthor().getNickname());
    }

    @Override
    public void showArticleDetail(String url) {
        Log.d("ArticleDetailActivity", "showArticleDetail:"+url);

    }

    @Override
    public void showArticleComments(List<ResponseArticleComments.DataBean.CommentsBean> comments) {
        Log.d("ArticleDetailActivity", "showArticleComments:"+comments.size());
    }

    @Override
    public void showRelatedArticle(List<ResponseRelatedArticles.DataBean.ArticlesBean> articles) {
        Log.d("ArticleDetailActivity", "showRelatedArticle:"+articles.size());
    }

    @Override
    public void showLookUpGoods() {

    }

    @Override
    public void showLikedCount(int likedCount) {
        Log.d("ArticleDetailActivity", "showLikedCount:"+likedCount);
    }

    @Override
    public void showCommentsCount(int commentsCount) {
        Log.d("ArticleDetailActivity", "showCommentsCount:"+commentsCount);
    }
}
