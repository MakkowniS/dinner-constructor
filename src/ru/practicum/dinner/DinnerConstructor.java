package ru.practicum.dinner;

import java.util.Random;
import java.util.ArrayList;

public class DinnerConstructor {

    ArrayList<String> itemsList; // Список введённых типов
    ArrayList<String> dishesComboList; // Список для комбинаций

    Random random;
    DishList dishList;

    public DinnerConstructor() {
        itemsList = new ArrayList<>();

        random = new Random();
        dishList = new DishList();
    }


    void comboGenerating(int numberOfCombos){
        for (int i = 1; i <= numberOfCombos; i++) {
            dishesComboList = new ArrayList<>();
            for (String item : itemsList) {
                ArrayList<String> dish = dishList.dishByType.get(item);
                dishesComboList.add(dish.get(random.nextInt(dish.size())));
            }
            System.out.println("Комбо " + i);
            System.out.println(dishesComboList);
        }
        itemsList.clear();
    }



}
