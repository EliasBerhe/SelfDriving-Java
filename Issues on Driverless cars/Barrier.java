/**
 * This class is a Barrier class that describes an object with barrier on left or right side of a road
 * Importance of this class lies of creating a Scenarion object which consider a barrier on road side 
 * 
 * 
 * @author Elias Berhe
 * 
 */

    
public class Barrier{

    private Boolean leftBarrier;
    private Boolean rightBarrier;


     /**
     * Contruct a new Barrier object with specified left and right barrier
     * @param leftBarrier
     * @param rightBarrier
     */
    public Barrier(Boolean leftBarrier,Boolean rightBarrier){
        this.leftBarrier = leftBarrier;
        this.rightBarrier = rightBarrier;

    }
    /**
     * A retriever method that return the leftBarrier filed
     * @return leftBarrier
     */
    public Boolean getLeftBarrier(){
        return leftBarrier;
    }
     /**
     * A retriever method that return the rightBarrier filed
     * @return rightBarrier
     */
    public Boolean getRightBarrier(){
        return rightBarrier;
    }
    /**
     * set the leftBarrier to a new boolean value
     * @param newVal
     */
    public void setLeftBar(boolean newVal){
        leftBarrier = newVal;
    }
    /**
     * set the rightBarrier to a new boolean value
     * @param newVal
     */
    public void setRightBar(boolean newVal){
       
        rightBarrier = newVal;
    }
    
}
