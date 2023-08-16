package strategy_pattern_sample_v2.method;

public class ChangeVestSuit implements ChangeClother{
    @Override
    public void changeClother() {
        System.out.println("Người này đang mặc vest, so handsome ! ");
    }
}
