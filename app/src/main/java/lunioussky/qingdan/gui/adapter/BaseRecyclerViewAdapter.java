package lunioussky.qingdan.gui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/16.
 */

public abstract class BaseRecyclerViewAdapter<T> extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private List<T> datas;
    protected LayoutInflater inflater;
    public BaseRecyclerViewAdapter(Context context) {
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
        return datas.size()+getHeaderCount() + getFooterCount();
    }
    //返回脚部视图的个数
    protected abstract int getFooterCount();
    //返回头部视图的个数
    protected abstract int getHeaderCount();


    //获取对应位置的数据
    public T getItem(int position){
        //TODO 到时候要考虑header和footer
        return datas.get(position);
    }

}
