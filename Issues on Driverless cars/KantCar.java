/**
 * This class is a sub class that describes an object that is used to represent a car that follow kant's Ethical principles
 * A Kant car follows the prinicple that a car will only serve(or make a decision to move from lane) if only if swerving is the only option that result in zero fatatlities.
 * 
 * @author Elias Berhe
 * 
 */

public class KantCar extends Car {

    public KantCar(String lane) {
        super(lane);
        
    }
    /**
     * This method will a make decision of Kant car when in a sitution that result inevitable harm.
     * This method will make a decision based on Kant's ethical principle in such scenario
     * 
     * @param sc
     * 
     */
    public  String decision(Scenario sc){
        if(lane.equals("Left")){
            if(!sc.getBarrier().getRightBarrier()&& sc.getPed().getRPed()==0){
                return "Swerve";
            }
            else{
                return "Stay";
            }
        }
        else{
            if(!sc.getBarrier().getLeftBarrier()&& sc.getPed().getLPed()==0){
                return "Swerve";
            }
            else{
                return "Stay";
            }
        }
    }

       public static void main(String[] args){

        Barrier barrier = new Barrier(false, false);
        Pedestrians pd  = new Pedestrians(6, 0);
        CrossingSignal sig = new CrossingSignal(true, true);
        Scenario sc = new Scenario(3, barrier,sig,pd);

        KantCar car = new KantCar("Left");
        
       System.out.println(car.caseStudy(car, sc,1000));

        
       
    }
}
