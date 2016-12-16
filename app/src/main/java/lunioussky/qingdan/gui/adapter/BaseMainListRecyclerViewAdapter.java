package lunioussky.qingdan.gui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import butterknife.BindView;
import butterknife.ButterKnife;
import lunioussky.qingdan.R;

/**
 * Created by 11645 on 2016/12/16.
 */

public abstract class BaseMainListRecyclerViewAdapter<T> extends BaseRecyclerViewAdapter<T> {

    public BaseMainListRecyclerViewAdapter(Context context) {
        super(context);
    }

    public static final int STATE_LOADING = 1;
    public static final int STATE_FAILED = 2;
    public static final int STATE_NO_MORE_DATA = 3;
    private int state;
    public void updateFooterViewState(int state) {
        this.state = state;
        notifyDataSetChanged();//刷新Adapter
    }

    public void onBindFooterViewHolder(RecyclerView.ViewHolder holder, int position){
        FooterViewHolder footerHolder = (FooterViewHolder) holder;
        switch (state){
            case STATE_LOADING:
                footerHolder.progressbarSubviewRecycleviewLoadfooter.setVisibility(View.VISIBLE);
                footerHolder.textviewSubviewRecycleviewLoadfooter.setVisibility(View.GONE);
                break;
            case STATE_FAILED:
                footerHolder.progressbarSubviewRecycleviewLoadfooter.setVisibility(View.GONE);
                footerHolder.textviewSubviewRecycleviewLoadfooter.setVisibility(View.VISIBLE);
                footerHolder.textviewSubviewRecycleviewLoadfooter.setText("没有更多数据了亲~");
                break;
            case STATE_NO_MORE_DATA:
                footerHolder.progressbarSubviewRecycleviewLoadfooter.setVisibility(View.GONE);
                footerHolder.textviewSubviewRecycleviewLoadfooter.setVisibility(View.VISIBLE);
                footerHolder.textviewSubviewRecycleviewLoadfooter.setText("加载失败，点击重试~");
                break;
        }
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
    public  class FooterViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.progressbar_subview_recycleview_loadfooter)
        ProgressBar progressbarSubviewRecycleviewLoadfooter;
        @BindView(R.id.textview_subview_recycleview_loadfooter)
        TextView textviewSubviewRecycleviewLoadfooter;
        @BindView(R.id.layout_subview_recycleview_loadfooter)
        RelativeLayout layoutSubviewRecycleviewLoadfooter;

        FooterViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
            textviewSubviewRecycleviewLoadfooter.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    if (listener != null){
                        listener.onRetryClick();//告诉fragment重试的按钮被点击了
                    }
                }
            });
        }
    }
        public interface OnRetryClickListener{
            void onRetryClick();
        }
        private OnRetryClickListener listener;
        public  void setOnRetryClickListener(OnRetryClickListener listener){
            this.listener = listener;
        }
    }
