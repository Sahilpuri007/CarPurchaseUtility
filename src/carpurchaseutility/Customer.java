/*
Class for customer
 */
package carpurchaseutility;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * 
 * 
 * Customer class to hold details of the Customer
 */
public class Customer {
     private final static int HYUNDAI = 1;             //
     private final static int TOYOTA = 2;                  //For getting choices
     private final static int MARUTI = 3;    
    Scanner sc= new Scanner(System.in).useDelimiter("\\n");
    
    private final int customerId;
    private final String customerName;
    ArrayList<Car> customerCar = new ArrayList<>();
    
   
    Customer(int id, String name) {
        customerId = id;
        customerName = name;
        } 
    public int getCustomerId()
    {return customerId;
    }
    
    public String getCustomerName()
    {return customerName;
    }

 

    
   
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
    public void display()
    {
        
   
        for(Car carList : customerCar){
        carList.display();
    }
    }
    
}
 

