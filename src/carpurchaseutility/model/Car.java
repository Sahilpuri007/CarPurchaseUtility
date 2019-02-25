
package carpurchaseutility.model;
 

/**
 *
 * @author Sahil Puri
 *
 * This is an abstract class which defines the structure of a Car.
 * In this class we declare a  integer  id, a String model and a integer price
 * 
 * An abstract method resaleValue() which will be override by every Car
 * 
 */
abstract public class Car{
    
     int carId;
     String carModel;
     double carPrice;
     /**
     * This method used to get id of Car
     * 
     * @return Id of current object of int type
     */
     int getId()
    {
        return carId;
    }
     
    /**
     * This method used to get Model of Car
     * 
     * @return Model of current object of String type
     */
    
    String getModel()
    {
        return carModel;
    }
    
    /**
     * This method used to get Price of Car
     * 
     * @return Price of current object of double type
     */
    double getPrice()
    {
        return carPrice;
    }
    /**
	 * This method used to display the Details of car
	 * 
	 * 
	 * @return nothing
	 */
    void display()
    { System.out.println("Car ID :" + getId());
        System.out.println("Car Model :" + getModel());
        System.out.println("Car Price :" + getPrice());
        System.out.println("Car Resale Value :" + calcResaleValue());
    }
    /*
    * An abstract method calcResaleValue() which will be override by every Car
    */
    abstract double calcResaleValue();
    
    
 }
/**
 * 
 * 
 *This Class extends the property of Car class 
 *and Override calcResaleValue() which is a abstract method
 *
 */
class Hyundai extends Car{
    	/**
	 * This is Constructor of Hyundai class
	 * @param id of int type 
         * @param model of String Type
	 * @param price of double type 
	 * 
	 * 
	 */
    Hyundai(int id,String model,double price)
    {
        carId=id;
        carModel=model;
        carPrice=price;
    }
    /**
	 * This method calculates the resale value of car
	 * 
	 * * 
	 * @return double type value resale value of car
	 */
    @Override
    double calcResaleValue()
    {
        return  carPrice*0.40;
    }

   

   
}
class Toyota extends Car{
    /**
	 * This is Constructor of Toyota class
	 * @param id of int type 
         * @param model of String Type
	 * @param price of double type 
	 * 
	 * 
	 */
    Toyota(int id,String model,double price)
    {
        carId=id;
        carModel=model;
        carPrice=price;
    }
    /**
	 * This method calculates the resale value of car
	 * 
	 * * 
	 * @return double type value resale value of car
	 */
    
    @Override
    double calcResaleValue()
    {
        return  carPrice*0.80;
    }

    
    
}
class Maruti extends Car{
    /**
	 * This is Constructor of Maruti class
	 * @param id of int type 
         * @param model of String Type
	 * @param price of double type 
	 * 
	 * 
	 */
    Maruti(int id,String model,double price)
    {
        carId=id;
        carModel=model;
        carPrice=price;
    }
     /**
	 * This method calculates the resale value of car
	 * 
	 * * 
	 * @return double type value resale value of car
	 */
    
    @Override
    double calcResaleValue()
    {
        return carPrice*0.60;
    }

   
}


