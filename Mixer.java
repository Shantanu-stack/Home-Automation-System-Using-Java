
class Mixer extends Device {
    private int speed;

    public Mixer(String deviceId, String name) {
        super(deviceId, name);
        this.speed = 0;
    }

    public void setSpeed(int speed) {
        if (speed >= 0 && speed <= 3) {
            this.speed = speed;
            System.out.println("Mixer speed set to " + speed);
        }
    }

    @Override
    public void getStatus() {
        super.getStatus();
        if (isOn) {
            System.out.println("Speed: " + speed);
        }
    }
}
