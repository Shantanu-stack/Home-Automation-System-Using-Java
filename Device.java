
class Device {
    private String deviceId;
    private String name;
    protected boolean isOn;

    public Device(String deviceId, String name) {
        this.deviceId = deviceId;
        this.name = name;
        this.isOn = false;
    }

    public void turnOff() {
        isOn = false;
        System.out.println(name + " turned off");
    }

    public void turnOn() {
        isOn = true;
        System.out.println(name + " turned on");
    }

    public void getStatus() {
        System.out.println(name + " is " + (isOn ? "on" : "off"));
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getName() {
        return name;
    }
}
