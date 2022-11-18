/**
 * This class is a sub class that describes an object that is used to represent a car that follows a Utilitarian  Ethical principle
 * A Util car follows the prinicple that a car make a decision that result in a few fatatlities 
 * 
 * @author Elias Berhe
 * 
 */
public class UtilCar extends Car{

    public UtilCar(String lane) {
        super(lane);
        
    }

    public  String decision(Scenario sc){

        
            if(this.numDead("Left", sc)<=this.numDead("Right", sc)){
                if(lane.equals("Left")){
                    return "Stay";
                }
                else{
                    return "Swerve";
                }
            }
            else{
                if(lane.equals("Right")){
                    return "Stay";
                }
                else{
                    return "Swerve";
                }
            }
      
    }
      /**
     * This method will a make decision of Util car when in a sitution that result inevitable harm.
     * This method will make a decision based on Utilitarian ethical principle in such scenario
     * 
     * @param sc
     * 
     */

       public static void main(String[] args){

        Barrier barrier = new Barrier(false, true);
        Pedestrians pd  = new Pedestrians(6, 0);
        CrossingSignal sig = new CrossingSignal(true, true);
        Scenario sc = new Scenario(3, barrier,sig,pd);

        UtilCar car = new UtilCar("Left");
        //System.out.println(car.decision(sc));

        System.out.println(car.caseStudy(car, sc,1000));

        
       
    }
}
