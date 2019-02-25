/*
 * Assignment - Car purchase utility application
 */
package carpurchaseutility.util;

import carpurchaseutility.controller.Admin;
import java.util.Scanner;

/**
 * A Application that is used by admin for managing customers.
 * @author sahil
 */
public class CarPurchaseUtility {

    /*
    *
    * Some Constants variable used for switching menu
    *
    */
     private final static int ADD_CUSTOMER = 1;             
     private final static int ADD_CAR = 2;                  
     private final static int LIST_CUSTOMER = 3;            
     private final static int LIST_BY_ID = 4;              
     private final static int GENERATE_PRIZE = 5;          
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**The Main Function of the application*/
        //To get Admin choice of using the menu
         int adminChoice;
        //To get Choice of admin for repeating the menu
        String reMenu;   
       //Admin class object created for using methods of Admin Class
        Admin admin=new Admin();
        //Scanner object sc for getting input from admin
       Scanner sc=new Scanner(System.in).useDelimiter("\\n");
      //Do-while loop used for repeating the menu
       do
       {
           //this is the menu through which admin will be able to access all the options
       System.out.println("Welcome Admin");           
       System.out.println("What you want to do");
       System.out.println("1.Add new Customer");
       System.out.println("2.Add new  Car to an existing Customer");
       System.out.println("3.List all Customers with their cars sorted by name");
       System.out.println("4.List individual Customer based on ID");
       System.out.println("5.Generate prizes for the customer");
       //Collecting choice from user
       while(!sc.hasNextInt()){
            System.out.println("That's not a number!");
            sc.next();
       }
       adminChoice = sc.nextInt();
       //Switch case to call method accordingly
          switch(adminChoice)
       {
           case ADD_CUSTOMER     ://method in Admin class for adding a new customer
                                   admin.addNewCustomer();  
                                   break;
           case ADD_CAR          ://method in Admin class for adding a new car to exsiting customer
                                   admin.addCarToCustomer();
                                   break;
           case LIST_CUSTOMER    ://method in Admin class for listing all customer with their car
                                   admin.viewCustomers();
                                   break;  
           case LIST_BY_ID        ://method in Admin class for searching a customer by id
                                   admin.listById();
                                   break;
           case GENERATE_PRIZE   ://method in Admin class for generating prizes
                                   admin.generatePrize();
                                   break;
          
           default: System.out.println("Please enter Correct choice Admin ");
               
       }
      System.out.println("Want to use menu again?  Y for Yes , N for No");
      while(!sc.hasNext("[yYnN]")){
          System.out.println("That's not a Correct Choice!");
          sc.next();
      }
      reMenu= sc.next();
     
      //loop for repeating the menu
       
     }while(reMenu.equals("Y")||reMenu.equals("y"));
 
       
    }
    
    
    
}
