
package carpurchaseutility;
 

/**
 *
 *
 */
abstract class Car{
    
     int carId;
     String carModel;
     double carPrice;
    
     int getId()
    {
        return carId;
    }
    String getModel()
    {
        return carModel;
    }
    double getPrice()
    {
        return carPrice;
    }
    void display()
    { System.out.println("Car ID :" + getId());
        System.out.println("Car Model :" + getModel());
        System.out.println("Car Price :" + getPrice());
        System.out.println("Car Resale Value :" + calcResaleValue());
    }
    abstract double calcResaleValue();
    
    
 }
class Hyundai extends Car{
    
    Hyundai(int id,String model,double price)
    {
        carId=id;
        carModel=model;
        carPrice=price;
    }
    
    @Override
    double calcResaleValue()
    {
        return  carPrice*0.40;
    }

   

   
}
class Toyota extends Car{
    
    Toyota(int id,String model,double price)
    {
        carId=id;
        carModel=model;
        carPrice=price;
    }
    
    
    @Override
    double calcResaleValue()
    {
        return  carPrice*0.80;
    }

    
    
}
class Maruti extends Car{
    
    Maruti(int id,String model,double price)
    {
        carId=id;
        carModel=model;
        carPrice=price;
    }
     
    
    @Override
    double calcResaleValue()
    {
        return carPrice*0.60;
    }

   
}


