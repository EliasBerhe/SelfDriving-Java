
/**
 * This class is a super class that describes an object that is used to represent a generic car and helps give a general blueprint for Selfish, Util and Kant car.
 * Important field for this Car class in a lane, that indicate in which lane(right, left) a car is starting
 * 
 * @author Elias Berhe
 * 
 */

public class Car {
   

    protected String lane;
    /**
     * Contruct a new car object with the specificied lane position
     * @param lane
     */
    public Car(String lane){
        this.lane = lane;
    }

    /**
     * 
     * Returns the number of fatalities that occur in the Scnearion with the car in the specified lane
     * 
     * 
     * @param lane 
     * @param sc
     * @return number of fatalities
     */
    public int numDead(String lane, Scenario sc){
        if (lane.equals("left")){
            if(sc.getBarrier().getLeftBarrier()){
                return sc.getPass();
            }
            else{
                return sc.getPed().getLPed();
            }
        }
        else{
            if(sc.getBarrier().getRightBarrier()){
                if(sc.getBarrier().getRightBarrier()){
                    return sc.getPass();
                }

            }
            else{
                return sc.getPed().getRPed();
            }
        }
      return 0;
    }

    /**
     * Retunrs either "Stay" or "Swerve" indicating if the car should stay in its lane or swerve into the other lane
     * 
     * return "Stay" or "Swerve"
     */
    public String decision(Scenario sc){
        return "Stay";
    }

    /**
     * 
     * Simulates n randomized Scenarios depending the type of Car and returns the average number of fatalities per scenanio
     * 
     * @param c 
     * @param sc
     * @param n
     * @return
     */

    public double caseStudy(Car c, Scenario sc, int n){
        double totalDead = 0;
        String carLane = c.lane;
        for(int i=0;i<=n;i++){
            sc.randomize();
            if (c.decision(sc)=="Stay"){
                
                totalDead = totalDead + numDead(c.lane,sc);
            }
            else{
                if(carLane.equals("Right")){
                    totalDead = totalDead + numDead("Left",sc);
                }
                else{
                    totalDead = totalDead + numDead("Right",sc);
                }

            }

        }
        return totalDead/1000;
    }
}
