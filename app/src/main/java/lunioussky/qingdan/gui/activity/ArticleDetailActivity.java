package lunioussky.qingdan.gui.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
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
    @BindView(R.id.imageView_back_subview_title)
    ImageView imageViewBackSubviewTitle;
    @BindView(R.id.imageView_big_subview_article_title)
    SimpleDraweeView imageViewBigSubviewArticleTitle;
    @BindView(R.id.textView_tag_subview_article_title)
    TextView textViewTagSubviewArticleTitle;
    @BindView(R.id.textView_title_subview_article_title)
    TextView textViewTitleSubviewArticleTitle;
    @BindView(R.id.imageView_author_subview_article_title)
    SimpleDraweeView imageViewAuthorSubviewArticleTitle;
    @BindView(R.id.textView_author_nickname_subview_article_title)
    TextView textViewAuthorNicknameSubviewArticleTitle;
    @BindView(R.id.textView_publish_time_subview_article_title)
    TextView textViewPublishTimeSubviewArticleTitle;
    @BindView(R.id.textView_author_tag_subview_article_title)
    TextView textViewAuthorTagSubviewArticleTitle;
    @BindView(R.id.textView_like_count)
    TextView textViewLikeCount;
    @BindView(R.id.layout_like_count)
    LinearLayout layoutLikeCount;
    @BindView(R.id.textView_comments_count)
    TextView textViewCommentsCount;
    @BindView(R.id.layout_comments_count)
    LinearLayout layoutCommentsCount;
    @BindView(R.id.layout_shared)
    LinearLayout layoutShared;
    @BindView(R.id.textView_lookup_goods)
    TextView textViewLookupGoods;
    private ArticleDetailPresenter presenter;
    private int articleId;

    @Override
    protected void initDatas() {
        presenter = new ArticleDetailPresenterImpl(this);
        //获取上一个界面传进来的文章id
        articleId = getIntent().getIntExtra("articleId", 0);
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
        Log.d("ArticleDetailActivity", "showArticleTitle:" + articleTitle.getData().getAuthor().getNickname());
        imageViewBigSubviewArticleTitle.setImageURI(articleTitle.getData().getFeaturedImageUrl());
        textViewTitleSubviewArticleTitle.setText(articleTitle.getData().getTitle());
        imageViewAuthorSubviewArticleTitle.setImageURI(articleTitle.getData().getAuthor().getAvatarUrl());
        textViewAuthorNicknameSubviewArticleTitle.setText(articleTitle.getData().getAuthor().getNickname());
        textViewAuthorTagSubviewArticleTitle.setText(articleTitle.getData().getAuthor().getTagline());
        textViewPublishTimeSubviewArticleTitle.setText(articleTitle.getData().getPublishedAtDiffForHumans());
        if (articleTitle.getData().getCategories() != null && articleTitle.getData().getCategories().size() != 0){
            textViewTagSubviewArticleTitle.setText(articleTitle.getData().getCategories().get(0).getName());
        }
    }

    @Override
    public void showArticleDetail(String url) {
        Log.d("ArticleDetailActivity", "showArticleDetail:" + url);

    }

    @Override
    public void showArticleComments(List<ResponseArticleComments.DataBean.CommentsBean> comments) {
        Log.d("ArticleDetailActivity", "showArticleComments:" + comments.size());
    }

    @Override
    public void showRelatedArticle(List<ResponseRelatedArticles.DataBean.ArticlesBean> articles) {
        Log.d("ArticleDetailActivity", "showRelatedArticle:" + articles.size());
    }

    @Override
    public void showLookUpGoods() {
        textViewLookupGoods.setVisibility(View.VISIBLE);
    }

    @Override
    public void showLikedCount(int likedCount) {
        Log.d("ArticleDetailActivity", "showLikedCount:" + likedCount);
        textViewLikeCount.setText(getString(R.string.like_count,likedCount));
    }

    @Override
    public void showCommentsCount(int commentsCount) {
        Log.d("ArticleDetailActivity", "showCommentsCount:" + commentsCount);
        textViewCommentsCount.setText(getString(R.string.comments_count,commentsCount));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.imageView_back_subview_title, R.id.layout_like_count, R.id.layout_comments_count, R.id.layout_shared, R.id.textView_lookup_goods})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageView_back_subview_title:
                finish();
                break;
            case R.id.layout_like_count:
                break;
            case R.id.layout_comments_count:
                break;
            case R.id.layout_shared:
                break;
            case R.id.textView_lookup_goods:
                break;
        }
    }
}
