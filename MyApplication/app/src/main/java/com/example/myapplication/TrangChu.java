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
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class TrangChu extends Fragment {
    private GridView gridView;
    private foodAdapter foodAdapter;
    private ArrayList<food> foodArrayList;
    private Button btnChoiNgay;
    int[] listIMG = {R.drawable.meme8a, R.drawable.meme7a, R.drawable.meme6a,R.drawable.meme13};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_trang_chu, container, false);
        ImageView imgAvt = (ImageView) view.findViewById(R.id.avt);
        btnChoiNgay = (Button) view.findViewById(R.id.btnChoiNgay);
        btnChoiNgay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rd = new Random();
                imgAvt.setImageResource(listIMG[rd.nextInt(listIMG.length)]);

            }
        });
        gridView = (GridView) view.findViewById(R.id.grView);
        foodArrayList = new ArrayList<>();
        foodArrayList.add(new food("Thịt Cá",R.drawable.meme2,"N1.500"));
        foodArrayList.add(new food("Thịt Bò Bifteck",R.drawable.meme3,"N1,800"));
        foodArrayList.add(new food("Chân Gà Chiên",R.drawable.meme4,"N1.200"));
        foodArrayList.add(new food("Thịt Gà rau củ",R.drawable.meme5,"N1.500"));
        foodArrayList.add(new food("Thịt Gà cuốn xôi",R.drawable.s,"N1.500"));
        foodArrayList.add(new food("Cánh Gà Chiên",R.drawable.a1,"N1.200"));
        foodArrayList.add(new food("Cơm Thịt Bò",R.drawable.a2,"N1.400"));
        foodArrayList.add(new food("Cá Nướng",R.drawable.a3,"N1.800"));
        foodArrayList.add(new food("Rau Củ Trộn",R.drawable.a4,"N1.400"));
        foodArrayList.add(new food("Thịt Cá Nướng",R.drawable.a5,"N1.900"));
        foodArrayList.add(new food("Mì Ý Thịt",R.drawable.a7,"N1.200"));
        foodArrayList.add(new food("Thịt Vịt Nướng",R.drawable.a8,"N1.600"));
        foodArrayList.add(new food("Thịt Lợn Nướng",R.drawable.a9,"N1.900"));
        foodArrayList.add(new food("Gà Chiên",R.drawable.s1,"N1.700"));
        foodArrayList.add(new food("Bánh mi Bate",R.drawable.s2,"N1.300"));
        foodArrayList.add(new food("Cá Nướng",R.drawable.s3,"N1.400"));
        foodArrayList.add(new food("Thịt Gà Nướng",R.drawable.s4,"N1.800"));
        foodArrayList.add(new food("Bánh Kẹp Chiên",R.drawable.s5,"N1.400"));
        foodArrayList.add(new food("Rau củ Trộn",R.drawable.s6,"N1.900"));
        foodArrayList.add(new food("Thịt Lợn Nướng",R.drawable.s7,"N1.200"));
        foodArrayList.add(new food("Cơm Ấn Độ",R.drawable.s8,"N1.200"));
        foodArrayList.add(new food("Thịt Vịt Quay",R.drawable.s9,"N1.600"));
        foodArrayList.add(new food("Thịt Lợn Nướng",R.drawable.a9,"N1.900"));
        foodArrayList.add(new food("Gà Chiên",R.drawable.s1,"N1.700"));
        foodArrayList.add(new food("Thịt Vịt Nướng",R.drawable.s3,"N1.400"));
        foodArrayList.add(new food("Gà Quay",R.drawable.s4,"N1.100"));

        foodAdapter= new foodAdapter(getContext(),0,foodArrayList);
        gridView.setAdapter(foodAdapter);
        return view;
    }
}