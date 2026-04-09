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

## 👤 Author

**Akshat Kardak**  
Java Developer Internship — Task 1  
🔗 GitHub: [https://github.com/AkshatKardak](https://github.com/AkshatKardak)
