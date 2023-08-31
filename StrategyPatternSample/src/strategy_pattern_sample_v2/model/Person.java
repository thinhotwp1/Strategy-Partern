package strategy_pattern_sample_v2.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import strategy_pattern_sample_v2.method.ChangeClother;

@Data
public abstract class Person {
    private String name;
    private int age;
    private String clother;

    @Getter
    @Setter
    private ChangeClother changeClother = new ChangeClother() {
        @Override
        public void changeClother() {
            System.out.println("Người này đang không mặc gì !!! ");
        }
    };

    public Person() {
    }
}
