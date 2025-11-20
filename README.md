Bank Account Simulation – README
📌 Project Overview

This project is a Bank Account Simulation developed using Java OOP concepts.
It simulates basic banking operations like deposit, withdraw, and viewing transaction history, helping understand classes, objects, inheritance, and method overriding.

🛠 Technologies Used

Java

VS Code / any IDE

Command Line / Terminal

🎯 Objectives

Implement an Account class with:

deposit()

withdraw()

Maintain:

Account balance

Transaction history

Apply OOP features:

Classes

Inheritance

Method overriding

(As mentioned in the task description on Page 1 of your PDF 

task 5 (2)

)

📂 Project Structure

/BankAccountSimulation

│── Account.java

│── SavingsAccount.java

│── Main.java

│── README.md

📘 Features Implemented
✔ 1. Account Class

Stores account number, holder name, and balance.

Supports:

deposit(amount)

withdraw(amount)

viewTransactions()

✔ 2. SavingsAccount Class (Inheritance)

Extends Account

Can override withdraw() to enforce rules (example: minimum balance)

✔ 3. Transaction History

Every transaction is stored in a list.

Example:

“Deposited ₹500”

“Withdrawn ₹200”

“Balance: ₹300”

✔ 4. User Interaction (Main Class)

Menu-driven console program:

Deposit

Withdraw

Check Balance

View Transactions

Exit

📄 How to Run
Step 1: Compile
javac Main.java

Step 2: Run
java Main

🧠 Key OOP Concepts Used

(From the interview questions on Page 1 of your PDF 

task 5 (2)

)

Classes & Objects

Inheritance

Method Overriding

Encapsulation

Constructor Overloading

Runtime Polymorphism
