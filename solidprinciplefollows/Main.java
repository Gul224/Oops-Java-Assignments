package solidprinciplefollows;

public class Main {
    public static void main(String[]  args){

        Subscriber subscription = new Subscriber();
        BroadbandPlan broadbandPlan = subscription.getBroadbandTypeObject("DSL");

        broadbandPlan.setSpeed("LOW_SPEED");
        broadbandPlan.setDurationInMonths(6);


    }
}
