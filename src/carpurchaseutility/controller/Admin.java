/**
 *
 * @author Sahil Puri
 */

package carpurchaseutility.controller;

import carpurchaseutility.util.RandomGenerator;
import carpurchaseutility.model.Customer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
/**
 * Class Admin which consists of all the methods used to perform following tasks:
 * Add new Customer, 
 * Add new Car to an existing Customer, 
 * List all Customers with their cars sorted by name, 
 * List individual Customer based on ID, 
 * Generate prizes for the customer.
 *
 * 
 */
public class Admin
{
     //Scanner object sc for getting input from admin
    Scanner sc= new Scanner(System.in).useDelimiter("\\n");
    //Arrayzlist of Customer Type to store Customers
    ArrayList<Customer> customerList = new ArrayList<>();
  
/*
    Method addNewCustomer
    Adds new Customer to ArrayList customerList
    .
    @param none
    
*/    
 public  void addNewCustomer()
    {
        int checkId=0;
       int id;
        System.out.println("Enter Customer ID");
        id=sc.nextInt();
        for(Customer custIter : customerList){
            if(custIter.getCustomerId() == id){
            checkId++;
            break;
            }
        }
        if(checkId>0){
            System.out.println("Customer with same ID already Exists . Please Try Again!!");
        }
        else{
        System.out.println("Enter Customer Name");
        String name=sc.next();                  //to check that only a string is entered
         Customer customer=new Customer(id,name);
        if(customerList.add(customer)){
         System.out.println("Customer Added Successfully!");
        }
        }
    }
 
 /*
    Method addCarToCustomer
    Adds new car to existing Customer.//
    @param none
    
*/
 public void addCarToCustomer()
 {
        
        int id;
        System.out.println("Enter Customer ID");
        id=sc.nextInt();
        for (Customer custIter : customerList) {
        if(id==custIter.getCustomerId()){
        custIter.addCar();
        }
       
      }
 
 }
 /*
     Method viewCustomeer
    Displays all customers sorted by name.//
    @param none
    
*/
  public void viewCustomers()
  
  {
      if(customerList.size()==0)
      {
           System.out.println("No Customer Found!!!!!!!!");
      }
      Comparator<Customer> comparator = (Customer o1, Customer o2) -> o1.getCustomerName().compareTo(o2.getCustomerName());
      Collections.sort(customerList,comparator);
      for (Customer custIter : customerList) {
      System.out.println("Customer ID: " + custIter.getCustomerId()+ "  Customer Name:" + custIter.getCustomerName());
      custIter.display();    //view customer need to apply sort
      }
  }
/*
     Method listByID
    Displays customer details by getting ID form Admin.//
    @param none
    
*/
    public void listById() {
         int id;
       System.out.println("Enter Customer ID");
        id=sc.nextInt();
        for (Customer custIter : customerList) {
             if(id==custIter.getCustomerId()){
      System.out.println("Customer ID: " + custIter.getCustomerId()+ "  Customer Name:" + custIter.getCustomerName());
      custIter.display(); 
      break;
             }
             
      }
    }
    public void generatePrize()
    {
        
   RandomGenerator.generateRandom(customerList);
        
    }
}
        

