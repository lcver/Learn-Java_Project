/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailapp;

import java.util.Scanner;

/**
 *
 * @author lucver
 */
public class Email {
    
    private String firstName;
    private String lastName;
    private String department;
    private int mailBoxCapacity;
    
    // Construct to receive the first name and last name
    public Email(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        
        this.department = setDepartment();
        
        System.out.println("Email Created");
        System.out.println("==========================");
        System.out.println("Name : "+this.firstName+" "+this.lastName);
        System.out.println("Department : "+this.department);
        System.out.println("==========================");
    }
    
    // Ask for department
    public String setDepartment()
    {
        System.out.println("Enter the department\n1 for sales\n2 for Developer \n3 for none");
        System.out.println("> ");
        
        Scanner input = new Scanner(System.in);
        int choise = input.nextInt();
        
        if(choise == 1) {return "Sales";}
        else if (choise == 2) {return "Developer";}
        else if (choise == 3) {return "none";}
        else {return "";}
            
    }
    
    
    // Set the mailbox capacity example 500mb
    
    
    // Set the alternative email
    
    
    
    // Change the password
    
    
    
}
