package ru.practicum.dinner;

import java.util.HashMap;
import java.util.ArrayList;

public class DishList {
    HashMap<String, ArrayList<String>> dishByType;
    ArrayList<String> dish;

    public DishList() {
        dishByType = new HashMap<>();

        dish = new ArrayList<>();
        dish.add("Сок");
        dish.add("Вода");
        dish.add("Чай");
        dishByType.put("Напитки", dish);

        dish = new ArrayList<>();
        dish.add("Борщ");
        dish.add("Щи");
        dish.add("Харчо");
        dishByType.put("Первое", dish);

        dish = new ArrayList<>();
        dish.add("Котлета");
        dish.add("Сосиска");
        dish.add("Курица");
        dishByType.put("Второе", dish);

        dish = new ArrayList<>();
        dish.add("Торт");
        dish.add("Пирожное");
        dish.add("Конфета");
        dishByType.put("Десерт", dish);
    }

    boolean checkType(String dishType) {
        return dishByType.containsKey(dishType);
    }
    
    void addDishInList(String dishType, String dishName) {
        if (checkType(dishType)) { // Если тип уже есть в хэш-таблице
            ArrayList<String> dish = dishByType.get(dishType); // Получает список блюд, введённого типа
            dish.add(dishName); // Добавляем к списку новое
            dishByType.put(dishType, dish); // Кладём обратно в таблицу
            System.out.println("Блюдо " + dishName + " добавлено к типу " + dishType);
        } else { // Если типа ещё нет
            ArrayList<String> dish = new ArrayList<>(); // Создаём новый список блюд
            dish.add(dishName); // Добавляем блюдо
            dishByType.put(dishType, dish); // Кладём в таблицу
            System.out.println("Блюдо " + dishName + " добавлено к типу " + dishType);
        }
    }
}
