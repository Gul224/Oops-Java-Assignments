package solidprinciplefollows;

// follows SRP
public class BroadbandPlan  implements Broadband{
    
    public String speed;
    public int durationInMonths;
    
    @Override
    public void getBroadbandCost(BroadbandPlan plan) {
    CostCalculation cost = new CostCalculation();
    double calculatedCost = cost.getPlanCost(plan, 1);


    System.out.println("Cost for plan you have selected will be: " + calculatedCost);
    }

    public void setSpeed(String low_speed) {
    }

    public void setDurationInMonths(int i) {
    }
}
