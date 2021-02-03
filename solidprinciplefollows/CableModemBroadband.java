package solidprinciplefollows;

// this class follows Liskov substitution principle
public class CableModemBroadband extends BroadbandPlan implements SetTopBox{

    @Override
    public void getBroadbandCost(BroadbandPlan plan){
        CostCalculation cost = new CostCalculation();
        double calculatedCost = cost.getPlanCost(plan, 3 );
        System.out.println("Cost for plan you have selected will be " + calculatedCost);
    }

    @Override
    public void getSetTopBoxCost() {
    System.out.println("You have to opt out separately for this");
    double setTopBoxCost = 700;
    System.out.println("You wil be charged " + setTopBoxCost + "Monthly");
    }
}
