package com.example.student.huynhcaohuulinh_16035801;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {
    Context context;
    int layout;
    ArrayList<LinkObject> links = new ArrayList<>();

    public Adapter(Context context, int layout, ArrayList<LinkObject> links) {
        this.context = context;
        this.layout = layout;
        this.links = links;
    }

    @Override
    public int getCount() {
        return links.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.gridview_layout, null);

        ImageView imageView = view.findViewById(R.id.imageView);
        TextView tvName = view.findViewById(R.id.tvName);

        tvName.setText(links.get(i).getName());
        imageView.setImageResource(links.get(i).getImage());

        return view;
    }
}
