package lunioussky.qingdan.mvp.presenter.impl;

import java.util.List;

import lunioussky.qingdan.entity.ResponseArticleComments;
import lunioussky.qingdan.entity.ResponseArticleTitle;
import lunioussky.qingdan.entity.ResponseRelatedArticles;
import lunioussky.qingdan.mvp.model.ArticleDetailModel;
import lunioussky.qingdan.mvp.model.impl.ArticleDetailModelImpl;
import lunioussky.qingdan.mvp.presenter.ArticleDetailPresenter;
import lunioussky.qingdan.mvp.view.ArticleDetailView;

/**
 * Created by Administrator on 2016/12/19.
 */

public class ArticleDetailPresenterImpl implements ArticleDetailPresenter {
    private ArticleDetailModel model;
    private ArticleDetailView view;

    public ArticleDetailPresenterImpl(ArticleDetailView view) {
        this.view = view;
        this.model = new ArticleDetailModelImpl();
    }

    @Override
    public void loadDatas(int articleId) {
        model.loadDatas(articleId, new ArticleDetailModel.CallBack() {
            @Override
            public void loadArticleTitleSuccess(ResponseArticleTitle articleTitle) {
                //收到Model的回调后，再通过View 显示界面
                view.showArticleTitle(articleTitle);
                //通知View显示总评论个数
                view.showCommentsCount(articleTitle.getData().getCommentCount());
                //通知View显示喜欢的个数
                view.showLikedCount(articleTitle.getData().getLikeCount());

                if (articleTitle.getData().getThingCount() > 0){
                    view.showLookUpGoods();
                }
            }

            @Override
            public void loadArticleDetailSuccess(String url) {
                view.showArticleDetail(url);
            }

            @Override
            public void loadCommentsSuccess(ResponseArticleComments responseArticleComments) {
                //通知View 显示评论区数据
                view.showArticleComments(responseArticleComments.getData().getComments());

            }

            @Override
            public void loadRelatedArticlesSuccess(List<ResponseRelatedArticles.DataBean.ArticlesBean> relatedArticles) {
                view.showRelatedArticle(relatedArticles);
            }
        });
    }
}
