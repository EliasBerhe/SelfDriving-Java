//import java.util.*;
/**
 * This class is a sub class that describes an object that is used to represent a car that follows a Selfish value or selfishness towards the life of passengers
 * A Selfish car follows the prinicple that a car will in any scenario protect the life of the passengers.
 * 
 * @author Elias Berhe
 * 
 */
public class SelfishCar extends Car {
    


    public SelfishCar(String lane) {
        super(lane);
        
    }
    /**
     * This method will a make decision for Selfish car when in a sitution that result inevitable harm.
     * 
     * @param sc
     * 
     */
    public  String decision(Scenario sc){

        if(lane.equals("Left")){
        if (sc.getBarrier().getLeftBarrier()){
            return "Swerve";
        }
        else{
            return "Stay";
        }
    }
        else{
            if (sc.getBarrier().getRightBarrier()){
                return "Swerve";
            }
            else{
                return "Stay";
            }
        }
    }

       public static void main(String[] args){

        Barrier barrier = new Barrier(false, true);
        Pedestrians pd  = new Pedestrians(6, 0);
        CrossingSignal sig = new CrossingSignal(true, true);
        Scenario sc = new Scenario(3, barrier,sig,pd);

        SelfishCar car = new SelfishCar("Left");
        //System.out.println(car.decision(sc));

        System.out.println(car.caseStudy(car, sc,1000));

        
       
    }
}
