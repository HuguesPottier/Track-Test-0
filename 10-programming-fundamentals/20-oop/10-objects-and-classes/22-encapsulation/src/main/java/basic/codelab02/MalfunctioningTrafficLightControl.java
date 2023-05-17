package basic.codelab02;

public class MalfunctioningTrafficLightControl {
    private final TrafficLight trafficLight;

    public MalfunctioningTrafficLightControl() {
        this.trafficLight = new TrafficLight();
        this.trafficLight.color = "purple";
    }

    public void switchColor() {
        switch (trafficLight.color) {
            case "purple" -> trafficLight.color = "black";
            case "black" -> trafficLight.color = "gray";
            case "gray" -> trafficLight.color = "pink";
            case "pink" -> trafficLight.color = "purple";
        }
    }
}
