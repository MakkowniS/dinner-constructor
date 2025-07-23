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
        if (checkType(dishType)) { // Если тип уже есть в хэш-таблице
            dish = dishByType.get(dishType); // Получает список блюд, введённого типа

        } else { // Если типа ещё нет
            dish = new ArrayList<>(); // Создаём новый список блюд
        }
        dish.add(dishName); // Добавляем к списку новое
        dishByType.put(dishType, dish); // Кладём обратно в таблицу
        System.out.println("Блюдо " + dishName + " добавлено к типу " + dishType);
    }
}
