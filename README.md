# DemoQA Test Automation Framework

 A production‑style Selenium automation framework built using **Java + TestNG + Maven + Page Object Model** to simulate real‑world QA automation projects.

This project demonstrates my ability to design scalable automation architecture, write maintainable test code, and validate web applications like a professional Automation Test Engineer.

---

## Why This Project Matters

Instead of writing simple scripts, this framework follows **industry automation standards**:

* Clean Page Object Model architecture
* Reusable driver management
* Scalable test design
* Maintainable utilities
* Easy addition of new test modules

This mirrors how automation frameworks are built in real companies.

---

## Tech Stack

* Java
* Selenium WebDriver
* TestNG
* Maven
* Page Object Model (POM)
* WebDriverManager

---

## What This Framework Tests

Automated functional validation of DemoQA website components:

* Form submission & validation
* Text fields & buttons
* Alerts handling
* Browser tabs/windows switching
* Element interactions
* UI behaviour verification

---

## Framework Design

```
src/test/java
 ├── base        → Driver setup & teardown
 ├── pages       → Page Object classes (locators + actions)
 ├── tests       → Test scenarios
 └── utils       → Reusable methods (scroll, waits, actions)
```

Key Design Goal: **Maximum reusability, minimum code duplication**

---

## How To Run

Clone repository

```
git clone https://github.com/supraja1901/DemoQa.git
cd DemoQa
```

Install dependencies

```
mvn clean install
```

Execute tests

```
mvn test
```

Or run `testng.xml` from IDE.

---

## Test Reports

Generated automatically at:

```
target/surefire-reports
```

---

## Skills Demonstrated

* Automation Framework Design
* Selenium WebDriver
* TestNG Assertions & Annotations
* Page Object Model implementation
* Synchronization handling
* Browser control & navigation
* Clean code practices for QA automation

---

## Planned Enhancements

* Extent Reports integration
* Data Driven Testing (Excel/CSV)
* Cross Browser Testing
* CI/CD using GitHub Actions
* Parallel execution

---

## Author

**Supraja Maile**
Aspiring Automation Test Engineer (Selenium Java)

If you are a recruiter or hiring manager, this project represents how I structure and build maintainable automation frameworks rather than simple scripts.
