package ru.practicum.dinner;

import java.util.HashMap;
import java.util.ArrayList;

public class DishList {
    HashMap<String, ArrayList<String>> dishByType;
    ArrayList<String> dish;

    public DishList() {
        dishByType = new HashMap<>();
        dish = new ArrayList<>();
    }

    boolean checkType(String dishType) {
        return dishByType.containsKey(dishType);
    }
    
    void addDishInList(String dishType, String dishName) {
        if (checkType(dishType)) {
            ArrayList<String> meal = dishByType.get(dishType);
            meal.add(dishName);
            dishByType.put(dishType, meal);
            System.out.println("Блюдо " + dishName + " добавлено к типу " + dishType);
        } else {
            ArrayList<String> meal = new ArrayList<>();
            meal.add(dishName);
            dishByType.put(dishType, meal);
            System.out.println("Блюдо " + dishName + " добавлено к типу " + dishType);
        }
    }
}
