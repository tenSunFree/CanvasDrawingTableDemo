package com.example.administrator.canvasdrawingtabledemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class BasisView extends View {

    private Context context;
    private Paint paint;
    private int width1;
    private int width2;
    private int width3;
    private int height1;
    private int height2;
    private int height3;
    private int height4;
    private int height5;

    public BasisView(Context context) {
        super(context);
        this.context = context;
    }

    public BasisView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    public BasisView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        lengthAndWidthParametersOfTheCanvas(canvas);
        initializeTheCanvasAndBrush(canvas);
        outerFrameEdge(canvas);
        distinguishTheSeparationLinesOfTheTopAndBottomTables(canvas);
        upperPartTable(canvas);
        thickLineOfTheLowerHalfOfTheTable(canvas);
        thinLineOfTheLowerHalfOfTheTable(canvas);
        horizontalLineOfTheLowerHalfOfTheTable(canvas);
    }

    private void lengthAndWidthParametersOfTheCanvas(Canvas canvas) {
        width1 = canvas.getWidth();
        width2 = width1 - 8;
        width3 = width2 / 30;
        height1 = canvas.getHeight();
        height2 = (int) (height1 * 0.66);
        height3 = height2 - 7;
        height4 = (height2 - 7) / 6;
        height5 = (height1 - height2 - 7) / 6;
    }

    private void initializeTheCanvasAndBrush(Canvas canvas) {
        canvas.drawColor(0xFF0444BF);                                                               // 畫布背景設置
        paint = new Paint();
        paint.setColor(0xFFEDF259);                                                                 // 設置畫筆顏色
        paint.setStyle(Paint.Style.FILL_AND_STROKE);                                              // 設置填充樣式
        paint.setStrokeWidth(1);                                                                    // 設置畫筆寬度
    }

    private void outerFrameEdge(Canvas canvas) {
        canvas.drawLine(0, 0, 0, height1, paint);
        canvas.drawLine(1, 0, 1, height1, paint);
        canvas.drawLine(2, 0, 2, height1, paint);
        canvas.drawLine(3, 0, 3, height1, paint);
        canvas.drawLine(width1, 0, width1, height1, paint);
        canvas.drawLine(width1 - 1, 0, width1 - 1, height1, paint);
        canvas.drawLine(width1 - 2, 0, width1 - 2, height1, paint);
        canvas.drawLine(width1 - 3, 0, width1 - 3, height1, paint);
        canvas.drawLine(0, 0, width1, 0, paint);
        canvas.drawLine(0, 1, width1, 1, paint);
        canvas.drawLine(0, 2, width1, 2, paint);
        canvas.drawLine(0, 3, width1, 3, paint);
        canvas.drawLine(0, height1 - 3, width1, height1 - 3, paint);
        canvas.drawLine(0, height1 - 2, width1, height1 - 2, paint);
        canvas.drawLine(0, height1 - 1, width1, height1 - 1, paint);
        canvas.drawLine(0, height1, width1, height1, paint);
    }

    private void distinguishTheSeparationLinesOfTheTopAndBottomTables(Canvas canvas) {
        canvas.drawLine(0, height2 - 3, width1, height2 - 3, paint);
        canvas.drawLine(0, height2 - 2, width1, height2 - 2, paint);
        canvas.drawLine(0, height2 - 1, width1, height2 - 1, paint);
        canvas.drawLine(0, height2, width1, height2, paint);
        canvas.drawLine(0, height2 + 1, width1, height2 + 1, paint);
        canvas.drawLine(0, height2 + 2, width1, height2 + 2, paint);
        canvas.drawLine(0, height2 + 3, width1, height2 + 3, paint);
    }

    private void upperPartTable(Canvas canvas) {
        for (int width = 3; width <= width2; width += width3) {
            if (width != 3) {
                canvas.drawLine(width, 0, width, height2, paint);
            }
        }
        for (int hight = 3; hight <= height3; hight += height4) {
            if (hight != 3) {
                canvas.drawLine(0, hight, width1, hight, paint);
            }
        }
    }

    private void thickLineOfTheLowerHalfOfTheTable(Canvas canvas) {
        canvas.drawLine(3 + (10 * width3) + 2, height2, 3 + (10 * width3) + 2, height1, paint);
        canvas.drawLine(3 + (10 * width3) + 1, height2, 3 + (10 * width3) + 1, height1, paint);
        canvas.drawLine(3 + (10 * width3), height2, 3 + (10 * width3), height1, paint);
        canvas.drawLine(3 + (10 * width3) - 1, height2, 3 + (10 * width3) - 1, height1, paint);
        canvas.drawLine(3 + (10 * width3) - 2, height2, 3 + (10 * width3) - 2, height1, paint);
        canvas.drawLine(3 + (20 * width3) + 2, height2, 3 + (20 * width3) + 2, height1, paint);
        canvas.drawLine(3 + (20 * width3) + 1, height2, 3 + (20 * width3) + 1, height1, paint);
        canvas.drawLine(3 + (20 * width3), height2, 3 + (20 * width3), height1, paint);
        canvas.drawLine(3 + (20 * width3) - 1, height2, 3 + (20 * width3) - 1, height1, paint);
        canvas.drawLine(3 + (20 * width3) - 2, height2, 3 + (20 * width3) - 2, height1, paint);
        canvas.drawLine(3 + (30 * width3) + 2, height2, 3 + (30 * width3) + 2, height1, paint);
        canvas.drawLine(3 + (30 * width3) + 1, height2, 3 + (30 * width3) + 1, height1, paint);
        canvas.drawLine(3 + (30 * width3), height2, 3 + (30 * width3), height1, paint);
        canvas.drawLine(3 + (30 * width3) - 1, height2, 3 + (30 * width3) - 1, height1, paint);
        canvas.drawLine(3 + (30 * width3) - 2, height2, 3 + (30 * width3) - 2, height1, paint);
    }

    private void thinLineOfTheLowerHalfOfTheTable(Canvas canvas) {
        for (int i = 1; i <= 10; i++) {
            canvas.drawLine(3 + (i * width3), height2, 3 + (i * width3), height1, paint);
            canvas.drawLine(3 + ((i + 10) * width3), height2, 3 + ((i + 10) * width3), height1, paint);
            canvas.drawLine(3 + ((i + 20) * width3), height2, 3 + ((i + 20) * width3), height1, paint);
        }
        for (int i = 1; i <= 20; i++) {
            canvas.drawLine(3 + (i * width3 / 2), height2, 3 + (i * width3 / 2), height1, paint);
            canvas.drawLine(3 + ((i + 20) * width3 / 2), height2, 3 + ((i + 20) * width3 / 2), height1, paint);
            canvas.drawLine(3 + ((i + 40) * width3 / 2), height2, 3 + ((i + 40) * width3 / 2), height1, paint);
        }
    }

    private void horizontalLineOfTheLowerHalfOfTheTable(Canvas canvas) {
        for (int hight = height2 + 3; hight <= height1 - 3; hight += height5) {
            if (hight != height2 + 3) {
                canvas.drawLine(0, hight, width1, hight, paint);
            }
        }
    }
}
