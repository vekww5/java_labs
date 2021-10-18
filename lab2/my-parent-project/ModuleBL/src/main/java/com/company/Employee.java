package com.company;

public class Employee 
{

    private String firstName;
    private String lastName;

    Employee (){}

    public void setFirstName (String firstName){
        this.firstName = firstName;
    }

    public void setLastName (String lastName){
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    @Override
    public String toString(){
        return firstName + " " + lastName;
    }

}
