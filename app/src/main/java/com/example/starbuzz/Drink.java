package com.example.starbuzz;

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    //drinks - массив с элементами Drink
    public static final Drink[] drinks = {
            new Drink("Latte", "coffee with milk", R.drawable.latte),
            new Drink("Cappuccino", "hot milk and a steamed milk foam", R.drawable.cappuccino),
            new Drink("Filter", "Highest quality beans roasted and brewed fresh", R.drawable.filter)
    };

    //Конструктор
    public Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    //геттеры - методы для приватных переменных
    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
