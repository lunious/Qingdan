package lunioussky.qingdan.gui.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.CheckedTextView;

import java.util.ArrayList;
import java.util.List;

import lunioussky.qingdan.R;
import lunioussky.qingdan.gui.adapter.MainFragmentPagerAdapter;
import lunioussky.qingdan.gui.fragment.CategoryFragment;
import lunioussky.qingdan.gui.fragment.MineFragment;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private ViewPager mViewPager;
    /**装底部3个标签id的数组**/
    private int[] mTabIds;
    /**装底部3个标签对象的数组**/
    private CheckedTextView[] mTabs;
    private MainFragmentPagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initDatas() {
    }

    @Override
    protected void initViews() {
        mViewPager = findViewByIdNoCast(R.id.viewpage_main);
        mTabIds = new int[]{R.id.checkedTextView_home_list,R.id.checkedTextView_home_category,
                              R.id.checkedTextView_home_mine};
        mTabs = new CheckedTextView[mTabIds.length];
        for (int i = 0; i < mTabs.length; i++) {
            mTabs[i] = findViewByIdNoCast(mTabIds[i]);
            mTabs[i].setOnClickListener(this);
        }
        mPagerAdapter = new MainFragmentPagerAdapter(getFragments(),getSupportFragmentManager());
        mViewPager.setAdapter(mPagerAdapter);
        mViewPager.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener(){
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                showPage(position);
            }
        });
        showPage(0);
    }
    private List<Fragment> getFragments(){
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(new ListFragment());
        fragments.add(new CategoryFragment());
        fragments.add(new MineFragment());
        return fragments;
    }

    @Override
    protected int getContentViewResId() {
        return R.layout.activity_main;
    }

    @Override
    public void onClick(View v) {
        for (int i = 0; i < mTabs.length; i++) {
            if (mTabs[i] == v){
                //或者到点击的是第几个选项
                showPage(i);
                return;
            }
        }
    }

    /**
     * 显示第几页
     * */
    private void showPage(int index) {
        if (mTabs[index].isChecked()) return;;
        for (int i = 0; i < mTabs.length; i++) {
            if (i == index){
                mTabs[i].setChecked(true);
            }else {
                mTabs[i].setChecked(false);
            }
        }
        mViewPager.setCurrentItem(index);
    }
}
