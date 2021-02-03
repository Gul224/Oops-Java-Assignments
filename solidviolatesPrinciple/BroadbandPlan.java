package solidviolatesPrinciple;

// Violates SRP
public class BroadbandPlan implements Broadband {
   public String speed;
   public int durationInMonths;
   public BroadbandPlan(){

   }
   public BroadbandPlan(String speed, int durationInMonths){
       this.speed = speed;
       this.durationInMonths = durationInMonths;

   }
   void getSubscription(String BroadbandType){
      if (BroadbandType.equals("DSL")){
          System.out.println("You have opted for DSL broadband");

      }
      else if (BroadbandType.equals("CableMode")){
          System.out.println("You have opted for DSL broadband");
      }
   }

    @Override
    public void getBroadbandCost(BroadbandPlan plan) {
        double calculatedCost  = 2*plan.durationInMonths*3;

        System.out.println("Cost for plan you have selected will be " + calculatedCost);
    }

    // violates OCP
    @Override
    public void getSetTopBoxTvCost() {
        System.out.println("You have to opt out separately for this ");
        double setTopBoxCost = 700;
        System.out.println("You will be charged " + setTopBoxCost + " monthly");
    }
    public void setSpeed(String low_speed) {
    }
    public void setDurationInMonths(int i) {
    }
}
