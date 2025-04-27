//public class AirConditioner extends Device{
//public void temperatureset(){}
//
//}
//public void fanspped(){
//
//}
class AirConditioner extends Device {
    private int temperature;
    private int fanSpeed;

    public AirConditioner(String deviceId, String name) {
        super(deviceId, name);
        this.temperature = 24;
        this.fanSpeed = 1;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature set to " + temperature);
    }

    public void setFanSpeed(int speed) {
        if (speed >= 1 && speed <= 5) {
            this.fanSpeed = speed;
            System.out.println("Fan speed set to " + speed);
        }
    }

    @Override
    public void getStatus() {
        super.getStatus();
        if (isOn) {
            System.out.println("Temperature: " + temperature + "°C");
            System.out.println("Fan Speed: " + fanSpeed);
        }
    }
}
