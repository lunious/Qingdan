package lunioussky.qingdan.gui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import lunioussky.qingdan.entity.ResponseMainListData;

/**
 * Created by 11645 on 2016/12/9.
 */

public class CollectionsRecyclerViewAdapter extends BaseMainListRecycleViewAdapter<ResponseMainListData.DataBean.CollectionsBean> {

    public CollectionsRecyclerViewAdapter(Context context) {
        super(context);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        ResponseMainListData.DataBean.CollectionsBean nodesBean =getItem(position);
        myViewHolder.imageViewFrontTopImage.setImageURI(nodesBean.getFeaturedImageUrl());
        myViewHolder.textViewFrontMainTitle.setText(nodesBean.getTitle());
        myViewHolder.textViewFrontSubtitle.setText(nodesBean.getSubtitle());
        myViewHolder.linearBottomCount.setVisibility(View.GONE);
    }

}
