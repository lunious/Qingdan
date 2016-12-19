package lunioussky.qingdan.mvp.model.impl;

import com.alibaba.fastjson.JSON;

import lunioussky.qingdan.entity.ResponseArticleComments;
import lunioussky.qingdan.entity.ResponseArticleTitle;
import lunioussky.qingdan.entity.ResponseRelatedArticles;
import lunioussky.qingdan.mvp.model.ArticleDetailModel;
import lunioussky.qingdan.utils.Apis;
import lunioussky.qingdan.utils.UrlHandler;
import lunioussky.qingdan.utils.http.HttpUtils;
import lunioussky.qingdan.utils.http.Request;
import lunioussky.qingdan.utils.http.qingdan.HttpClient;

/**
 * Created by Administrator on 2016/12/19.
 */

public class ArticleDetailModelImpl implements ArticleDetailModel{
    private int articleId;
    private CallBack callBack;
    @Override
    public void loadDatas(int articleId, CallBack callBack) {
        this.articleId = articleId;
        this.callBack = callBack;
        loadArticleTitle();
        loadArticleDetail();
        loadComments();
        loadRrlatedArticles();
    }

    @Override
    public void loadArticleTitle() {
        String url = UrlHandler.handlUrl(Apis.URL_ARTICLE_TITLE,articleId);
        Request.Builder builder = new Request.Builder()
                .url(url)
                .get();
        HttpClient.excute(builder, new HttpUtils.Callback() {
            @Override
            public void onResponse(String response) {
                ResponseArticleTitle responseArticleTitle = JSON.parseObject(response, ResponseArticleTitle.class);
                callBack.loadArticleTitleSuccess(responseArticleTitle);
            }

            @Override
            public void onError() {

            }
        });
    }

    @Override
    public void loadArticleDetail() {
        callBack.loadArticleDetailSuccess(UrlHandler.handlUrl(Apis.URL_ARTICLE_TITLE,articleId));
    }

    @Override
    public void loadComments() {
        String url = UrlHandler.handlUrl(Apis.URL_ARTICLE_COMMENTS,articleId);
        Request.Builder builder = new Request.Builder()
                .url(url)
                .get();
        HttpClient.excute(builder, new HttpUtils.Callback() {
            @Override
            public void onResponse(String response) {
                ResponseArticleComments responseArticleComments = JSON.parseObject(response, ResponseArticleComments.class);
                callBack.loadCommentsSuccess(responseArticleComments);
            }

            @Override
            public void onError() {

            }
        });
    }

    @Override
    public void loadRrlatedArticles() {
        String url = UrlHandler.handlUrl(Apis.URL_RELATED_ARTICLE,articleId);
        Request.Builder builder = new Request.Builder()
                .url(url)
                .get();
        HttpClient.excute(builder, new HttpUtils.Callback() {
            @Override
            public void onResponse(String response) {
                ResponseRelatedArticles responseRelatedArticles = JSON.parseObject(response, ResponseRelatedArticles.class);
                callBack.loadRelatedArticlesSuccess(responseRelatedArticles.getData().getArticles());
            }

            @Override
            public void onError() {

            }
        });
    }
}
