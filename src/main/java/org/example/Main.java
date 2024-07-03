package org.example;

// Assuming sauceDemoLogin is in the same package
// If it's in a different package, import it like this: import org.example.sauceDemoLogin;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        sauceDemoLogin login = new sauceDemoLogin();
        login.login(); // Call the login method from sauceDemoLogin

    }
}