public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate (55.5, 1.68);
        System.out.println(bmi);
    }

}
