package basic.solutions.codelab04.staff;

import basic.solutions.codelab04.food.Food;
import basic.solutions.codelab04.house.Kitchen;

public class Cook {

    private final String name;

    public Cook(String name) {
        this.name = name;
    }

    Food prepareFood(Kitchen kitchen) {
        System.out.println("Cook " + name + " is preparing some tasty chicken");
        return kitchen.prepareFood("Tasty chicken");
    }
}
