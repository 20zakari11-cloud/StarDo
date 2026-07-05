# StarDo ⭐

A simple Android application built with Kotlin and Jetpack Compose, featuring Arabic RTL support.

---

## Tech Stack

| Component | Version |
|-----------|---------|
| Language | Kotlin 1.9.24 |
| Android Gradle Plugin | 8.3.2 |
| Gradle | 8.6 |
| Compose BOM | 2024.05.00 |
| Min SDK | 24 (Android 7.0) |
| Target SDK | 34 |
| Java | 17 |

---

## Project Structure

```
StarDo/
├── app/
│   ├── src/main/
│   │   ├── java/com/stardo/
│   │   │   ├── MainActivity.kt       # Entry activity
│   │   │   ├── App.kt                # Application class
│   │   │   ├── ui/
│   │   │   │   └── WelcomeScreen.kt  # Welcome screen composable
│   │   │   └── theme/
│   │   │       └── Theme.kt          # Material 3 theme
│   │   ├── res/
│   │   │   └── values/
│   │   │       ├── strings.xml
│   │   │       └── themes.xml
│   │   └── AndroidManifest.xml
│   ├── build.gradle
│   └── proguard-rules.pro
├── gradle/wrapper/
│   ├── gradle-wrapper.jar
│   └── gradle-wrapper.properties
├── build.gradle
├── settings.gradle
├── gradle.properties
├── gradlew
├── gradlew.bat
└── codemagic.yaml
```

---

## GitHub Setup Instructions

1. **Create a new GitHub repository** (empty, no README)
2. **Clone or initialize locally** (or use GitHub's web upload):
   ```bash
   git init
   git remote add origin https://github.com/YOUR_USERNAME/StarDo.git
   git add .
   git commit -m "Initial commit: StarDo Phase 1"
   git push -u origin main
   ```
3. **Connect to CodeMagic**:
   - Go to [codemagic.io](https://codemagic.io)
   - Click **Add application**
   - Select your GitHub account and the `StarDo` repository
   - CodeMagic will auto-detect `codemagic.yaml`

---

## CodeMagic Build Instructions

### How CodeMagic builds the APK

1. CodeMagic reads `codemagic.yaml` at the root of the repository
2. The `android-debug-build` workflow runs automatically
3. It sets up **Java 17** environment
4. Gradle caches are restored (speeds up subsequent builds)
5. Runs `./gradlew clean` to clear previous outputs
6. Runs `./gradlew assembleDebug` to compile and package the APK
7. The artifact `app/build/outputs/apk/debug/app-debug.apk` is collected

### Build Commands Explained

| Command | Purpose |
|---------|---------|
| `chmod +x gradlew` | Makes the Gradle wrapper executable on Linux/macOS CI |
| `./gradlew clean` | Removes all build outputs to ensure a fresh build |
| `./gradlew assembleDebug` | Compiles Kotlin sources, processes resources, and produces a debug APK |

### APK Output Path

```
app/build/outputs/apk/debug/app-debug.apk
```

---

## Local Build (optional, no Android Studio needed)

If you have Java 17 and want to build from the command line:

```bash
# macOS / Linux
chmod +x gradlew
./gradlew assembleDebug

# Windows
gradlew.bat assembleDebug
```

The APK will be at `app/build/outputs/apk/debug/app-debug.apk`.

---

## App Features (Phase 1)

- Welcome screen with Arabic text: **"مرحباً بك في StarDo ⭐"**
- Centered layout
- "ابدأ" (Start) button — no navigation yet
- Full RTL support (`android:supportsRtl="true"`)
- Material Design 3 theming with dynamic color support

---

## Notes

- No Android Studio required — fully Gradle CLI compatible
- No Firebase, no services, no advanced logic in Phase 1
- CodeMagic CI builds on first run without manual fixes
