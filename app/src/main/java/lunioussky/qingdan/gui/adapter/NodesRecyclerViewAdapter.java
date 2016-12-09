package lunioussky.qingdan.gui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import lunioussky.qingdan.R;
import lunioussky.qingdan.entity.ResponseNodes;

/**
 * Created by 11645 on 2016/12/9.
 */

public class NodesRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<ResponseNodes.DataBean.NodesBean> datas;
    private LayoutInflater inflater;

    public NodesRecyclerViewAdapter(Context context) {
        this.datas = new ArrayList<>();
        inflater = LayoutInflater.from(context);
    }

    //新增数据
    public void addDatas(List<ResponseNodes.DataBean.NodesBean> datas) {
        this.datas.addAll(datas);
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.main_list_item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        ResponseNodes.DataBean.NodesBean nodesBean = datas.get(position);
        myViewHolder.imageViewFrontTopImage.setImageURI(nodesBean.getFeaturedImageUrl());
        myViewHolder.textViewFrontMainTitle.setText(nodesBean.getTitle());
        myViewHolder.textViewFrontSubtitle.setText(nodesBean.getSubtitle());
        myViewHolder.textViewFrontNumLiked.setText(nodesBean.getLikeCount()+"");
        myViewHolder.textViewNumReviews.setText(nodesBean.getHitCount()+"");

    }


    @Override
    public int getItemCount() {
        return datas.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.imageView_front_top_image)
        SimpleDraweeView imageViewFrontTopImage;
        @BindView(R.id.view_temp)
        View viewTemp;
        @BindView(R.id.textView_front_main_title)
        TextView textViewFrontMainTitle;
        @BindView(R.id.textView_front_subtitle)
        TextView textViewFrontSubtitle;
        @BindView(R.id.imageView_front_like)
        ImageView imageViewFrontLike;
        @BindView(R.id.textView_front_num_liked)
        TextView textViewFrontNumLiked;
        @BindView(R.id.textView_num_reviews)
        TextView textViewNumReviews;
        @BindView(R.id.linear_bottom_count)
        LinearLayout linearBottomCount;
        @BindView(R.id.linear_temp)
        LinearLayout linearTemp;
        @BindView(R.id.rotate_textView_date)
        TextView rotateTextViewDate;
        @BindView(R.id.rela_temp)
        RelativeLayout relaTemp;
        @BindView(R.id.rela_special_tag)
        TextView relaSpecialTag;

        MyViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
