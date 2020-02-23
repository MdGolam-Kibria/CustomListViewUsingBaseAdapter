package com.example.gk.listviewusingarrayarrayadaptercustomizesadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by GK on 10-Jul-19.
 */

public class CustomAdapter extends BaseAdapter {
    int flags[];
    String itemname[];
    Context context;
    LayoutInflater inflater;

    public CustomAdapter(MainActivity mainActivity, String[] itemName, int[] flags) {
        this.context = mainActivity;
        this.flags = flags;
        this.itemname = itemName;
    }

    @Override
    public int getCount() {
        return itemname.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {//jahoto ar aga kon view create hoi nai.
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.simple, parent, false);
            ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
            TextView textView = (TextView) convertView.findViewById(R.id.name);
            textView.setText(itemname[position]);
            imageView.setImageResource(flags[position]);

        }
        return convertView;
    }
}
