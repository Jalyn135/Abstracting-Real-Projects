# Oven Simulator

## 📘 Project Description
The **Oven Simulator** is a Java program that models the behavior of an oven. It allows users to create and interact with virtual ovens, showcasing their properties and behaviors. Users can heat up the oven, bake food, clean it, and modify its appearance. The program demonstrates object-oriented programming concepts like classes, methods, and encapsulation.

When users run the program, they will see the details of two ovens (a default oven and a custom oven). They can interact with the ovens by heating them, baking food, cleaning them, and changing their properties like color. This simulation is unique because it includes a secondary class ('Door') to represent the oven's door condition, adding an extra layer of realism.

---

## 🎮 Features
- **Create Ovens**: Supports both default and custom ovens with unique properties.
- **Behavior Methods**:
  - Heat up the oven by a specified amount.
  - Bake food, which sets the oven to a default temperature and marks it as dirty.
  - Self-clean the oven to restore cleanliness.
- **Getter and Setter Methods**:
  - Retrieve and modify oven properties like color and door condition.
- **Secondary Class**: Includes a 'Door' class to represent the oven's door condition.

---

## 🧱 How the Code Works
### Main Classes:
1. **Oven**:
   - Represents the oven with properties like temperature, size, color, cleanliness, energy source, and door condition.
   - Includes methods to modify and interact with the oven's state.
2. **Door**:
   - Represents the condition of the oven's door (e.g., intact, damaged, repaired).
   - Used as a property within the 'Oven' class.

### Interaction:
- The 'App' class (tester) creates two ovens: one with default values and one with custom values.
- Behavior methods ('heatUp', 'bakeFood', 'selfClean') are called to demonstrate how the oven's state changes.
- Getter and setter methods are used to retrieve and modify properties like color and door condition.

### Data Storage:
- Properties like temperature, size, and cleanliness are stored as instance variables in the 'Oven' class.
- The 'Door' class is used as a secondary object within the 'Oven' class to represent the door condition.

---

## ▶️ How to Run the Program
1. **Files to Compile**:
   - 'Oven.java'
   - 'Door.java'
   - 'App.java'

2. **Steps**:
   - Place all three files in the same directory (e.g., 'src' folder).
   - Open a terminal and navigate to the project directory.
   - Compile the files:
     '''bash
     javac -d bin src/*.java
     '''
   - Run the program:
     '''bash
     java -cp bin App
     '''

3. **Expected Output**:
   - The program will display the details of two ovens, demonstrate their behaviors (heating, baking, cleaning), and show how their properties can be modified.

---

## 📈 Development Process
This project was developed using object-oriented programming principles. The goal was to create a realistic simulation of an oven while demonstrating the use of classes, methods, and encapsulation. Challenges included designing the interaction between the 'Oven' and 'Door' classes and ensuring the program's behaviors were intuitive and realistic. Future improvements could include adding more behaviors (e.g., preheating) or additional properties (e.g., timer).

---

## 🧠 Author Info
**Author**: [Your Name]  
This project helped me strengthen my understanding of object-oriented programming, especially the use of secondary classes and encapsulation.
