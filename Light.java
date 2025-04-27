
class Light extends Device {
    private int brightness;

    public Light(String deviceId, String name) {
        super(deviceId, name);
        this.brightness = 100;
    }

    public void setBrightness(int brightness) {
        if (brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;
            System.out.println("Brightness set to " + brightness + "%");
        }
    }

    @Override
    public void getStatus() {
        super.getStatus();
        if (isOn) {
            System.out.println("Brightness: " + brightness + "%");
        }
    }
}

