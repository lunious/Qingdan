package lunioussky.qingdan.gui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import lunioussky.qingdan.R;

/**
 * Created by Administrator on 2016/12/2.
 */

public class MainListFragment extends BaseFragment {
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @Override
    protected int getContentViewResId() {
        return R.layout.fragment_main_list;
    }

     /****代表是哪一种数据类型*****/
    private int categoryTag;
    private String urlTag;
    public static MainListFragment newInstance(int categoryTag,String urlTag){
        MainListFragment fragment = new MainListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("categoryTag",categoryTag);
        bundle.putString("urlTag",urlTag);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        Bundle bundle = getArguments();
        categoryTag = bundle.getInt("categoryTag");
        urlTag = bundle.getString("urlTag");

        Log.d("MainListFragment", "categoryTag:" + categoryTag);
        Log.d("MainListFragment", "urlTag:" + urlTag);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

}
