package strategy_pattern_sample_v2;

import strategy_pattern_sample_v2.method.ChangeClother;
import strategy_pattern_sample_v2.method.ChangePyzama;
import strategy_pattern_sample_v2.method.ChangeVestSuit;
import strategy_pattern_sample_v2.model.Doctor;
import strategy_pattern_sample_v2.model.Person;
import strategy_pattern_sample_v2.model.Teacher;

public class StrategyPatternSamplev2 {

    public static void main(String[] args) {
        System.out.println("-----------------------------------------------");

        Person noBehavior = new Doctor();
        noBehavior.getChangeClother().changeClother();
        System.out.println("-----------------------------------------------");

        Person doctor = new Doctor();
        ChangeClother changeSuitVest = new ChangeVestSuit();
        doctor.setChangeClother(changeSuitVest);
        doctor.getChangeClother().changeClother();
        System.out.println("-----------------------------------------------");

        Person teacher = new Teacher();
        ChangeClother changePizama = new ChangePyzama();
        teacher.setChangeClother(changePizama);
        teacher.getChangeClother().changeClother();
        System.out.println("-----------------------------------------------");

        System.out.println("Ở ví dụ trên, một người có thể là doctor hoặc teacher có thể thay đổi " +
                "linh hoạt cách mặc quần áo ngay trong quá trình runtime, pattern này rất có ích với các " +
                "hành vi (hay method) có biến thể, với nguyên lý tách hành vi ra khỏi object sẽ giúp tăng tính" +
                " linh hoạt và dễ bảo trì vì khi cần thêm một method không cần đụng tới đối tượng gốc, cũng như mở " +
                "rộng dễ dàng mà không phải thay đổi cấu trúc của đối tượng. ");
    }
}
