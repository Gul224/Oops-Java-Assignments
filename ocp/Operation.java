package ocp;

public class Operation {
    public double calculate(double a1, double a2, String operationType) {
        switch (operationType) {
            case "+": {
                return a1 + a2;

            }
            case "-" :{
                return a1-a2;
            }
            default:
        }
        return 0;
    }
}
