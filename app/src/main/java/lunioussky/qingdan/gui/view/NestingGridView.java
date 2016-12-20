package lunioussky.qingdan.gui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

/**
 * Created by LG on 2016/11/3.
 * Tips:
 */

public class NestingGridView extends GridView{
    public NestingGridView(Context context) {
        super(context);
    }

    public NestingGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NestingGridView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        heightMeasureSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
