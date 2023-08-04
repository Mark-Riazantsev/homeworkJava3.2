public class BmiService {
    public int calculate(int weight, double height) {
        int bmi = (int) (weight / Math.pow(height, 2));

        return bmi;
    }
}

