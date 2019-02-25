/*
 * @author Sahil Puri
 */
package carpurchaseutility.model;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * Customer class to hold details of the Customer
 * Customer will have an id ,name and list of car.
 * 
 *  
 * ArrayList customerCar  will be empty while creating user ,later on user can add car
 * 
 */
public class Customer {
     private final static int HYUNDAI = 1;             //
     private final static int TOYOTA = 2;                  //For getting choices
     private final static int MARUTI = 3;    
    Scanner sc= new Scanner(System.in).useDelimiter("\\n");
    
    private final int customerId;
    private final String customerName;
    ArrayList<Car> customerCar = new ArrayList<>();
    
   /**
	 * This is Constructor of Customer class
	 * @param id of int type 
         * @param name of String Type
	 * 
	 * 
	 */
    public Customer(int id, String name) {
        customerId = id;
        customerName = name;
        } 
    /**
     * This method used to get id of Customer
    
     * @return customerId of current object of int type
     */
    public int getCustomerId()
    {return customerId;
    }
    /**
     * This method used to get name of Customer
    
     * @return customerName of current object of String type
     */
    public String getCustomerName()
    {return customerName;
    }

 

    /*
    Method addCar
    Adds new car to Current Customer.//
    @param none
    
*/
   
    public void addCar()
    {
        
        System.out.println("Enter Car Type.");
        System.out.println("1.Hyundai");
        System.out.println("2.Toyota");
        System.out.println("3.Maruti");
        int choice = sc.nextInt();
        System.out.println("Enter Car Id");
        int carId=sc.nextInt();
        System.out.println("Enter Car Model");
        String model=sc.next();
        System.out.println("Enter Car Price");
        double price=sc.nextDouble();
        switch(choice)
        {
            case HYUNDAI:customerCar.add(new Hyundai(carId,model,price));
                         break;
            case TOYOTA:customerCar.add(new Toyota(carId,model,price));
                         break;
            case MARUTI:customerCar.add(new Maruti(carId,model,price));
                         break;
        }
         System.out.println("Car Added Successfully.");
    }
    /*
    Method diplay
    Displays cars of Current Customer.//
    @param none
    
*/
    public void display()
    {
        
   
        for(Car carList : customerCar){
        carList.display();
    }
    }
    
    
}
 

