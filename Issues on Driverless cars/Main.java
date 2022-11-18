
import java.util.*;
public class Main {
    

    // not finished yet!!
    public static void main(String[] args){

        System.out.println("Ethical Issues with Driverless Vehicles");
        System.out.println();
        System.out.println("Autonomous vehicles hold the promise of dramatically decreasing road congestion while also significantly reducing the number and severity of crashes");
        System.out.println();
        System.out.println("With these benefits comes a challenge: what should driverless vehicles do in a dangerous situtations that involve inevitiable harm,  we going to see different algorithm that control an autonomous vehicles's decision that would function like ethics of human driver");
        //Scanner start
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ethical principles you want your car to have, please only type in A, B or C");
        System.out.println("A. SelfishCar       B. Utililatarian Car        C. KantCar");
        String str = sc.nextLine();
        //System.out.println("The String input using Scanner class is: " +str);
        if(str.equals("A")){
            System.out.println("lets analyze a selfishCar");
            System.out.println("Selfish Car in a any scenario will protect the passengers in the vehicles");
            System.out.println("Do want to,");
            System.out.println("A. Run n number of random scenario              B. Create your own scenario");
            String str2 = sc.nextLine();
            if(str2.equals("A")){
                System.out.println("How many number of scenarios would you want to run");
                int n = sc.nextInt();
                Barrier barrier = new Barrier(false, true);
                 Pedestrians pd  = new Pedestrians(6, 0);
                CrossingSignal sig = new CrossingSignal(true, true);
                 Scenario scenario = new Scenario(3, barrier,sig,pd);

                SelfishCar car = new SelfishCar("Left");
        //System.out.println(car.decision(sc));

                 System.out.println("For situation where there is inevitable harm, the average death for " + n + " different sceario is " +car.caseStudy(car, scenario,n));

            }
            if(str2.equals("A")){
                
            }
        }
    }
}
