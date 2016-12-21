package lunioussky.qingdan.gui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import butterknife.BindView;
import butterknife.ButterKnife;
import lunioussky.qingdan.R;
import lunioussky.qingdan.entity.ResponseReputationThing;

/**
 * Created by Administrator on 2016/11/7.
 */

public class RankingThingAdapter extends BaseRecyclerViewAdapter<ResponseReputationThing.DataBean.ThingsBean> {


    public RankingThingAdapter(Context context) {
        super(context);
    }

    @Override
    protected int getFooterCount() {
        return 0;
    }

    @Override
    protected int getHeaderCount() {
        return 0;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item_ranking_thing, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ItemViewHolder viewHolder = (ItemViewHolder) holder;
        ResponseReputationThing.DataBean.ThingsBean bean = getItem(position);
        viewHolder.imgItemRankingThingCover.setImageURI(bean.getFeaturedImageUrl());
        viewHolder.tvItemRankingThingName.setText(bean.getFullName().replace(bean.getName(), ""));
        viewHolder.tvItemRankingThingTitle.setText(bean.getName());
        viewHolder.tvScoreNum.setText(getContext().getString(R.string.score_and_review, bean.getRatingScore() + "", bean.getReviewCount()));
        viewHolder.ratingScore.setRating(bean.getRatingScore());
    }

     class ItemViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.img_item_ranking_thing_cover)
        SimpleDraweeView imgItemRankingThingCover;
        @BindView(R.id.tv_item_ranking_thing_name)
        TextView tvItemRankingThingName;
        @BindView(R.id.tv_item_ranking_thing_title)
        TextView tvItemRankingThingTitle;
        @BindView(R.id.img_review)
        ImageView imgReview;
        @BindView(R.id.tv_review_btn)
        TextView tvReviewBtn;
        @BindView(R.id.ll_review)
        LinearLayout llReview;
        @BindView(R.id.rating_score)
        RatingBar ratingScore;
        @BindView(R.id.tv_score_num)
        TextView tvScoreNum;

         ItemViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
