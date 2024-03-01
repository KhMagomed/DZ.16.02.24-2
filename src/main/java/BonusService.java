public class BonusService {
    public int calculate(int amount, boolean registered) {
        int Percent = registered ? 3 : 1;
        int bonus = amount * Percent / 100;
        int limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}