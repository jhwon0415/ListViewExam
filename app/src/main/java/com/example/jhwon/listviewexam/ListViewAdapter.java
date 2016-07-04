package com.example.jhwon.listviewexam;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by jhwon on 2016-06-29.
 */
public class ListViewAdapter extends BaseAdapter {
    private ArrayList<ListViewItem> listview_array;
    private Context mContext = null;
    private LayoutInflater mInflater = null;


    public ListViewAdapter(Context mContext){
        this.mContext = mContext;
        this.mInflater =
                (LayoutInflater) this.mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        listview_array = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return listview_array.size();
    }

    @Override
    public Object getItem(int i) {
        return listview_array.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewholder;
        ListViewItem item;
        if(view == null){
            view = mInflater.inflate(R.layout.list_item,viewGroup,false);
            viewholder = new ViewHolder();

            TextView mTextView = (TextView) view.findViewById(R.id.id_text);
            ImageView mImageView = (ImageView) view.findViewById(R.id.id_img);
            TextView mTextView2 = (TextView) view.findViewById(R.id.id_text2);
            ImageView mImageView2 = (ImageView) view.findViewById(R.id.id_img2);

            viewholder.setmTextView(mTextView);
            viewholder.setmImageView(mImageView);
            viewholder.setmTextView2(mTextView2);
            viewholder.setmImageView2(mImageView2);

            view.setTag(viewholder);
        }else{
            viewholder = (ViewHolder) view.getTag();
        }

        item = listview_array.get(i);

        viewholder.getmTextView().setText(item.getStr_desc());
        viewholder.getmImageView().setImageDrawable(item.getDrawable_icon());
        viewholder.getmTextView2().setText(item.getStr_desc2());
        viewholder.getmImageView2().setImageDrawable(item.getDrawable_icon2());

        return view;
    }

//    @Override
//    public View getView(int i, View view, ViewGroup viewGroup) {
//        ListViewItem item;
//        view = mInflater.inflate(R.layout.list_item,viewGroup,false);
//
//        TextView mTextView = (TextView) view.findViewById(R.id.id_text);
//        ImageView mImageView = (ImageView) view.findViewById(R.id.id_img);
//
//        item = listview_array.get(i);
//
//        mTextView.setText(item.getStr_desc());
//        mImageView.setImageDrawable(item.getDrawable_icon());
//
//        return view;
//    }

    public int addItem(ListViewItem item){
        listview_array.add(item);
        this.notifyDataSetChanged();

        return listview_array.size();
    }
}
