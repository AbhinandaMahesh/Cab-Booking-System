# Cab-Booking-System

A simple Java program that simulates a cab booking system with different cab types and fare calculations.

## Features

- **Multiple Cab Types**: Mini, Sedan, and SUV
- **Fare Calculation**: Automatic fare calculation based on cab type
- **Distance-based Pricing**: Calculate fares based on distance traveled
- **Booking Tracking**: Keep track of total bookings made
- **Customer Management**: Store customer names and booking details

## How It Works

1. The system starts with a static initialization showing "cab booking started"
2. You can create cab bookings with different customer names and cab types
3. Fares are automatically calculated:
   - Mini: ₹100 base / ₹10 per km
   - Sedan: ₹200 base / ₹15 per km  
   - SUV: ₹300 base / ₹20 per km
4. The system tracks total number of bookings
5. Display booking details including customer name, cab type, and fare

## Example Usage

```java
cab x1 = new cab(); // Creates booking with "guest" and "mini"
cab x2 = new cab("Abhinanda", "sedan");
cab x3 = new cab("kiran", "suv");
```

## Output

The program displays:
- Individual booking details
- Distance-based fare calculations
- Total number of bookings made

This is a basic object-oriented programming example demonstrating constructors, static methods, method overloading, and class properties in Java.
