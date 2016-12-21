package lunioussky.qingdan.gui.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import lunioussky.qingdan.R;
import lunioussky.qingdan.entity.ResponseMainListData;
import lunioussky.qingdan.entity.ResponseReputation;
import lunioussky.qingdan.gui.activity.RepuationThingActivity;

/**
 * Created by 11645 on 2016/12/9.
 */

public class NodesRecyclerViewAdapter extends BaseMainListRecyclerViewAdapter<ResponseMainListData.DataBean.NodesBean> {


    public NodesRecyclerViewAdapter(Context context) {
        super(context);
    }
    private List<ResponseReputation.DataBean.RankingsBean> rankings = new ArrayList<>();

    public void setRankings(List<ResponseReputation.DataBean.RankingsBean> rankings) {
        this.rankings.clear();
        this.rankings.addAll(rankings);
        notifyItemChanged(0);
    }

    @Override
    protected int getFooterCount() {
        return 1;
    }

    @Override
    protected int getHeaderCount() {
        return 1;
    }

    private static final int TYPE_CONTENT = 0;
    private static final int TYPE_FOOTER = 1;
    private static final int TYPE_HEADER = 2;

    @Override
    public int getItemViewType(int position) {
        if (position == getItemCount() - 1) {
            return TYPE_FOOTER;
        } else if (position == 0) {
            return TYPE_HEADER;
        }
        return TYPE_CONTENT;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == TYPE_HEADER) {
            return new HeaderViewHolder(inflater.inflate(R.layout.layout_head_enter_rankings, parent, false));
        }
        if (viewType == TYPE_CONTENT) {
            return new MyViewHolder(inflater.inflate(R.layout.main_list_item, parent, false));
        }
        return new FooterViewHolder(inflater.inflate(R.layout.subview_recycleview_loadfooter, parent, false));
    }

    private List<SimpleDraweeView> simpleDraweeViews;
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (position < getHeaderCount()) {
            //TODO 去设置头部视图的数据（如果需要）
            HeaderViewHolder headerViewHolder = (HeaderViewHolder) holder;

            if (headerViewHolder.llItemRankingEnter.getChildCount() == 0){//为了防止重复添加
                //根据口碑数据动态向一个线性容器里面添加view
                simpleDraweeViews = new ArrayList<>();
                for (final ResponseReputation.DataBean.RankingsBean ranking : rankings){
                    View view = inflater.inflate(R.layout.subview_reputation,headerViewHolder.llItemRankingEnter,false);
                    view.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v) {
                            //跳转到RepuationThingActivity
                            Intent intent = new Intent(getContext(), RepuationThingActivity.class);
                            intent.putExtra(RepuationThingActivity.RANKING_ID,ranking.getId());
                            getContext().startActivity(intent);
                        }
                    });
                    simpleDraweeViews.add((SimpleDraweeView) view.findViewById(R.id.img_ranking_all_topic_enter));
                    headerViewHolder.llItemRankingEnter.addView(view);
                }
            }
            for (int i = 0; i < headerViewHolder.llItemRankingEnter.getChildCount(); i++) {
                SimpleDraweeView view = (SimpleDraweeView) headerViewHolder.llItemRankingEnter.getChildAt(i).findViewById(R.id.img_ranking_all_topic_enter);
                view.setImageURI(rankings.get(i).getThumbnailImageUrl());
            }
            return;
        }
        if (position >= getItemCount() - getFooterCount()) {
            //TODO 去设置脚部视图的数据（如果需要）
            onBindFooterViewHolder(holder, position);
            return;
        }
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        ResponseMainListData.DataBean.NodesBean nodesBean = getItem(position);
        myViewHolder.imageViewFrontTopImage.setImageURI(nodesBean.getFeaturedImageUrl());
        myViewHolder.textViewFrontMainTitle.setText(nodesBean.getTitle());
        myViewHolder.textViewFrontSubtitle.setText(nodesBean.getSubtitle());
        myViewHolder.textViewFrontNumLiked.setText(nodesBean.getLikeCount() + "");
        myViewHolder.textViewNumReviews.setText(nodesBean.getHitCount() + "");

    }

    static class HeaderViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.ll_item_ranking_enter)
        LinearLayout llItemRankingEnter;
        @BindView(R.id.img_ranking_all_topic_enter)
        ImageView imgRankingAllTopicEnter;
        @BindView(R.id.hs_temp)
        HorizontalScrollView hsTemp;

        public HeaderViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
