package com.hongyang51.code4hencoder.day1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by 谢彦斌 on 2017/11/8.
 * 修改时间:
 * 版本号: 1.0.0
 * 修改人:
 */

public class PathView extends View {
    public PathView(Context context) {
        super(context);
        init();
    }


    public PathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public PathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public PathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private Paint paint;
    private Path path;

    private void init() {
        paint = new Paint();
        path = new Path();
        //画出一下心
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            path.addArc(200, 200, 400, 400, -225, 225);
//            path.arcTo(400, 200, 600, 400, -180, 225, false);
//        }
//        path.lineTo(400, 542);
        //画出一个圆
        path.addCircle(300, 300, 200, Path.Direction.CW);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(path, paint);//画出一个心
    }
}
