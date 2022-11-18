/**
 * This class is a Pedestrian class that describes an object with numnber of pedestrians in each side of a road
 * Importance of this class lies of creating a Scenarion object which consider a pedestrians in side of a road.
 * 
 * 
 * @author Elias Berhe
 * 
 */


public class Pedestrians {
    
        private int leftPedestrian;
        private int rightPedestrian;
    /**
     * Contruct a new Pedestrian object with specified parameters
     * @param leftPedestrian
     * @param rightPedestrian
     */
        public Pedestrians(int leftPedestrian,int rightPedestrian){
            this.leftPedestrian = leftPedestrian;
            this.rightPedestrian = rightPedestrian;
    
        }
    /**
     * A retriever method that return the number of left pedestrians
     * @return leftPedestrian
     */
    
        public int getLPed(){
            return leftPedestrian;
        }
    /**
     * A retriever method that return the number of right pedestrians
     * @return rightPedestrian
     */
        public int getRPed(){
            return rightPedestrian;
        }
        /**
     * set the leftpedestrian number to a new  value
     * @param newVal
     */
        public void setLeftPed(int newVal){
            leftPedestrian = newVal;
        }

        /**
     * set the rightPedestrian number to a new  value
     * @param newVal
     */
        public void setRightPed(int newVal){
            rightPedestrian = newVal;
        }

    
}
