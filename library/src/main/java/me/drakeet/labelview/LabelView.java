package me.drakeet.labelview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.TextView;

/**
 * Created by drakeet(http://drakeet.me)
 * Date: 15/10/25 19:25
 */
public class LabelView extends TextView {

    private CharSequence mLeftText, mTopText, mRightText, mBottomText;
    private CharSequence mText;


    public LabelView(Context context) {
        this(context, null);
    }


    public LabelView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }


    public LabelView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.LabelView);
        mLeftText = a.getText(R.styleable.LabelView_left_text);
        mTopText = a.getText(R.styleable.LabelView_top_text);
        mRightText = a.getText(R.styleable.LabelView_right_text);
        mBottomText = a.getText(R.styleable.LabelView_bottom_text);
        a.recycle();

        setGravity(Gravity.CENTER);
        setText(super.getText());
    }


    @Override public void setText(CharSequence mainText, BufferType type) {
        mText = mainText;
        CharSequence text = mText;
        if (notNullOrEmpty(mLeftText)) {
            text = mLeftText.toString() + text;
        }
        if (notNullOrEmpty(mRightText)) {
            text = text + mRightText.toString();
        }
        if (notNullOrEmpty(mTopText)) {
            text = mTopText.toString() + "\n" + text;
        }
        if (notNullOrEmpty(mBottomText)) {
            text = text + "\n" + mBottomText.toString();
        }
        if (notNullOrEmpty(text) && !getText().equals(mainText)) {
            setText(text);
        }
    }


    private boolean notNullOrEmpty(CharSequence leftText) {
        return leftText != null && leftText.length() > 0;
    }


    @Override public CharSequence getText() {
        return mText;
    }
}
