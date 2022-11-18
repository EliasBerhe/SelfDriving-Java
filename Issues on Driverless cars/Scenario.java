/**
 * This class describes an Scenario object that is used to model scenarios that a driverless car might encounter
 *
 * A scenario will consider number of Passenger, a Barrier object, a Crossing Signal object, and Pedestrial object,
 * 
 * @author Elias Berhe
 * 
 */
import java.util.*;
public class Scenario{
    private int passenger;
    private Barrier barrier;
    private CrossingSignal signal;
    private Pedestrians pedestrian;

   /**
     * Contruct a new Scenario object with the specified parameters.
     * @param passenger
     * @param barrier
     * @param signal
     * @param pedestrian 
     */
    public Scenario (int passenger, Barrier barrier, CrossingSignal signal,Pedestrians pedestrian){
        this.passenger = passenger;
        this.barrier = barrier;
        this.signal = signal;
        this.pedestrian = pedestrian;
    }
      /**
     * A retriever method that return number of passengers
     * @return passenger
     */

    public int getPass(){
        return passenger;
    }
    /**
     * A retriever method that return Barrier object
     * @return barrier
     */
    public Barrier getBarrier(){
        return barrier;
    }
    /**
     * A retriever method that return CrossingSignal object
     * @return signal
     */
    public CrossingSignal getSignal(){
        return signal;
    }
    /**
     * A retriever method that return Pedestrians object
     * @return pedestrian
     */
    public Pedestrians getPed(){
        return pedestrian;
    }
    /**
     * This method randomizes the values of a Scenario object's field
     * In order to perfom simulations, we will neeed lots of different scenarios, To facilate this, we need a randomize method
     */
    
    public void randomize(){
        Random rand = new Random();

        int num = rand.nextInt(5);
        this.passenger= num;

        if(rand.nextBoolean()){
            this.barrier.setLeftBar(rand.nextBoolean());
            this.barrier.setRightBar(!this.barrier.getLeftBarrier());
        }
        else{
            this.barrier.setLeftBar(false);
            this.barrier.setRightBar(false);
        }
        if(!this.barrier.getLeftBarrier()){
            this.pedestrian.setLeftPed(rand.nextInt(7));
            this.signal.setLeftSig(rand.nextBoolean());

        }
        else{
            this.pedestrian.setLeftPed(0);
            this.signal.setLeftSig(false);
        }
        if(!this.barrier.getRightBarrier()){
            this.pedestrian.setRightPed(rand.nextInt(7));
            this.signal.setRightSig(rand.nextBoolean());

        }
        else{
            this.pedestrian.setRightPed(0);
            this.signal.setRightSig(false);
        }


    }



        

}