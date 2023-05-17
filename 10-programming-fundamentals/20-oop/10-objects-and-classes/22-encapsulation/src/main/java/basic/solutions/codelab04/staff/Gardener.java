package basic.solutions.codelab04.staff;

import basic.solutions.codelab04.house.Garden;

public class Gardener {

    private final String name;

    public Gardener(String name) {
        this.name = name;
    }

    void tendTo(Garden garden) {
        System.out.println("Gardener " + name + " will tend to the garden");
        garden.removeWeeds();
        garden.trimHedge();
        garden.mowGrass();
    }
}
