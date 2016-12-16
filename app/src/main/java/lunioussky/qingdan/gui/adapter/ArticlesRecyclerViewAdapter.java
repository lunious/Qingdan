package lunioussky.qingdan.gui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import lunioussky.qingdan.entity.ResponseMainListData;

/**
 * Created by 11645 on 2016/12/9.
 */

public class ArticlesRecyclerViewAdapter extends BaseMainListRecycleViewAdapter<ResponseMainListData.DataBean.ArticlesBean> {

    public ArticlesRecyclerViewAdapter(Context context) {
        super(context);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        ResponseMainListData.DataBean.ArticlesBean nodesBean = getItem(position);
        myViewHolder.imageViewFrontTopImage.setImageURI(nodesBean.getFeaturedImageUrl());
        myViewHolder.textViewFrontMainTitle.setText(nodesBean.getTitle());
        myViewHolder.textViewFrontSubtitle.setText(nodesBean.getSubtitle());
        myViewHolder.textViewFrontNumLiked.setText(nodesBean.getLikeCount()+"");
        myViewHolder.textViewNumReviews.setText(nodesBean.getHitCount()+"");

    }


}
