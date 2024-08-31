# Kotlin Multiplatform Mobile (KMM) 🚀

A ready-to-use boilerplate for Kotlin Multiplatform Mobile applications with Android and iOS targets.

## Features 🌟

- Kotlin Multiplatform Mobile setup
- Android application with Jetpack Compose
- iOS application with SwiftUI
- Shared Kotlin code for business logic
- Gradle build system

## Project Structure 📁

- `androidApp/`: Android application module
- `iosApp/`: iOS application module
- `shared/`: Shared Kotlin code module

## Customizing 🎨

- Android app customization: Modify files in the `androidApp` module
- iOS app customization: Modify files in the `iosApp` module
- Shared code: Update the `shared` module

## Gradle Tasks 🔧

### Install Dependencies

To install all project dependencies, run:

```shell
./gradlew build
```

### Run Android App

To run the Android app on an emulator or connected device:

```shell
./gradlew :androidApp:installDebug
```

### Compile Android APK

To compile the Android APK:

```shell
./gradlew :androidApp:assembleRelease
```

The APK will be generated in `androidApp/build/outputs/apk/debug/`.

### Run iOS App

To run the iOS app, open the Xcode project in the `iosApp` folder and run it from there.

### Compile iOS App

To compile the iOS app, use Xcode to build the project. You can also use the following command to build from the command line:

```shell
xcodebuild -project iosApp/iosApp.xcodeproj -scheme iosApp -configuration Debug build
```

## License 📄

📝 Copyright © 2024 [tooniez](https://github.com/tooniez). <br />
This project is [MIT](https://github.com/tooniez/kotlin-multiplatorm-app/blob/main/LICENSE) licensed.











