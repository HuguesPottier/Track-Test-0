package slide_example;

import static java.time.LocalDate.now;

public class Main {

    public static void main(String[] args) {
        Cat cat = getACatFromShelter();
        System.out.println(getCatAge(cat));
    }

    private static Cat getACatFromShelter() {
        return null;
    }

    private static int getCatAge(Cat cat) {
        if(cat == null) {
            return -1;
        }
        return now().getYear() - cat.getBirthYear();
    }
}
