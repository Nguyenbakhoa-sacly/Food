package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapterfood3 extends BaseAdapter {
    private Context context;
    private int layout;
    private List<food> foodList;

    public Adapterfood3(Context context, int layout, List<food> foodlist) {
        this.context = context;
        this.layout = layout;
        this.foodList = foodlist;
    }

    @Override
    public int getCount() {
        return foodList.size();
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
        LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view= layoutInflater.inflate(layout,null);
        // anh xa view
        ImageView imgView =(ImageView) view.findViewById(R.id.imgHinhDl);
        TextView txtTenfood= (TextView) view.findViewById(R.id.txtTenfoodDl);
        TextView txtMoTa= (TextView) view.findViewById(R.id.txtMoTaDl);

        food food = foodList.get(i);
        imgView.setImageResource(food.getImg());
        txtTenfood.setText(food.getTenfood());
        txtMoTa.setText(food.getMoTa());
        return view;
    }
}