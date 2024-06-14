# Appium Android Automation

This repository contains a comprehensive setup for automated testing of an Android application using Appium and Java. It includes configurations, test scripts, and detailed instructions to facilitate seamless mobile application testing.

## Introduction
This project demonstrates how to use Appium to automate the testing of Android applications. It includes example test scripts for common interactions such as scrolling, text input, and navigating through the app's UI components.

## Prerequisites

Ensure you have the following installed on your system:
- Java JDK 8 or above
- Android Studio
- Appium Server
- Eclipse IDE (optional, for development purposes)
- Node.js and npm

## Setup and Installation

### Cloning the Repository

```bash
git clone https://github.com/yourusername/appium-android-automation.git
cd appium-android-automation
```

### Setting Up the Environment

1. **Install Appium Server**:
    ```bash
    npm install -g appium
    ```

2. **Start Appium Server**:
    ```bash
    appium
    ```

3. **Configure Android Emulator**:
    - Open Android Studio and create a new virtual device or use an existing one.
    - Ensure the emulator is running before starting the tests.

4. **Import Project into Eclipse**:
    - Open Eclipse and import the cloned project as an existing Maven project.

## Project Structure

```
appium-android-automation/
├── src/
│   ├── main/
│   └── test/
│       ├── java/
│       │   ├── base/
│       │   └── Appiumtest/
│       └── project.apk/
└── pom.xml
```

## Project Files

### Appiumtest.java

`Appiumtest.java` is the main test script that contains the logic for automating the testing of our Android application using Appium. This script demonstrates various interactions with the app's UI components, such as scrolling, text input, and navigating through different screens. Below is a detailed breakdown of its functionality:

- **Scroll to Element**: The script scrolls through the app until it finds the element with the text "Erisa".
- **Text Input**: It clicks on a text input field, enters the text "ros", and presses the "Enter" key on the virtual keyboard.
- **Element Interaction**: The script waits for the presence of various UI elements and interacts with them (e.g., clicks on search results, toggles a switch).
- **Navigation**: It navigates through different parts of the app, interacting with buttons and other UI components.
- 
### base.java

`base.java` is a utility class that sets up and configures the Appium driver. This class is essential for establishing a connection to the Appium server and preparing the environment for the test scripts. Below is a detailed breakdown of its functionality:

- **DesiredCapabilities Configuration**: Configures various capabilities required for the Appium driver, such as the device name and the application path.
- **Driver Initialization**: Initializes the `AndroidDriver` with the specified capabilities and the URL of the Appium server.

**Key Configurations:**
- **Device Name**: Specifies the name of the Android device or emulator (e.g., "Medium Phone API 33").
- **Application Path**: Provides the absolute path to the APK file that will be tested.
- **Automation Engine**: Uses `UiAutomator2` as the automation engine for interacting with Android UI components.

## Running the Tests

1. **Compile the Project**:
    ```bash
    mvn clean install
    ```

2. **Run Test Scripts**:
    - Navigate to the test class in the `tests` package.
    - Right-click and select `Run As > TestNG Test`.

