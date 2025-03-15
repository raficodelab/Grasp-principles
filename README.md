# Single Responsibility Principle (SRP)

## 📌 Introduction
The **Single Responsibility Principle (SRP)** is one of the SOLID principles of object-oriented design. It states that:
> **"A class should have only one reason to change."**

This means that a class should have only **one job or responsibility**, making it easier to maintain, test, and extend.

---

## 🛑 Problem (Without SRP)
In the `withoutsrp` package, we have a **UserManager** class that **violates SRP** by handling:
- **User-related operations** (e.g., displaying user details)
- **Database operations** (e.g., saving user to the database)

This results in **low maintainability** because changes to the database logic will require modifying the same class, even if user-related logic remains unchanged.

```java
class UserManager {
    private String name;

    public UserManager(String name) {
        this.name = name;
    }

    public void displayUser() {
        System.out.println("User: " + name);
    }

    public void saveToDatabase() {
        System.out.println("Saving user to database...");
    }
}
