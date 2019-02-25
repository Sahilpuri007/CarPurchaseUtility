/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpurchaseutility.util;

import carpurchaseutility.model.Customer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public final class RandomGenerator {
    
    /*
     Method generatePrizes
    Generate prizes for Customers.//
    @param none
    
*/
    public static void generateRandom(ArrayList<Customer> customerList) {
       Scanner sc = new Scanner(System.in);
       ArrayList<Integer> adminChoosedIds = new ArrayList<>();
       ArrayList<Customer> customers = customerList;
       ArrayList<Integer> randomIds = new ArrayList<>();
       System.out.println("Enter Three Customer Id:");
       for(int i=0;i<3;i++)
       {
            System.out.println("Enter "+ (i+1) +" Customer Id:");
           adminChoosedIds.add(sc.nextInt());
       }
       Collections.shuffle(customers);
       if(customers.size() <= 6)
       {
           for(Customer c : customerList)
           {
               randomIds.add(c.getCustomerId());
           }
           
           
           randomIds.retainAll(adminChoosedIds);
          for(int i=0;i<randomIds.size();i++)
       {
           System.out.println("The Winners are Customers with following ids: " + randomIds.get(i));
       }
       }
       else{
           
           for(int i=0;i<6;i++)
           {
               randomIds.add(customerList.get(i).getCustomerId());
           }
           randomIds.retainAll(adminChoosedIds);
          randomIds.retainAll(adminChoosedIds);
          for(int i=0;i<randomIds.size();i++)
       {
           System.out.println("The Winners are Customers with following ids: " + randomIds.get(i));
       }
       }
    }
    
}
