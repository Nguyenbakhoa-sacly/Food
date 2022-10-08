package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class DowLoad extends Fragment {

    ListView listViewfood;
    ArrayList<food> foodArrayList;
    Adapterfood3 adapterfood3;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dow_load,container,false);
        listViewfood =(ListView) view.findViewById(R.id.listViewDowLoad);
        foodArrayList = new ArrayList<>();
        foodArrayList.add(new food("Thịt Bò",R.drawable.a1,"Thịt Bò, rau"));
        foodArrayList.add(new food("Thịt Gà",R.drawable.a2,"Thịt gà, khoai tay chiên"));
        foodArrayList.add(new food("Thịt Cá",R.drawable.a3,"Cá, cà chua"));
        foodArrayList.add(new food("Rau cũ trộn",R.drawable.a4,"Khoai tây, cà chua"));
        foodArrayList.add(new food("Cá Nướng",R.drawable.a5,"cá, khoai tay"));
        foodArrayList.add(new food("Mì ",R.drawable.a6,"Mì ý, cà chua"));
        foodArrayList.add(new food("Bánh Mì",R.drawable.a7,"Bánh mì, cà chua, khoai tây"));
        foodArrayList.add(new food("Cá Hồi Trộn",R.drawable.a8,"Cá, rau, cà chua "));
        foodArrayList.add(new food("Thịt Bò Nướng",R.drawable.a9,"Thịt bò, cà chua"));
        foodArrayList.add(new food("Thịt Bò",R.drawable.s1,"Thịt Bò, rau"));
        foodArrayList.add(new food("Thịt Gà",R.drawable.s2,"Thịt gà, khoai tay chiên"));
        foodArrayList.add(new food("Thịt Cá",R.drawable.s3,"Cá, cà chua"));
        foodArrayList.add(new food("Rau cũ trộn",R.drawable.s4,"Khoai tây, cà chua"));
        foodArrayList.add(new food("Cá Nướng",R.drawable.s5,"cá, khoai tay"));
        foodArrayList.add(new food("Mì ",R.drawable.s6,"Mì ý, cà chua"));
        foodArrayList.add(new food("Bánh Mì",R.drawable.s7,"Bánh mì, cà chua, khoai tây"));
        foodArrayList.add(new food("Cá Hồi Trộn",R.drawable.s8,"Cá, rau, cà chua "));
        foodArrayList.add(new food("Thịt Bò Nướng",R.drawable.s9,"Thịt bò, cà chua"));

        adapterfood3 = new Adapterfood3(getContext(),R.layout.custom_dong_food,foodArrayList);
        listViewfood.setAdapter(adapterfood3);
        listViewfood.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(), MoTafood.class);
                intent.putExtra("key1",foodArrayList.get(i).getImg());
                intent.putExtra("key2",foodArrayList.get(i).getTenfood());
                intent.putExtra("key3",foodArrayList.get(i).getMoTa());
                startActivity(intent);
            }
        });
        return view;
    }
}