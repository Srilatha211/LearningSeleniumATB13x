
# Selenium 4.35 Learning & Implementation 🚀

This repository documents my hands-on learning journey of **Selenium 4.x for Web Automation**, inspired by **TheTestingAcademy (Pramod’s notes)**.

The goal is to implement each concept step by step, practice real-time examples, and build a strong Selenium automation framework.

---

## 📚 Topics to Learn & Implement

* ✅ **Setup & Basics**

    * Install Java, Maven, and IDE (IntelliJ/Eclipse)
    * Configure Browser Drivers
    * Run First Selenium Script

* ✅ **Selenium Fundamentals**

    * WebDriver Architecture (W3C Protocol in Selenium 4)
    * ChromeDriver, FirefoxDriver, EdgeDriver usage
    * Navigation commands (get, back, forward, refresh)

* ✅ **Locators & Web Elements**

    * `findElement` vs `findElements`
    * XPath (Absolute, Relative, Functions, Axes)
    * CSS Selectors
    * Handling Forms, Buttons, Links

* ✅ **Waits & Synchronization**

    * Implicit Wait
    * Explicit Wait with ExpectedConditions
    * Fluent Wait

* ✅ **Web Interactions**

    * Dropdowns (Static & Dynamic)
    * Alerts, Checkboxes, Radio buttons
    * Web Tables (Static & Dynamic)
    * Actions class (Mouse/Keyboard events)
    * Windows & iFrames
    * File Uploads & Downloads

* ✅ **Advanced Selenium**

    * JavaScript Executor
    * Handling Dynamic Elements
    * Exceptions in Selenium
    * Handling SVG & Shadow DOM

* ✅ **Framework & Utilities**

    * TestNG Integration
    * Allure Reporting
    * Page Object Model (POM) & Page Factory
    * Data-Driven Testing with Apache POI
    * Property Reader Utility
    * Log4j Logging

* ✅ **Scalability & CI/CD**

    * Selenium Grid 4 & Parallel Execution
    * Running on Docker & Cloud Providers (BrowserStack)
    * Jenkins CI/CD Integration

---

## 🛠 Tech Stack

* **Java 11+**
* **Maven**
* **Selenium 4.x**
* **TestNG**
* **Allure Reports**
* **Apache POI**
* **Log4j**
* **Jenkins / Docker / BrowserStack**

---

## 📂 Repository Structure

```
selenium-4x-learning/
│── src/
│   ├── main/java/   # Utility & Framework Code
│   └── test/java/   # Test Cases
│
│── pom.xml          # Maven dependencies
│── README.md        # This file
```

---

## 🚀 Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/selenium-4x-learning.git
   cd selenium-4x-learning
   ```

2. Install dependencies:

   ```bash
   mvn clean install
   ```

3. Run tests:

   ```bash
   mvn test
   ```

4. Generate Allure Report:

   ```bash
   allure serve target/allure-results
   ```

---

## 📌 Learning Progress Tracker

* [ ] Setup & First Script
* [ ] Implement All Locators
* [ ] Add Waits (Implicit, Explicit, Fluent)
* [ ] Automate VWO Login (Valid/Invalid)
* [ ] Handle Alerts, Windows, iFrames
* [ ] Work with Web Tables & Actions
* [ ] Build POM Framework
* [ ] Data-Driven Testing (Apache POI)
* [ ] Setup Grid & Docker Execution
* [ ] Integrate with Jenkins

---

## ✨ Author

👤 **Srilatha Kore**
📘 Learning Selenium with guidance from *TheTestingAcademy*

