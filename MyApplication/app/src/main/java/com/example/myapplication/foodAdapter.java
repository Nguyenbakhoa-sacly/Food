package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class foodAdapter extends ArrayAdapter<food> {
    private Context context;
    private ArrayList<food> foodArrayList;

    public foodAdapter(@NonNull Context context, int resource, @NonNull List<food> objects) {
        super(context, resource, objects);
        this.context= context;
        this.foodArrayList= new ArrayList<>(objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView ==null){
            LayoutInflater layoutInflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView= layoutInflater.inflate(R.layout.item_food,null);
        }
        if(foodArrayList.size()>0){
            food food = this.foodArrayList.get(position);

            ImageView imgfood =(ImageView) convertView.findViewById(R.id.img_food);
            TextView txtTenfood=(TextView) convertView.findViewById(R.id.txt_tenfood);
            TextView txtMoTa=(TextView) convertView.findViewById(R.id.txt_moTa);
            imgfood.setImageResource(food.getImg());
            txtTenfood.setText(food.getTenfood());
            txtMoTa.setText(food.getMoTa());
        }
        return convertView;
    }
}
