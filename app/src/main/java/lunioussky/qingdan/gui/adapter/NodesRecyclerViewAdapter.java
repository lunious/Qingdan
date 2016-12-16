package lunioussky.qingdan.gui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import lunioussky.qingdan.R;
import lunioussky.qingdan.entity.ResponseMainListData;

/**
 * Created by 11645 on 2016/12/9.
 */

public class NodesRecyclerViewAdapter extends BaseMainListRecyclerViewAdapter<ResponseMainListData.DataBean.NodesBean> {
    private static final int TYPE_CONTENT = 0;
    private static final int TYPE_FOOTER = 1;
    public NodesRecyclerViewAdapter(Context context) {
        super(context);
    }

    @Override
    protected int getFooterCount() {
        return 1;
    }

    @Override
    protected int getHeaderCount() {
        return 0;
    }
    @Override
    public int getItemViewType(int position) {
        if (position == getItemCount() - 1) {
            return TYPE_FOOTER;
        }
        return TYPE_CONTENT;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == TYPE_CONTENT) {
            return new MyViewHolder(inflater.inflate(R.layout.main_list_item, parent, false));
        }
        return new FooterViewHolder(inflater.inflate(R.layout.subview_recycleview_loadfooter, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (position < getHeaderCount()){
            //TODO 去设置头部视图的数据（如果需要）
            return;
        }
        if (position >= getItemCount() - getFooterCount()){
            //TODO 去设置脚部视图的数据（如果需要）
            onBindFooterViewHolder(holder,position);
            return;
        }
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        ResponseMainListData.DataBean.NodesBean nodesBean = getItem(position);
        myViewHolder.imageViewFrontTopImage.setImageURI(nodesBean.getFeaturedImageUrl());
        myViewHolder.textViewFrontMainTitle.setText(nodesBean.getTitle());
        myViewHolder.textViewFrontSubtitle.setText(nodesBean.getSubtitle());
        myViewHolder.textViewFrontNumLiked.setText(nodesBean.getLikeCount()+"");
        myViewHolder.textViewNumReviews.setText(nodesBean.getHitCount()+"");

    }

}
