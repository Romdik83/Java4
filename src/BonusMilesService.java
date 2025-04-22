public class BonusMilesService {
    int amount = 20;
    int theMile = 1;


    public int calculate(int price) {
        int result;
        result = price / amount * theMile;
     return  result;

    }
}
