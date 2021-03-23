package com.example.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinkCategoryActivity extends ListActivity {

    @Override
    //Создаётся базовая сетевая активность DrinkCategoryActivity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // не нужно назначать макет используя setContentView()
        //setContentView(R.layout.activity_drink_category);

        ListView listDrinks = getListView(); //перем listDrink с мет getListView
        ArrayAdapter<Drink> listAdapter = new ArrayAdapter<Drink>(
                this, //текущая активность
                android.R.layout.simple_expandable_list_item_1, //Встроенный ресурс макета. -
                // - приказывает адаптеру массива отображать каждый элемент массива в виде надписи.
                Drink.drinks); // Сам массив drinks из класса Drink
        listDrinks.setAdapter(listAdapter); //Назначить слушателя для спискового представления.
    }
    @Override
    public void onListItemClick( ListView listView,
                                 View itemView,
                                 int position,
                                 long id)
    {

        Intent intent = new Intent(DrinkCategoryActivity.this, DrinkActivity.class);
        intent.putExtra(DrinkActivity.EXTRA_DRINKNO, (int) id);
        startActivity(intent);
    }

}