package com.company;

import com.company.Employee;

public class Domain 
{
    public static void main( String[] args )
    {
        Employee emp = new Employee();
        emp.setFirstName("Alex");
        emp.setLastName("Dov");

        System.out.println(emp);
    }
}
