import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homeautomation {
    private List<Room> rooms;

    public Homeautomation() {
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void displayRooms() {
        System.out.println("\nAll Rooms:");
        for (Room room : rooms) {
            System.out.println("\nRoom: " + room.getName());
            room.displayDevices();
        }
    }

    public void deviceStatus() {
        System.out.println("\nDevice Status for All Rooms:");
        for (Room room : rooms) {
            room.displayDeviceStatus();
        }
    }

    public void roomStatus() {
        System.out.println("\nRoom Status:");
        for (Room room : rooms) {
            System.out.println("Room: " + room.getName());
            System.out.println("Number of devices: " + room.getNumDevices());
            System.out.println("--------------------");
        }
    }

    public void controlDevice(String roomId, String deviceId, String action) {
        for (Room room : rooms) {
            if (room.getRoomId().equals(roomId)) {
                room.controlDevice(deviceId, action);
                return;
            }
        }
        System.out.println("Room not found");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Homeautomation home = new Homeautomation();

        initializeHome(home);

        while (true) {
            System.out.println("\n=== Home Automation System ===");
            System.out.println("1. Display All Rooms");
            System.out.println("2. Device Status");
            System.out.println("3. Room Status");
            System.out.println("4. Control Device");
            System.out.println("5. Add New Room");
            System.out.println("6. Add Device to Room");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    home.displayRooms();
                    break;
                case 2:
                    home.deviceStatus();
                    break;
                case 3:
                    home.roomStatus();
                    break;
                case 4:
                    System.out.print("Enter Room ID: ");
                    String roomId = scanner.nextLine();
                    System.out.print("Enter Device ID: ");
                    String deviceId = scanner.nextLine();
                    System.out.print("Enter Action (on/off): ");
                    String action = scanner.nextLine();
                    home.controlDevice(roomId, deviceId, action);
                    break;
                case 5:
                    addNewRoom(home, scanner);
                    break;
                case 6:
                    addDeviceToRoom(home, scanner);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void initializeHome(Homeautomation home) {
        BedRoom bedroom = new BedRoom("BR1", "Master Bedroom");
        bedroom.addDevice(new AirConditioner("AC1", "Bedroom AC"));
        bedroom.addDevice(new Television("TV1", "Bedroom TV"));

        LivingRoom livingRoom = new LivingRoom("LR1", "Living Room");
        livingRoom.addDevice(new Light("L1", "Living Room Light"));
        livingRoom.addDevice(new AirConditioner("AC2", "Living Room AC"));

        Kitchen kitchen = new Kitchen("K1", "Kitchen");
        kitchen.addDevice(new Light("L2", "Kitchen Light"));
        kitchen.addDevice(new Mixer("M1", "Kitchen Mixer"));

        home.addRoom(bedroom);
        home.addRoom(livingRoom);
        home.addRoom(kitchen);
    }

    private static void addNewRoom(Homeautomation home, Scanner scanner) {
        System.out.println("\nRoom Types:");
        System.out.println("1. Bedroom");
        System.out.println("2. Living Room");
        System.out.println("3. Kitchen");
        System.out.println("4. Washroom");
        System.out.print("Enter room type (1-4): ");

        int type = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Room ID: ");
        String roomId = scanner.nextLine();
        System.out.print("Enter Room Name: ");
        String name = scanner.nextLine();

        Room newRoom = null;
        switch (type) {
            case 1:
                newRoom = new BedRoom(roomId, name);
                break;
            case 2:
                newRoom = new LivingRoom(roomId, name);
                break;
            case 3:
                newRoom = new Kitchen(roomId, name);
                break;
            case 4:
                newRoom = new WashRoom(roomId, name);
                break;
            default:
                System.out.println("Invalid room type!");
                return;
        }

        home.addRoom(newRoom);
        System.out.println("Room added successfully!");
    }

    private static void addDeviceToRoom(Homeautomation home, Scanner scanner) {
        System.out.print("Enter Room ID: ");
        String roomId = scanner.nextLine();

        System.out.println("\nDevice Types:");
        System.out.println("1. Air Conditioner");
        System.out.println("2. Television");
        System.out.println("3. Light");
        System.out.println("4. Mixer");
        System.out.print("Enter device type (1-4): ");

        int type = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Device ID: ");
        String deviceId = scanner.nextLine();
        System.out.print("Enter Device Name: ");
        String name = scanner.nextLine();

        Device newDevice = null;
        switch (type) {
            case 1:
                newDevice = new AirConditioner(deviceId, name);
                break;
            case 2:
                newDevice = new Television(deviceId, name);
                break;
            case 3:
                newDevice = new Light(deviceId, name);
                break;
            case 4:
                newDevice = new Mixer(deviceId, name);
                break;
            default:
                System.out.println("Invalid device type!");
                return;
        }

        for (Room room : home.getRooms()) {  // Using getRooms() method instead of direct access
            if (room.getRoomId().equals(roomId)) {
                room.addDevice(newDevice);
                System.out.println("Device added successfully!");
                return;
            }
        }
        System.out.println("Room not found!");
    }
    public List<Room> getRooms() {
        return rooms;
    }
}
