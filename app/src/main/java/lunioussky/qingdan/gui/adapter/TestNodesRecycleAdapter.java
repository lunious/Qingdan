package lunioussky.qingdan.gui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import lunioussky.qingdan.R;
import lunioussky.qingdan.entity.ResponseMainListData;

/**
 * Created by LG on 2016/10/26.
 * Tips:
 */
public class TestNodesRecycleAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private List<ResponseMainListData.DataBean.NodesBean> datas;

    protected LayoutInflater inflater;
    public TestNodesRecycleAdapter(Context context) {
        inflater = LayoutInflater.from(context);
        datas = new ArrayList<>();
    }
    private static final int TYPE_CONTENT = 0;
    private static final int TYPE_FOOTER = 1;

    public static final int STATE_LOADING = 1;
    public static final int STATE_FAILED = 2;
    public static final int STATE_NO_MORE_DATA = 3;
    private int state;
    public void updateFooterViewState(int state) {
        this.state = state;
        notifyDataSetChanged(); //刷新adapter
    }

    @Override
    public int getItemViewType(int position) {
        if(position == getItemCount() - 1){
            return TYPE_FOOTER;
        }
        return TYPE_CONTENT;
    }
    /**
     * 新增数据
     * @param datas
     */
    public void addDatas(List<ResponseMainListData.DataBean.NodesBean> datas){
        this.datas.addAll(datas);
        notifyDataSetChanged();
    }

    public ResponseMainListData.DataBean.NodesBean getItem(int position){
        //TODO  到时候要考虑header和footer
        return datas.get(position-getHeaderCount());
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == TYPE_CONTENT) {
            return new MyViewHolder(inflater.inflate(R.layout.main_list_item, parent, false));
        }
        return new FooterViewHoder(inflater.inflate(R.layout.subview_recycleview_loadfooter, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(position < getHeaderCount()){
            //TODO  去设置头部视图的数据(有需要的话)
            return;
        }
        if(position >= getItemCount()-getFooterCount()){
            //TODO  去设置脚部视图的数据(有需要的话)
            BaseMainListRecyclerViewAdapter.FooterViewHolder footerHolder = (BaseMainListRecyclerViewAdapter.FooterViewHolder) holder;
            switch (state){
                case STATE_LOADING:
                    footerHolder.progressbarSubviewRecycleviewLoadfooter.setVisibility(View.VISIBLE);
                    footerHolder.textviewSubviewRecycleviewLoadfooter.setVisibility(View.GONE);
                    break;
                case STATE_NO_MORE_DATA:
                    footerHolder.progressbarSubviewRecycleviewLoadfooter.setVisibility(View.GONE);
                    footerHolder.textviewSubviewRecycleviewLoadfooter.setVisibility(View.VISIBLE);
                    footerHolder.textviewSubviewRecycleviewLoadfooter.setText("没有更多数据了哦~");
                    break;
                case STATE_FAILED:
                    footerHolder.progressbarSubviewRecycleviewLoadfooter.setVisibility(View.GONE);
                    footerHolder.textviewSubviewRecycleviewLoadfooter.setVisibility(View.VISIBLE);
                    footerHolder.textviewSubviewRecycleviewLoadfooter.setText("加载失败，点击重试~");
                    break;
            }

            return;
        }
        BaseMainListRecyclerViewAdapter.MyViewHolder mHolder = (BaseMainListRecyclerViewAdapter.MyViewHolder) holder;
        ResponseMainListData.DataBean.NodesBean nodesBean = getItem(position);
        mHolder.imageViewFrontTopImage.setImageURI(nodesBean.getFeaturedImageUrl());
        mHolder.textViewFrontMainTitle.setText(nodesBean.getTitle());
        mHolder.textViewFrontSubtitle.setText(nodesBean.getSubtitle());
        mHolder.textViewFrontNumLiked.setText(nodesBean.getLikeCount()+"");
        mHolder.textViewNumReviews.setText(nodesBean.getHitCount()+"");

    }
    protected int getFooterCount() {
        return 1;
    }

    protected int getHeaderCount() {
        return 0;
    }
        @Override
    public int getItemCount() {
        //TODO  到时候要考虑header和footer
        return datas.size() + getHeaderCount() + getFooterCount();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.imageView_front_top_image)
        SimpleDraweeView imageViewFrontTopImage;
        @BindView(R.id.textView_front_main_title)
        TextView textViewFrontMainTitle;
        @BindView(R.id.textView_front_subtitle)
        TextView textViewFrontSubtitle;
        @BindView(R.id.textView_front_num_liked)
        TextView textViewFrontNumLiked;
        @BindView(R.id.textView_num_reviews)
        TextView textViewNumReviews;
        @BindView(R.id.rotate_textView_date)
        TextView rotateTextViewDate;
        @BindView(R.id.linear_bottom_count)
        LinearLayout linearBottomCount;

        MyViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
    static class FooterViewHoder extends RecyclerView.ViewHolder {
        @BindView(R.id.progressbar_subview_recycleview_loadfooter)
        ProgressBar progressbarSubviewRecycleviewLoadfooter;
        @BindView(R.id.textview_subview_recycleview_loadfooter)
        TextView textviewSubviewRecycleviewLoadfooter;
        @BindView(R.id.layout_subview_recycleview_loadfooter)
        RelativeLayout layoutSubviewRecycleviewLoadfooter;

        FooterViewHoder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
