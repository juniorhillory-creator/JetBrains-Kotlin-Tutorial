# Kotlin Multiplatform Development

## Introduction

Kotlin Multiplatform (KMP) is a technology by JetBrains that lets you share code across platforms — Android, iOS, desktop, web, and server — while still writing platform-specific code where you need it.

### Why Kotlin Multiplatform?

- **Shared business logic**: Write core logic once and reuse it on every target platform, eliminating duplicated code.
- **Native performance**: KMP compiles to the native format of each platform (JVM bytecode, native binaries, JavaScript), so there is no runtime interpretation overhead.
- **Gradual adoption**: You don't have to rewrite an existing app. KMP can be introduced module by module into an existing project.
- **Platform access**: Unlike cross-platform frameworks that abstract the platform away, KMP gives you direct access to platform APIs through the `expect`/`actual` mechanism.

### How It Works

KMP projects are organized into source sets:

| Source Set | Purpose |
|---|---|
| `commonMain` | Shared code that compiles for all targets |
| `androidMain` | Android-specific implementations |
| `iosMain` | iOS-specific implementations (Kotlin/Native) |
| `jvmMain` | JVM desktop/server-specific code |
| `jsMain` | Kotlin/JS browser or Node.js code |

In `commonMain`, you declare **`expect`** declarations — interfaces or functions the shared code needs but each platform provides differently. Each platform source set supplies the matching **`actual`** implementation.

```kotlin
// commonMain
expect fun platformName(): String

// androidMain
actual fun platformName(): String = "Android"

// iosMain
actual fun platformName(): String = "iOS"
```

### Key Components

- **Kotlin Multiplatform (KMP)**: The compiler and tooling that enable multi-target compilation.
- **Compose Multiplatform**: JetBrains' UI framework built on Jetpack Compose, allowing shared UI code across Android, iOS, desktop, and web.
- **Ktor**: A multiplatform HTTP client/server framework.
- **kotlinx.serialization**: Multiplatform JSON and other format serialization.
- **SQLDelight**: Multiplatform database library generating typesafe Kotlin from SQL.

### Getting Started

The easiest way to create a new KMP project is the [Kotlin Multiplatform Wizard](https://kmp.jetbrains.com/) or the KMP plugin in IntelliJ IDEA / Android Studio.
