# JetBrains-Kotlin-Tutorial
# Kotlin Professional Certificate: Introduction & Environment Setup

Welcome to the **Kotlin Professional Certificate Program**! This repository serves as a foundational guide to kickstart your journey with Kotlin, covering key language concepts and providing a step-by-step walkthrough to configure **IntelliJ IDEA** for your coursework and assessments.

---

## Table of Contents
1. [Introduction to Kotlin](#introduction-to-kotlin)
    - [What is Kotlin?](#what-is-kotlin)
    - [Core Features & Advantages](#core-features--advantages)
    - [Where Kotlin is Used](#where-kotlin-is-used)
2. [Prerequisites](#prerequisites)
3. [Step-by-Step IntelliJ IDEA Setup](#step-by-step-intellij-idea-setup)
    - [Step 1: Download and Install IntelliJ IDEA](#step-1-download-and-install-intellij-idea)
    - [Step 2: Install & Configure the Java Development Kit (JDK)](#step-2-install--configure-the-java-development-kit-jdk)
    - [Step 3: Install Certificate & Learning Plugins](#step-3-install-certificate--learning-plugins)
    - [Step 4: Create Your First Kotlin Project](#step-4-create-your-first-kotlin-project)
    - [Step 5: Write and Execute Your First Program](#step-5-write-and-execute-your-first-program)
4. [Working with Course Assignments & Tests](#working-with-course-assignments--tests)
5. [Essential Shortcuts & Productivity Tips](#essential-shortcuts--productivity-tips)
6. [Troubleshooting Common Setup Issues](#troubleshooting-common-setup-issues)
7. [Official Resources & Documentation](#official-resources--documentation)

---

## Introduction to Kotlin

### What is Kotlin?
**Kotlin** is a modern, statically typed, open-source programming language developed by **JetBrains** (the creators of IntelliJ IDEA). In 2019, Google declared Kotlin the preferred language for Android development ("Kotlin-first"). Designed to overcome limitations of older languages while remaining fully pragmatic, Kotlin compiles down to JVM bytecode, JavaScript, and native binaries.

### Core Features & Advantages
* **100% Java Interoperability:** Call existing Java libraries directly from Kotlin code and vice versa without wrapping or boilerplate.
* **Null Safety:** Distinguishes nullable types from non-nullable types in its type system, drastically reducing the infamous `NullPointerException` (the "Billion-Dollar Mistake").
* **Concise and Expressive:** Reduces boilerplate code (e.g., automated getters, setters, equals, hashCode, and copy methods via `data class`).
* **Coroutines for Asynchronous Tasks:** First-class support for lightweight, non-blocking asynchronous programming, making concurrent code read like sequential code.
* **Functional & Object-Oriented:** Supports lambdas, higher-order functions, extension functions, immutability by default, alongside full OOP design patterns.

### Where Kotlin is Used
* **Android Development:** Industry standard for native Android mobile applications.
* **Server-Side Development:** Used with frameworks such as Spring Boot, Ktor, and Micronaut for microservices and APIs.
* **Multiplatform (KMP):** Write shared business logic once across iOS, Android, Desktop, and Web.

---

## Prerequisites

Before starting, verify your machine meets the following minimum requirements:
* **Operating System:** macOS 10.15+, Windows 10/11 (64-bit), or Linux (Ubuntu 20.04+, Fedora, etc.).
* **Hardware:**
    * Minimum 8 GB RAM (16 GB strongly recommended).
    * At least 5 GB free disk space for IDE, caches, and SDKs.
* **Account:** A free [JetBrains Account](https://account.jetbrains.com/) (often needed for course verification and plugin sync).

---

## Step-by-Step IntelliJ IDEA Setup

### Step 1: Download and Install IntelliJ IDEA
1. Visit the [official JetBrains IntelliJ IDEA download page](https://www.jetbrains.com/idea/download/).
2. Select your operating system.
3. Choose your edition:
    * **IntelliJ IDEA Community Edition:** Free, open-source, and fully capable of handling all core Kotlin course tasks.
    * **IntelliJ IDEA Ultimate:** Includes advanced enterprise and database tools (free trial available; free for verified students/educators).
4. Run the installer and follow the on-screen instructions:
    * Check **"Add bin folder to PATH"** (Windows/Linux).
    * Check **"Create Desktop Shortcut"**.

### Step 2: Install & Configure the Java Development Kit (JDK)
Kotlin runs on the JVM and requires a modern Java Development Kit (JDK 17 or JDK 21 LTS is standard):

1. Launch IntelliJ IDEA.
2. In the Welcome window, click **Customize** (or **Settings** / **Preferences**) $\rightarrow$ **All settings...**.
3. Navigate to **Build, Execution, Deployment** $\rightarrow$ **Build Tools** $\rightarrow$ **Gradle** (or **Project Structure** $\rightarrow$ **SDKs**).
4. Alternatively, download the JDK directly from the IDE:
    * Open **File** $\rightarrow$ **Project Structure** $\rightarrow$ **SDKs**.
    * Click the **`+`** icon $\rightarrow$ **Download JDK...**.
    * Vendor: Select **Eclipse Temurin (Adoptium)** or **Amazon Corretto**.
    * Version: Select **17** or **21** (check your certification syllabus; JDK 17/21 are both LTS standards).
    * Click **Download**. IntelliJ will configure paths automatically.

### Step 3: Install Certificate & Learning Plugins
If your certification utilizes JetBrains Academy, Coursera, or Hyperskill:

1. In IntelliJ, open **Settings** (Windows/Linux: `Ctrl + Alt + S`, macOS: `Cmd + ,`).
2. Select **Plugins** in the left sidebar.
3. Open the **Marketplace** tab and search for:
    * **JetBrains Academy** (formerly *EduTools*): Enables in-IDE interactive course loading, automated task checks, and assignment submissions.
    * **Kotlin**: Bundled by default, but verify it is enabled and up-to-date.
4. Click **Install**, then click **Restart IDE** if prompted.

### Step 4: Create Your First Kotlin Project
1. From the Welcome screen, click **New Project** (or **File** $\rightarrow$ **New** $\rightarrow$ **Project...**).
2. Configure project settings:
    * **Name:** `KotlinBasics`
    * **Language:** `Kotlin`
    * **Build system:** `Gradle` (Recommended for professional certificates) or `IntelliJ` (for simple single-file scripts).
    * **JDK:** Choose the downloaded JDK 17 or 21.
    * **Gradle DSL:** `Kotlin` (`build.gradle.kts`).
3. Click **Create**.
4. Allow IntelliJ to complete the initial Gradle sync (progress bar at the bottom status bar).

### Step 5: Write and Execute Your First Program
1. In the **Project** tool window (left side), navigate to:
   ```text
   KotlinBasics/
   └── src/
       └── main/
           └── kotlin/
   ```
2. Right-click on the `kotlin` folder $\rightarrow$ **New** $\rightarrow$ **Kotlin Class/File**.
3. Name it `Main` and select **File**.
4. Enter the standard entry-point function:

```kotlin
fun main() {
    val courseTitle: String = "Kotlin Professional Certificate"
    val studentName: String = "Student"

    println("Welcome to the $courseTitle, $studentName!")
    println("IntelliJ IDEA environment setup is complete.")
}
```

5. Click the green **Run ▶** arrow next to `fun main()` in the editor gutter (or press `Shift + F10` on Windows/Linux, `Ctrl + R` on macOS).
6. Verify the output in the bottom **Run** panel:
   ```text
   Welcome to the Kotlin Professional Certificate, Student!
   IntelliJ IDEA environment setup is complete.
   ```

---

## Working with Course Assignments & Tests

Most professional certificate assignments use automated test suites (e.g., JUnit 5 or MockK):

1. **Locating Tests:** Assignment tests reside under `src/test/kotlin/`.
2. **Running Tests:**
    * Right-click the test file (e.g., `ModuleOneTest.kt`) $\rightarrow$ Click **Run 'ModuleOneTest'** (or `Ctrl + Shift + F10` / `Cmd + Shift + R`).
    * A passing test suite will display green checkmarks in the test runner tool window.
3. **JetBrains Academy Courses:**
    * Click **My Courses** on the Welcome screen.
    * Log into your connected course provider (JetBrains Academy / Hyperskill / Coursera).
    * Complete tasks in the code window, then click the **Check** button in the Task Description pane to validate your answer against remote automated tests.

---

## Essential Shortcuts & Productivity Tips

| Action | Windows / Linux | macOS |
| :--- | :--- | :--- |
| **Search Everywhere** | `Shift` + `Shift` | `Shift` + `Shift` |
| **Show Context Actions / Quick Fix** | `Alt` + `Enter` | `Option` + `Enter` |
| **Reformat Code** | `Ctrl` + `Alt` + `L` | `Cmd` + `Option` + `L` |
| **Run Program** | `Shift` + `F10` | `Ctrl` + `R` |
| **Debug Program** | `Shift` + `F9` | `Ctrl` + `D` |
| **Generate Code (Constructors, Tests)** | `Alt` + `Insert` | `Cmd` + `N` |
| **Optimize Imports** | `Ctrl` + `Alt` + `O` | `Ctrl` + `Option` + `O` |

---

## Troubleshooting Common Setup Issues

* **Issue: "Project SDK is not defined"**
    * *Fix:* Open **File** $\rightarrow$ **Project Structure** $\rightarrow$ **Project**. Select your installed JDK from the **SDK** dropdown and set the **Language Level** to match the JDK version.
* **Issue: Gradle sync failed / unresolved dependencies**
    * *Fix:* Ensure your internet connection is active, then click the Gradle tab on the right side and click the circular **Reload All Gradle Projects** button.
* **Issue: Kotlin plugin version incompatibility**
    * *Fix:* Open `build.gradle.kts` and verify the `kotlin("jvm")` plugin version matches the target version required by your certification coursework (e.g., `id("org.jetbrains.kotlin.jvm") version "1.9.22"`).

---

## Official Resources & Documentation

* [Kotlin Official Documentation](https://kotlinlang.org/docs/home.html)
* [Kotlin Standard Library Reference](https://kotlinlang.org/api/latest/jvm/stdlib/)
* [Kotlin Koans (Interactive Exercises)](https://play.kotlinlang.org/koans/overview)
* [JetBrains Academy Kotlin Track](https://hyperskill.org/tracks)
* [Kotlin Style Guide & Conventions](https://kotlinlang.org/docs/coding-conventions.html)