public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10000;
        int amount = 20;
        int theMiles = 1;

        System.out.println();
        System.out.println(service.calculate(10000, 20, 1));

        System.out.println();
        System.out.println(service.calculate(16254, 20, 1));

        System.out.println();
        System.out.println(service.calculate(18000, 20, 1));
    }
}