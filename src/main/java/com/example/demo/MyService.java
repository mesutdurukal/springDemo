package com.example.demo;

public class MyService {

    MySecondServices mySecondServices;

    // Dependency Injection over constructor
    public MyService(final MySecondServices mySecondServices)
    {
        this.mySecondServices = mySecondServices;
    }
    public int myFunction() {
        final int currentMembers = mySecondServices.getCurrentMemberCount();
        return currentMembers+1;
    }
}
