package com.example.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;

public class DrinkCategoryActivity extends ListActivity {

    @Override
    //Создаётся базовая сетевая активность DrinkCategoryActivity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // не нужно назначать макет используя setContentView()
        //setContentView(R.layout.activity_drink_category);
    }
}