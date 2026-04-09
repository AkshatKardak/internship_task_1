# 🧮 Java Console Calculator

**Internship Task 1 — Java Developer Internship**

---

## 📌 Objective

Build a basic calculator using Java console I/O that supports the four fundamental arithmetic operations: **Addition, Subtraction, Multiplication, and Division**.

---

## 🛠 Tools Used

- **Language:** Java (JDK 8+)
- **IDE:** VS Code / IntelliJ IDEA CE
- **Environment:** Terminal / Command Prompt

---

## 📁 Project Structure

```
internship_task_1/
├── Calculator.java    # Main Java source file
└── README.md          # Project documentation
```

---

## ✅ Features

- **Addition** — Adds two numbers
- **Subtraction** — Subtracts second number from first
- **Multiplication** — Multiplies two numbers
- **Division** — Divides two numbers with divide-by-zero protection
- **Loop** — Allows multiple calculations in a single session
- **Input Validation** — Handles invalid/non-numeric input gracefully
- **Clean Exit** — User can exit anytime by choosing option 5

---

## 🚀 How to Run

### Step 1: Compile
```bash
javac Calculator.java
```

### Step 2: Run
```bash
java Calculator
```

---

## 💡 Sample Output

```
Welcome to the Java Console Calculator!

==============================
     Java Console Calculator   
==============================
1. Addition       (+)
2. Subtraction    (-)
3. Multiplication (*)
4. Division       (/)
5. Exit
==============================
Choose an option (1-5): 1
Enter first number: 15
Enter second number: 7
Result: 15.00 + 7.00 = 22.00

Choose an option (1-5): 4
Enter first number: 10
Enter second number: 0
Error: Division by zero is not allowed.

Choose an option (1-5): 5
Thank you for using the Calculator. Goodbye!
```

---

## 🔑 Key Concepts Covered

| Concept | Implementation |
|---|---|
| **OOP** | Static methods encapsulating each operation |
| **Methods** | `add()`, `subtract()`, `multiply()`, `divide()` |
| **Conditionals** | `switch-case` for operation selection, `if` for divide-by-zero |
| **Loops** | `while` loop for continuous calculator session |
| **I/O** | `Scanner` class for reading user input from console |
| **Input Validation** | `hasNextInt()`, `hasNextDouble()` guards against bad input |

---

## 📖 Interview Q&A (Quick Reference)

**1. What is method overloading?**  
Defining multiple methods with the same name but different parameter types/counts. E.g., `add(int a, int b)` and `add(double a, double b)`.

**2. How do you handle divide-by-zero?**  
Check if the divisor is `0` before performing division and display an error message, returning `Double.NaN`.

**3. Difference between `==` and `.equals()`?**  
`==` compares object references (memory address); `.equals()` compares the actual content/value of objects.

**4. What are the basic data types in Java?**  
`byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`.

**5. How is Scanner used for input?**  
`Scanner scanner = new Scanner(System.in);` — then use `scanner.nextInt()`, `scanner.nextDouble()`, etc.

**6. Explain the role of a loop.**  
Loops repeat a block of code while a condition is true, enabling multiple calculations without restarting the program.

**7. Difference between `while` and `for` loop?**  
`for` is used when the number of iterations is known; `while` is used when the condition is evaluated dynamically.

**8. What is the JVM?**  
Java Virtual Machine — it interprets the compiled bytecode (.class files) and runs them on any platform.

**9. How is Java platform-independent?**  
Java compiles to bytecode, not machine code. The JVM on each OS interprets the same bytecode — "Write Once, Run Anywhere".

**10. How do you debug a Java program?**  
Use IDE breakpoints, `System.out.println()` statements, or the `jdb` debugger. IDEs like IntelliJ and VS Code offer built-in debugging tools.

---

## 👤 Author

**Akshat Kardak**  
Java Developer Internship — Task 1
