package com.example.dell.maranon_listview.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dell.maranon_listview.Model.College;
import com.example.dell.maranon_listview.R;

import java.util.List;


/**
 * Created by dell on 9/7/2017.
 */

public class CustomAdapter extends BaseAdapter {
    Context c;
    List<College> colleges;
    ImageView iv_logo;
    TextView tv_Name, tv_Year;



    @Override
    public int getCount() {
        return colleges.size();
    }

    @Override
    public Object getItem(int i) {
        return colleges.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(c, R.layout.row_layout, null);
        iv_logo = (ImageView) v.findViewById(R.id.ivLogo);
        tv_Name = (TextView) v.findViewById(R.id.tvCollege);
        tv_Year = (TextView) v.findViewById(R.id.tvYear);
        return null;
    }

    @Override
    public CharSequence[] getAutofillOptions() {
        return new CharSequence[0];
    }
}
