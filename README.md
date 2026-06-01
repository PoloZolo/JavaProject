# JavaProject

A comprehensive Java application that performs various mathematical calculations and student grade management. This project demonstrates core Java programming concepts including object-oriented design, methods, and data handling.

## Features

### 📐 Geometric Calculations
- **Circle Area Calculator** - Calculate the area of a circle given its radius
- **Rectangle Area Calculator** - Calculate the area of rectangles with given dimensions
- **Sphere Area Calculator** - Calculate the surface area and volume of spheres

### 📊 Student Grade Management
- **Marks Calculator** - Enter student marks for multiple subjects
- **Total Marks Computation** - Automatically calculate total marks for each student
- **Grade Analysis** - Process and display student performance data

## Technologies Used

- **Java** - Core programming language
- **Object-Oriented Programming (OOP)** - Classes, methods, and encapsulation
- **Java Collections** (if applicable) - For storing and managing student data
- **Standard I/O** - For user input and output

## Project Structure

```
JavaProject/
├── README.md
├── src/
│   ├── calculations/
│   │   ├── GeometricCalculator.java      (Circle, Rectangle, Sphere calculations)
│   │   └── StudentGradeCalculator.java   (Student marks and total calculations)
│   └── Main.java                          (Entry point)
└── [Additional source files]
```

## Installation

### Prerequisites
- Java 8 or higher installed on your system
- A Java IDE (Eclipse, IntelliJ IDEA) or command-line terminal

### Setup Steps

1. **Clone the repository**
   ```bash
   git clone https://github.com/PoloZolo/JavaProject.git
   cd JavaProject
   ```

2. **Compile the Java files**
   ```bash
   javac src/*.java
   javac src/calculations/*.java
   ```

3. **Run the application**
   ```bash
   java -cp src Main
   ```

## Usage

### Example 1: Calculate Circle Area
```
Input: Radius = 5
Output: Area of Circle = 78.54 square units
```

### Example 2: Calculate Rectangle Area
```
Input: Length = 10, Width = 8
Output: Area of Rectangle = 80 square units
```

### Example 3: Calculate Sphere Measurements
```
Input: Radius = 3
Output: Surface Area = 113.10 square units
Output: Volume = 113.10 cubic units
```

### Example 4: Student Marks Calculator
```
Input: 
  Student Name: John
  Marks in Subject 1: 85
  Marks in Subject 2: 90
  Marks in Subject 3: 78

Output:
  Total Marks: 253 / 300
  Percentage: 84.33%
```

## How It Works

### Geometric Calculations
- Uses mathematical formulas for area and volume calculations
- Accepts user input for dimensions
- Displays calculated results with appropriate units

### Student Grade System
- Stores student information and their marks
- Calculates total marks across multiple subjects
- Can process multiple students

## Learning Outcomes

This project demonstrates:
- ✅ Method creation and reusability
- ✅ Object-oriented programming principles
- ✅ User input handling
- ✅ Mathematical computations
- ✅ Data management and processing

## Future Enhancements

- Add percentage and grade assignment for students
- Implement file I/O to save/load student data
- Create a GUI using Swing or JavaFX
- Add more geometric shapes (Cylinder, Cone, etc.)
- Implement data validation and error handling

## Author

**PoloZolo**
- GitHub: [@PoloZolo](https://github.com/PoloZolo)

## License

This project is open source and available under the MIT License.

## Contributing

Contributions are welcome! Feel free to fork this repository and submit pull requests with improvements or new features.

---

**Happy Coding! 🚀**
