package com.example.xmlconfig.initdestroy;

public class UserService {

    public UserService() {
        System.out.println("Constructor called");
    }

    public void print() {
        System.out.println("Print method called");
    }

    public void init() {
        System.out.println("Post construct init method");
    }

    public void destroy() {
        System.out.println("Pre destroy method");
    }
}
