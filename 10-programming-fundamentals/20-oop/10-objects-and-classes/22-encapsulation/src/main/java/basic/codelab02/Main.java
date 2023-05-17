package basic.codelab02;

public class Main {

    public static void main(String[] args) {
        testTrafficLightControl();
        testMalfunctioningTrafficLightControl();

    }

    private static void testMalfunctioningTrafficLightControl() {
        System.out.println("****** Malfunctioning Traffic Light Control ********");
        MalfunctioningTrafficLightControl malfunctioningTrafficLightControl = new MalfunctioningTrafficLightControl();
        System.out.println(malfunctioningTrafficLightControl);
        malfunctioningTrafficLightControl.switchColor();
        System.out.println(malfunctioningTrafficLightControl);
        malfunctioningTrafficLightControl.switchColor();
        System.out.println(malfunctioningTrafficLightControl);
        malfunctioningTrafficLightControl.switchColor();
        System.out.println(malfunctioningTrafficLightControl);
        System.out.println();
    }

    private static void testTrafficLightControl() {
        System.out.println("****** Traffic Light Control ********");
        TrafficLightControl trafficLightControl = new TrafficLightControl();
        System.out.println(trafficLightControl);
        trafficLightControl.switchColor();
        System.out.println(trafficLightControl);
        trafficLightControl.switchColor();
        System.out.println(trafficLightControl);
        System.out.println();
    }
}
