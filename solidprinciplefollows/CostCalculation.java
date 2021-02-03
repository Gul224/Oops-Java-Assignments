package solidprinciplefollows;

// follows SRP

public class CostCalculation implements BroadbandCost {
    @Override
    public double getPlanCost(BroadbandPlan plan, int BroadbandFactor) {
        double cost = 0;
        switch (plan.speed){
            case "LOW_SPEED":
                cost = BroadbandFactor * plan.durationInMonths * 250;
                break;
            case "HIGH_SPEED":
                cost = BroadbandFactor * plan.durationInMonths * 350;
                break;
            default:
                System.out.println("Dont support this plan");

        }
        return cost;

    }
}
