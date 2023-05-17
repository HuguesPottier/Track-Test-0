package basic.codelab02;

public class TrafficLightControl {

    private final TrafficLight trafficLight;

    public TrafficLightControl() {
        this.trafficLight = new TrafficLight();
        this.trafficLight.color = "red";
    }

    public void switchColor() {
        switch (trafficLight.color) {
            case "red" -> trafficLight.color = "green";
            case "green" -> trafficLight.color = "orange";
            case "orange" -> trafficLight.color = "red";
        }
    }

    public String toString() {
        return "The light is: " + trafficLight;
    }
}
