package com.kidsapp.fiver1.layout;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.customview.widget.ViewDragHelper;

import com.kidsapp.fiver1.helper.BitmapUtil;
import com.kidsapp.fiver1.helper.Block;
import com.kidsapp.fiver1.helper.DataHelper;


public class PuzzleLayout extends RelativeLayout {
    private ViewDragHelper viewDragHelper;
    private static final String TAG = PuzzleLayout.class.getSimpleName();
    private DataHelper mHelper;
    private Bitmap mDrawableBm = null;
    private int mSquareRootNum;
    private int mHeight;
    private int mWidth;
    private int mItemWidth;
    private int mItemHeight;
    private OnCompleteCallback mOnCompleteCallback;
    private MediaPlayer ring;

    public PuzzleLayout(Context context) {
        super(context);
        init();
    }


    public PuzzleLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public PuzzleLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {

        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            @Override
            public boolean onPreDraw() {
                mHeight = getHeight();
                mWidth = getWidth();
                getViewTreeObserver().removeOnPreDrawListener(this);
                if(mDrawableBm != null && mSquareRootNum != 0){
                    createChildren();
                }
                return false;
            }
        });
        mHelper = new DataHelper();

        viewDragHelper = ViewDragHelper.create(this, 1.0f, new ViewDragHelper.Callback() {
            @Override
            public boolean tryCaptureView(View child, int pointerId) {
                int index = indexOfChild(child);
                return mHelper.getScrollDirection(index) != DataHelper.N;
            }

            @Override
            public int clampViewPositionHorizontal(View child, int left, int dx) {

                int index = indexOfChild(child);
                int position = mHelper.getModel(index).position;
                int selfLeft = (position % mSquareRootNum) * mItemWidth;
                int leftEdge = selfLeft - mItemWidth;
                int rightEdge = selfLeft + mItemWidth;
                int direction = mHelper.getScrollDirection(index);
                //Log.d(TAG, "left " + left + " index" + index + " dx " + dx + " direction " + direction);
                switch (direction){
                    case DataHelper.L:
                        if(left <= leftEdge)
                            return leftEdge;
                        else if(left >= selfLeft)
                            return selfLeft;
                        else
                            return left;

                    case DataHelper.R:
                        if(left >= rightEdge)
                            return rightEdge;
                        else if (left <= selfLeft)
                            return selfLeft;
                        else
                            return left;
                    default:
                        return selfLeft;
                }
            }

            @Override
            public int clampViewPositionVertical(View child, int top, int dy) {
                int index = indexOfChild(child);
                Block model = mHelper.getModel(index);
                int position = model.position;

                int selfTop = (position / mSquareRootNum) * mItemHeight;
                int topEdge = selfTop - mItemHeight;
                int bottomEdge = selfTop + mItemHeight;
                int direction = mHelper.getScrollDirection(index);
                //Log.d(TAG, "top " + top + " index " + index + " direction " + direction);
                switch (direction){
                    case DataHelper.T:
                        if(top <= topEdge)
                            return topEdge;
                        else if (top >= selfTop)
                            return selfTop;
                        else
                            return top;
                    case DataHelper.B:
                        if(top >= bottomEdge)
                            return bottomEdge;
                        else if (top <= selfTop)
                            return selfTop;
                        else
                            return top;
                    default:
                        return selfTop;
                }
            }

            @Override
            public void onViewReleased(View releasedChild, float xvel, float yvel) {
                Log.d(TAG, "xvel " + xvel + " yvel " + yvel);
                int index = indexOfChild(releasedChild);
                boolean isCompleted = mHelper.swapValueWithInvisibleModel(index);
                Block item =  mHelper.getModel(index);
                viewDragHelper.settleCapturedViewAt(item.hPosition * mItemWidth, item.vPosition * mItemHeight);
                View invisibleView = getChildAt(0);
                ViewGroup.LayoutParams layoutParams = invisibleView.getLayoutParams();
                invisibleView.setLayoutParams(releasedChild.getLayoutParams());
                releasedChild.setLayoutParams(layoutParams);
                invalidate();
                if(isCompleted){
                    invisibleView.setVisibility(VISIBLE);
                    mOnCompleteCallback.onComplete();
                }
            }
        });
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event){
        return viewDragHelper.shouldInterceptTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        viewDragHelper.processTouchEvent(event);
        return true;
    }

    @Override
    public void computeScroll() {
        if(viewDragHelper.continueSettling(true)) {
            invalidate();
        }
    }

    public void setImage(Bitmap drawableBm, int squareRootNum){
        this.mSquareRootNum = squareRootNum;
        //this.mDrawableId = drawableId;
        this.mDrawableBm = drawableBm;
        if(mWidth != 0 && mHeight != 0){
            createChildren();
        }
    }

    private void createChildren(){
        removeAllViews();
        mHelper.setSquareRootNum(mSquareRootNum);

        DisplayMetrics dm = getResources().getDisplayMetrics();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = dm.densityDpi;
        //Bitmap resource = BitmapFactory.decodeResource(getResources(), mDrawableId, options);
        mDrawableBm = scaleBitmap(mDrawableBm,mWidth,mHeight);
        Bitmap resource = mDrawableBm;
        Bitmap bitmap = BitmapUtil.zoomImg(resource, mWidth, mHeight);
        resource.recycle();

        mItemWidth = mWidth / mSquareRootNum;

        mItemHeight = mHeight / mSquareRootNum;


        for (int i = 0; i < mSquareRootNum; i++){
            for (int j = 0; j < mSquareRootNum; j++){
                Log.d(TAG, "mItemWidth * x " + (mItemWidth * i));
                Log.d(TAG, "mItemWidth * y " + (mItemWidth * j));
                ImageView iv = new ImageView(getContext());
                iv.setScaleType(ImageView.ScaleType.FIT_XY);
                LayoutParams lp = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                lp.leftMargin = j * mItemWidth;
                lp.topMargin = i * mItemHeight;
                iv.setLayoutParams(lp);
                Bitmap b = Bitmap.createBitmap(bitmap, lp.leftMargin, lp.topMargin, mItemWidth, mItemHeight);
                iv.setImageBitmap(b);
                addView(iv);
            }
        }
        randomOrder();
    }

    public void randomOrder(){
        int num = mSquareRootNum * mSquareRootNum * 8;
        View invisibleView = getChildAt(0);
        View neighbor;
        for (int i = 0; i < num; i ++){
            int neighborPosition = mHelper.findNeighborIndexOfInvisibleModel();
            ViewGroup.LayoutParams invisibleLp = invisibleView.getLayoutParams();
            neighbor = getChildAt(neighborPosition);
            invisibleView.setLayoutParams(neighbor.getLayoutParams());
            neighbor.setLayoutParams(invisibleLp);
            mHelper.swapValueWithInvisibleModel(neighborPosition);
        }
        invisibleView.setVisibility(INVISIBLE);
    }

    public void setOnCompleteCallback(OnCompleteCallback onCompleteCallback){
        mOnCompleteCallback = onCompleteCallback;
    }

    public interface OnCompleteCallback{
        void onComplete();
    }

    public static Bitmap scaleBitmap(Bitmap bitmap, int newWidth, int newHeight) {

        Bitmap scaledBitmap = Bitmap.createBitmap(newWidth, newHeight, Bitmap.Config.ARGB_8888);

        float scaleX = newWidth / (float) bitmap.getWidth();
        float scaleY = newHeight / (float) bitmap.getHeight();
        float pivotX = 0;
        float pivotY = 0;

        Matrix scaleMatrix = new Matrix();

        scaleMatrix.setScale(scaleX, scaleY, pivotX, pivotY);

        Canvas canvas = new Canvas(scaledBitmap);
        canvas.setMatrix(scaleMatrix);
        canvas.drawBitmap(bitmap, 0, 0, new Paint(Paint.FILTER_BITMAP_FLAG));

        return scaledBitmap;
    }


}

