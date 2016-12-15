package lunioussky.qingdan.gui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
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

/**
 * Created by 11645 on 2016/12/16.
 */

public abstract class BaseMainListRecycleViewAdapter<T> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<T> datas;
    protected LayoutInflater inflater;
    public BaseMainListRecycleViewAdapter(Context context) {
        inflater = LayoutInflater.from(context);
        datas = new ArrayList<>();
    }
    //新增数据
    public void addDatas(List<T> datas){
        this.datas.addAll(datas);
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        //TODO 到时候要考虑header和footer
        return datas.size();
    }
    //获取对应位置的数据
    public T getItem(int position){
        //TODO 到时候要考虑header和footer
        return datas.get(position);
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
