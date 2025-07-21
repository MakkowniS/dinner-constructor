package ru.practicum.dinner;

import java.util.HashMap;
import java.util.ArrayList;

public class DinnerConstructor {
    HashMap<String, ArrayList<String>> dishesByType;
    ArrayList<String> dishes;

    public DinnerConstructor() {
        dishesByType = new HashMap<>();
        dishes = new ArrayList<>();
    }

    boolean checkType(String dishType) {
        if (dishesByType.containsKey(dishType)) {
            return true;
        } else {
            return false;
        }
    }


}
