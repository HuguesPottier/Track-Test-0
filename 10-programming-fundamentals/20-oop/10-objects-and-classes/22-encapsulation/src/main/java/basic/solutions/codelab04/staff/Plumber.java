package basic.solutions.codelab04.staff;

import basic.solutions.codelab04.house.Bathroom;

public class Plumber {

    private final String name;

    public Plumber(String name) {
        this.name = name;
    }

    void fixBathroom(Bathroom bathroom) {
        System.out.println("Plumber " + name + " is fixing the bathroom");
        bathroom.fixLeak();
    }
}
