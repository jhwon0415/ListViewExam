package com.example.jhwon.listviewexam;

import android.graphics.drawable.Drawable;

/**
 * Created by jhwon on 2016-06-29.
 */
public class ListViewItem {
    private Drawable drawable_icon;
    private String str_desc;
    private Drawable drawable_icon2;
    private String str_desc2;

    public Drawable getDrawable_icon2() {
        return drawable_icon2;
    }

    public void setDrawable_icon2(Drawable drawable_icon2) {
        this.drawable_icon2 = drawable_icon2;
    }

    public String getStr_desc2() {
        return str_desc2;
    }

    public void setStr_desc2(String str_desc2) {
        this.str_desc2 = str_desc2;
    }

    public Drawable getDrawable_icon() {
        return drawable_icon;
    }

    public void setDrawable_icon(Drawable drawable_icon) {
        this.drawable_icon = drawable_icon;
    }

    public String getStr_desc() {
        return str_desc;
    }

    public void setStr_desc(String str_desc) {
        this.str_desc = str_desc;
    }
}

