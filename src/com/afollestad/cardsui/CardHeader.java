package com.afollestad.cardsui;

import android.content.Context;

/**
 * @author Aidan Follestad (afollestad)
 */
public class CardHeader extends Card {

    public CardHeader(String title) {
        super(title, true);
    }

    public CardHeader(Context context, int titleRes) {
        this(context.getString(titleRes));
    }

    private String mActionTitle;
    private ActionListener mCallback;

    public interface ActionListener {
        public void onClick(CardHeader header);
    }

    public CardHeader setAction(String title, ActionListener callback) {
        mActionTitle = title;
        mCallback = callback;
        return this;
    }

    public CardHeader setAction(Context context, int titleRes, ActionListener callback) {
        setAction(context.getString(titleRes), callback);
        return this;
    }

    public String getActionTitle() {
        return mActionTitle;
    }

    public ActionListener getActionCallback() {
        return mCallback;
    }
}