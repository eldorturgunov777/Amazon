package com.example.amazon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv_essential;
    ConstraintLayout ll_fashion;
    ConstraintLayout ll_popular;
    ArrayList<Essential> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        ll_fashion = findViewById(R.id.ll_fashion);
        ll_popular = findViewById(R.id.ll_popular);
        rv_essential = findViewById(R.id.rv_essential);

        rv_essential.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        EssentialAdapter adapter = new EssentialAdapter(this, list);
        rv_essential.setAdapter(adapter);
        data();
//        refreshAdapter();

        setLinearHeight(ll_fashion);
        setLinearHeight(ll_popular);
    }

    private void data() {
        list.add(new Essential(R.drawable.im_product_3, "Ocolus"));
        list.add(new Essential(R.drawable.im_product_2, "Gamer"));
        list.add(new Essential(R.drawable.im_product_1, "Mobile"));
    }

    private void setLinearHeight(ConstraintLayout layout) {
        WindowManager windowManager = (WindowManager) getApplicationContext().getSystemService(Context.WINDOW_SERVICE);
        Display display = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getMetrics(displayMetrics);
        int width = displayMetrics.widthPixels;

        ViewGroup.LayoutParams params = layout.getLayoutParams();
        params.height = width;
    }
}