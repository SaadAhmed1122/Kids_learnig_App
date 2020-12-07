package com.kidsapp.fiver1.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class PuzzleView extends View {

    private Bitmap BM = null;
    private Paint mPaint;
    private Path drawingContext;

    public PuzzleView(Context context) {
        super(context);
        init(null);
        //mPaint = new Paint();
        //mPaint.setStyle(Paint.Style.FILL);
    }

    public PuzzleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(attrs);
    }

    public PuzzleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init(attrs);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public PuzzleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        init(attrs);
    }

    private void init(@Nullable AttributeSet set){

    }

    public void setBitmap(Bitmap bm){
        this.BM=bm;
        postInvalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.BLUE);
    }

    public static Bitmap scaleBitmap(Bitmap bitmapToScale, float newWidth, float newHeight) {
        if(bitmapToScale == null)
            return null;

        int width = bitmapToScale.getWidth();
        int height = bitmapToScale.getHeight();

        Matrix matrix = new Matrix();

        matrix.postScale(newWidth / width, newHeight / height);
        //matrix.postRotate(90);

        return Bitmap.createBitmap(bitmapToScale, 0, 0, bitmapToScale.getWidth(), bitmapToScale.getHeight(), matrix, true);
    }
}
