//import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
class Room {
    private String roomId;
    private String name;
    private List<Device> devices;

    public Room(String roomId, String name) {
        this.roomId = roomId;
        this.name = name;
        this.devices = new ArrayList<>();
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public int getNumDevices() {
        return devices.size();
    }

    public String getRoomId() {
        return roomId;
    }

    public String getName() {
        return name;
    }

    public void displayDevices() {
        for (Device device : devices) {
            System.out.println("  - " + device.getName() + " (" + device.getDeviceId() + ")");
        }
    }

    public void displayDeviceStatus() {
        System.out.println("Room: " + name);
        for (Device device : devices) {
            device.getStatus();
        }
    }

    public void controlDevice(String deviceId, String action) {
        for (Device device : devices) {
            if (device.getDeviceId().equals(deviceId)) {
                switch (action.toLowerCase()) {
                    case "on":
                        device.turnOn();
                        break;
                    case "off":
                        device.turnOff();
                        break;
                    default:
                        System.out.println("Invalid action");
                }
                return;
            }
        }
        System.out.println("Device not found");
    }
}
