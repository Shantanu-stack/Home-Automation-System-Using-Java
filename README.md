# Home Automation System Using Java

This project demonstrates a basic home automation system implemented using core Java concepts. It provides a foundation for controlling and monitoring various aspects of a smart home environment through a simple command-line interface.

## Overview

This system allows users to interact with simulated smart home devices. It showcases how fundamental Java programming principles can be applied to manage and automate home functionalities. The focus is on illustrating core Java features such as:

* **Object-Oriented Programming (OOP):** Utilizing classes, objects, inheritance, and polymorphism to model different home devices and their behaviors.
* **Data Structures:** Employing collections (like Lists and Maps) to manage devices and their states.
* **Input/Output (I/O):** Handling user input from the console to control the system and displaying device status.
* **Control Flow:** Implementing logic using conditional statements and loops to manage device actions and system behavior.
* **Exception Handling:** Gracefully managing potential errors during user input or device operations.

## Features

The current version of the system includes the following features:

* **Device Management:**
    * Adding new simulated devices to the system (e.g., lights, thermostats, security cameras).
    * Listing all available devices and their current status.
* **Device Control:**
    * Turning devices ON and OFF.
    * Adjusting device settings (e.g., changing thermostat temperature).
    * Simulating specific actions for different device types.
* **Simple Command-Line Interface:** Users interact with the system by entering text-based commands.

## Getting Started

To run this project, you need to have Java Development Kit (JDK) installed on your system.

1.  **Clone the Repository:**
    ```bash
    git clone <repository_url>
    ```
    (Replace `<repository_url>` with the actual URL of this repository)

2.  **Navigate to the Project Directory:**
    ```bash
    cd Home-Automation-System-Using-Java
    ```

3.  **Compile the Java Code:**
    ```bash
    javac src/*.java
    ```
    (Assuming your Java source files are in a `src` directory)

4.  **Run the Application:**
    ```bash
    java src/Main
    ```
    (Replace `Main` with the name of your main class if it's different)

## Usage

Once the application is running, you will be presented with a command prompt. You can enter commands to interact with the home automation system. Some example commands might include:

* `add light LivingRoom` (Adds a new light named "LivingRoom")
* `list` (Lists all devices and their status)
* `on LivingRoom` (Turns the "LivingRoom" light on)
* `off LivingRoom` (Turns the "LivingRoom" light off)
* `add thermostat Kitchen` (Adds a new thermostat named "Kitchen")
* `set Kitchen temperature 22` (Sets the temperature of the "Kitchen" thermostat to 22 degrees)
* `help` (Displays available commands)
* `exit` (Exits the application)

Please refer to the console output for the specific commands available in the current version.

## Core Java Concepts Demonstrated

This project heavily utilizes the following core Java concepts:

* **Classes and Objects:** Modeling real-world devices as Java classes with attributes (state) and methods (actions).
* **Inheritance:** Creating a base `Device` class and extending it for specific device types (e.g., `Light`, `Thermostat`, `Camera`), inheriting common functionalities and adding specific behaviors.
* **Polymorphism:** Allowing different device types to respond to the same command (e.g., `turnOn()`, `turnOff()`) in their own way.
* **Collections:** Using `ArrayList` to store and manage a dynamic list of devices and `HashMap` to potentially store device configurations or states.
* **String Manipulation:** Processing user input commands using string methods.
* **Conditional Statements and Loops:** Implementing the logic for command processing and device control.
* **Exception Handling:** Using `try-catch` blocks to handle invalid user input or unexpected situations.

## Future Enhancements

This is a basic implementation and can be extended with more features, such as:

* Support for more device types (e.g., smart locks, speakers).
* A more user-friendly interface (e.g., a graphical user interface).
* Persistence of device data (saving and loading device configurations).
* Networking capabilities for remote control.
* More sophisticated automation rules and scenarios.

## Contributing

Contributions to this project are welcome. If you have ideas for improvements or bug fixes, feel free to fork the repository and submit a pull request.

## License

[Specify your project license here, e.g., MIT License]
