package solidviolatesPrinciple;

// violates Interface Segregation Principle
public interface Broadband {
    void getBroadbandCost(BroadbandPlan plan);

    void getSetTopBoxTvCost();
}
