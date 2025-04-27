
class Television extends Device {
    private int volume;

    public Television(String deviceId, String name) {
        super(deviceId, name);
        this.volume = 10;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
            System.out.println("Volume set to " + volume);
        }
    }

    @Override
    public void getStatus() {
        super.getStatus();
        if (isOn) {
            System.out.println("Volume: " + volume);
        }
    }
}
