package com.saucecode.flint.ui.main;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.saucecode.flint.R;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbsIds.length;
    }

    public Object getItem(int position) {
        return null;
    }


    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(285, 285));
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbsIds[position]);
        return imageView;
    }

    public Integer[] mThumbsIds = {
            R.drawable.grid_background,
            R.drawable.grid_background,
            R.drawable.grid_background,
            R.drawable.grid_background,
            R.drawable.grid_background,
            R.drawable.grid_background
    };
}
