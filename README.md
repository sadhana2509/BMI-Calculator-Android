# BMI Calculator Android App

A simple and beginner-friendly Android application that calculates Body Mass Index (BMI) based on the user's height and weight.

## 📱 About the Project

The BMI Calculator allows users to enter their height in meters and weight in kilograms. The application calculates the BMI and displays the corresponding health category.

## ✨ Features

- Enter height in meters
- Enter weight in kilograms
- Calculate BMI instantly
- Display BMI value up to 2 decimal places
- Display BMI category
- Input validation for empty and invalid values
- Simple and user-friendly interface

## 🧮 BMI Formula

BMI is calculated using:

**BMI = Weight (kg) / Height² (m²)**

### BMI Categories

| BMI Range | Category |
|---|---|
| Below 18.5 | Underweight |
| 18.5 – 24.9 | Normal |
| 25.0 – 29.9 | Overweight |
| 30.0 and above | Obese |

## 🛠️ Technologies Used

- Java
- XML
- Android Studio
- Android SDK
- Git & GitHub

## 📂 Project Structure

```text
BMI-Calculator-Android/
│
├── app/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── com.example.bmicalculator/
│           │       └── MainActivity.java
│           │
│           └── res/
│               ├── layout/
│               │   └── activity_main.xml
│               └── values/
│                   └── strings.xml
│
├── .gitignore
├── build.gradle.kts
├── gradle.properties
├── settings.gradle.kts
└── README.md
