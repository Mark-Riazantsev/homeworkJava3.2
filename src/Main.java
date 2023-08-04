public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87;
        System.out.println("Рост: " + height + " м ");
        int weight = 98;
        System.out.println("Вес: " + height + " кг ");
        int bmi = service.calculate(weight, height);
        System.out.println("Body mass index: " + bmi);
    }
}