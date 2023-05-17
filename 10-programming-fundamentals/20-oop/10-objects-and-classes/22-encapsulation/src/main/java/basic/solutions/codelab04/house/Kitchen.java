package basic.solutions.codelab04.house;

import basic.solutions.codelab04.food.Food;

public class Kitchen {
    public Food prepareFood(String foodName) {
        System.out.println("Kitchen: preparing " + foodName);
        return new Food(foodName);
    }
}
