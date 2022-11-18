/**
 * This class is a Crossing Signal class that describes an object with signal to cross a road on left or right side
 * Importance of this class lies of creating a Scenarion object which consider a A crossing Signal on road side 
 * 
 * 
 * @author Elias Berhe
 * 
 */


public class CrossingSignal{
    private Boolean leftSignal;
    private Boolean rightSignal;
/**
     * Contruct a new CrossingSignal object with specified left and right signals
     * @param leftSignal
     * @param rightSignal
     */
    public CrossingSignal(Boolean leftSignal,Boolean rightSignal){
        this.leftSignal = leftSignal;
        this.rightSignal = rightSignal;

    }
     /**
     * A retriever method that return the leftSignal field
     * @return leftSignal
     */

    public Boolean getLS(){
        return leftSignal;
    }
      /**
     * A retriever method that return the rightSignal field
     * @return rightSignal
     */
    public Boolean getRS(){
        return rightSignal;
    }
    /**
     * set the leftSignal to a new boolean value
     * @param newVal
     */
    public void setLeftSig(boolean newVal){
        leftSignal = newVal;
    }
      /**
     * set the rightSignal to a new boolean value
     * @param newVal
     */
    public void setRightSig(boolean newVal){
        rightSignal = newVal;
    }
}